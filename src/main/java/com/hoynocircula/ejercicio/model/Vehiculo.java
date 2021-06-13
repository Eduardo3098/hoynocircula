package com.hoynocircula.ejercicio.model;

import javax.persistence.*;

@Entity
public class Vehiculo {

    @Id
    private String placa;

    @Column
    private String color;

    @Column
    private String modelo;

    @Column
    private String chasis;

    @Column
    private String anio;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chasis='" + chasis + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}
