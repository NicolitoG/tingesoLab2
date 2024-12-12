import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import userService from "../services/user.service";
import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import FormControl from "@mui/material/FormControl";
import Typography from "@mui/material/Typography";

const Simulation = () => {
    const [amountP, setAmountP] = useState(0);
    const [interestRate, setInterestRate] = useState(0);
    const [years, setYears] = useState(0);
    const [result, setResult] = useState(null);
    const [feedbackMessage, setFeedbackMessage] = useState("");

    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await userService.simulation({
                amountP, interestRate, years
            });
            setResult(response.data);
            setFeedbackMessage("Simulación exitosa.");
        } catch (error) {
            setFeedbackMessage("Error: Ha ocurrido un problema al intentar realizar la simulación");
            console.error('Error fetching the amount:', error);
        }
    };

    return (
        <div>
            <h1>Simulación</h1>

            {feedbackMessage && (
                <Typography color={feedbackMessage.startsWith("Error") ? "error" : "primary"}>
                    {feedbackMessage}
                </Typography>
            )}

            <FormControl fullWidth sx={{ mb: 2 }}>
                <TextField
                    id="amountP"
                    label="Monto"
                    type="number"
                    value={amountP}
                    variant="outlined"
                    onChange={(e) => setAmountP(e.target.value)}
                    helperText="Ej. 1000000"
                    required
                />
            </FormControl>

            <FormControl fullWidth sx={{ mb: 2 }}>
                <TextField
                    id="interestRate"
                    label="Tasa de Interés"
                    type="number"
                    value={interestRate}
                    variant="outlined"
                    onChange={(e) => setInterestRate(e.target.value)}
                    helperText="Ej. 5"
                    required
                />
            </FormControl>

            <FormControl fullWidth sx={{ mb: 2 }}>
                <TextField
                    id="years"
                    label="Años"
                    type="number"
                    value={years}
                    variant="outlined"
                    onChange={(e) => setYears(e.target.value)}
                    helperText="Ej. 10"
                    required
                />
            </FormControl>

            <Button
                variant="contained"
                color="primary"
                onClick={handleSubmit}
                fullWidth
                sx={{ mt: 2 }}
                disabled={!amountP || !interestRate || !years}
            >
                Simular
            </Button>

            {result && (
                <Typography sx={{ mt: 2 }}>
                    Monto a pagar mensualmente: {result}
                </Typography>
            )}
        </div>
    );
};

export default Simulation;
