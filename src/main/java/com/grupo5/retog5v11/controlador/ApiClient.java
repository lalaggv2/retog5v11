package com.grupo5.retog5v11.controlador;

import com.grupo5.retog5v11.entidad.Client;
import com.grupo5.retog5v11.servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Client")
public class ApiClient {
    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> findAllClients(){
        return service.getClient();
    }
    @PostMapping("/save")
    public ResponseEntity saveClient(@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
}
