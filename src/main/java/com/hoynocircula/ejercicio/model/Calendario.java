package com.hoynocircula.ejercicio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Calendario {

    @Id
    private Integer id;

    @Column
    private String dia;

    @Column
    private Integer digito;

    @Column
    private Boolean estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Calendario{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", digito=" + digito +
                ", estado=" + estado +
                '}';
    }
}
