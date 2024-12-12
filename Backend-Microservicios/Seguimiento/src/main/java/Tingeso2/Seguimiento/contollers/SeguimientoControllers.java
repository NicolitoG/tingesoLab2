package Tingeso2.Seguimiento.contollers;

import Tingeso2.Seguimiento.services.SeguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tracing")

public class SeguimientoControllers {
    @Autowired
    SeguimientoService seguimientoService;
}
