package com.hoynocircula.ejercicio.dao;

import com.hoynocircula.ejercicio.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoDAO extends JpaRepository<Vehiculo, String> {
}
