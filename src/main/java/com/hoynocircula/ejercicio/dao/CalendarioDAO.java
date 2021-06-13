package com.hoynocircula.ejercicio.dao;

import com.hoynocircula.ejercicio.model.Calendario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CalendarioDAO extends CrudRepository<Calendario, Integer> {

    Optional<Calendario> findByDiaAndDigitoAndEstado(String dia, int digito, Boolean estado);
}
