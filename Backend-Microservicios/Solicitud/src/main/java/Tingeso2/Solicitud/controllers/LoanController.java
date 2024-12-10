package Tingeso2.Solicitud.controllers;

import Tingeso2.Solicitud.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/loan")
@CrossOrigin("*")

public class LoanController {
    @Autowired
    LoanService loanService;
}
