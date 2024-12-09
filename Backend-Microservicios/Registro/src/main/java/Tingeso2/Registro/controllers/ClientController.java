package Tingeso2.Registro.controllers;

import Tingeso2.Registro.entities.ClientEntity;
import Tingeso2.Registro.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
@CrossOrigin("*")
public class ClientController{
    @Autowired
    ClientService clientService;
    @GetMapping("/list")
    public ResponseEntity<List<ClientEntity>> listClients() {
        try {
            List<ClientEntity> clients = clientService.getClients();
            System.out.println(clients);
            return ResponseEntity.ok(clients);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @PostMapping("/register")
    public ResponseEntity<ClientEntity> registerClient(@RequestBody ClientEntity client) {
        try {
            ClientEntity savedClient = clientService.saveClient(client);
            return ResponseEntity.ok(savedClient);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginClient(@RequestBody ClientEntity client) {
        String rut = client.getRut();
        String name = client.getName();

        return clientService.login(rut, name)
                .map(foundClient -> new ResponseEntity<>("Login exitoso", HttpStatus.OK))
                .orElse(new ResponseEntity<>("Error: RUT o nombre incorrecto", HttpStatus.UNAUTHORIZED));
    }
}

