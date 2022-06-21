package com.company;

import java.util.Objects;

public class Socio{

    private String numeroDeSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroDeSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroDeSocio = numeroDeSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCuotaMensual(){
        return cuotaMensual;
    }

    @Override
    public String toString(){
        return "hola mi nombre es " + nombre + " y juego al " + actividad;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Socio socio = (Socio) object;
        return Objects.equals(numeroDeSocio, socio.numeroDeSocio) &&
                Objects.equals(nombre, socio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeSocio);
    }
}
