package com.grupo5.retog5v11.servicio;


import com.grupo5.retog5v11.entidad.Client;
import com.grupo5.retog5v11.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    //peticion GET
    public List<Client> getClient(){
        return repository.findAll();
    }
    //peticion POST
    public Client saveClient(Client client){
        return repository.save(client);
    }


}
