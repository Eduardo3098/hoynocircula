package com.hoynocircula.ejercicio.rest;

import com.hoynocircula.ejercicio.dao.VehiculoDAO;
import com.hoynocircula.ejercicio.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("vehiculos")
public class VehiculoRest {

    @Autowired(required = true)
    private VehiculoDAO vehiculoDAO;

    @PostMapping("/guardar")
    public HttpStatus guardar(@RequestBody Vehiculo vehiculo) {
        System.out.println("Reques: " + vehiculo);
        vehiculoDAO.save(vehiculo);
        return HttpStatus.OK;
    }

    @GetMapping("/buscar/{placa}")
    public Optional<Vehiculo> buscar(@PathVariable("placa") String placa) {
        return vehiculoDAO.findById(placa);
    }
}
