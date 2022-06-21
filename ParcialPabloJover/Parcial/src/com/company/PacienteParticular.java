package com.company;

public class PacienteParticular extends Paciente {

    private Double precioConsulta;
    private Integer dni;

    public PacienteParticular(String fechaNacimiento, String nombre, String apellido, Boolean esPrimeraConsulta, Double precioConsulta, Integer dni) {
        super(fechaNacimiento, nombre, apellido, esPrimeraConsulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }
}
