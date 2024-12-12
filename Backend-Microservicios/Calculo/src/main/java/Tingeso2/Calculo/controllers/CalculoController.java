package Tingeso2.Calculo.controllers;

import Tingeso2.Calculo.services.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/calculate")

public class CalculoController {
    @Autowired
    CalculoService calculoService;

}
