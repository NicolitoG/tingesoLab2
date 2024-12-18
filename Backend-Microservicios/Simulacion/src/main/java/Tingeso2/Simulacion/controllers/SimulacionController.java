package Tingeso2.Simulacion.controllers;

import Tingeso2.Simulacion.services.SimulacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/simulation")

public class SimulacionController {
    @Autowired
    SimulacionService simulacionService;

    @GetMapping("/amount/{amountP}/{interestRate}/{years}")
    ResponseEntity<Float> getAmount(@PathVariable int amountP ,@PathVariable float interestRate,@PathVariable int years){
        float amount = SimulacionService.getAmount(amountP, interestRate, years);
        return ResponseEntity.ok(amount);
    }

}
