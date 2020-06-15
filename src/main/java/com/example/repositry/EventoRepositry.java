package com.example.repositry;

import com.example.modelos.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepositry extends CrudRepository<Evento,String> {
    Evento findByCodigo(long codigo);
}
