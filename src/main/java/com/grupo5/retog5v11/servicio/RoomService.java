package com.grupo5.retog5v11.servicio;

import com.grupo5.retog5v11.entidad.Room;
import com.grupo5.retog5v11.repositorio.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repository;

    public List<Room> getRooms(){
        return repository.findAll();
    }

    public Room saveRoom(Room room){
        return repository.save(room);
    }
}
