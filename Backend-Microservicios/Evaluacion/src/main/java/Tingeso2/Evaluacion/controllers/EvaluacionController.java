package Tingeso2.Evaluacion.controllers;

import Tingeso2.Evaluacion.services.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/evaluation")
@CrossOrigin("*")

public class EvaluacionController {
    @Autowired
    EvaluacionService evaluacionService;
}
