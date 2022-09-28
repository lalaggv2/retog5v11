package com.grupo5.retog5v11.controlador;

import com.grupo5.retog5v11.entidad.Message;
import com.grupo5.retog5v11.servicio.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Message")
public class ApiMessage {
        @Autowired
        private MessageService service;

        @GetMapping("/all")
        public List<Message> findAllMessages(){
            return service.getMessages();
        }
        @PostMapping("/save")
        public ResponseEntity saveMessages(@RequestBody Message message){
            service.saveMessages(message);
            return ResponseEntity.status(201).build();
        }
    }

