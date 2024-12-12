import httpClient from "../http-common";

const register = (data) => {
    console.log("data: ", data);
    return httpClient.post("/api/v1/client/register", data);
}

const login = (data) => {
    return httpClient.post("/api/v1/client/login", data);
}

const simulation = (amountP, interestRate, years) => {
    return httpClient.get(`/api/v1/simulation/amount/${amountP}/${interestRate}/${years}`);
}


export default {register, login, simulation};