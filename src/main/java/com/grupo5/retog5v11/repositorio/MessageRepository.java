package com.grupo5.retog5v11.repositorio;

import com.grupo5.retog5v11.entidad.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long>{
}
