package com.grupo5.retog5v11.servicio;


import com.grupo5.retog5v11.entidad.Message;
import com.grupo5.retog5v11.repositorio.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    //get
    public List <Message> getMessages(){
        return repository.findAll();
    }
    //post
    public Message saveMessages(Message message){
        return repository.save(message);
    }
}
