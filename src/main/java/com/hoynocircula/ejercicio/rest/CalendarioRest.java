package com.hoynocircula.ejercicio.rest;

import com.hoynocircula.ejercicio.model.Calendario;
import com.hoynocircula.ejercicio.dao.CalendarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("calendario")
public class CalendarioRest {

    @Autowired
    private CalendarioDAO calendarioDAO;

    @GetMapping("/validar/{placa}/{fecha}")
    public Optional<Calendario> buscar(@PathVariable("placa") String placa, @PathVariable("fecha") String fecha) throws ParseException {

        String dia = new SimpleDateFormat("EEEE").format(new Date());
        int digito = Integer.parseInt(placa.substring(placa.length()-1));

        return calendarioDAO.findByDiaAndDigitoAndEstado(dia, digito, Boolean.TRUE);
    }
}
