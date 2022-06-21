package com.company;

public abstract class Paciente {

    private String fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean esPrimeraConsulta;

    public Paciente(String fechaNacimiento, String nombre, String apellido, Boolean esPrimeraConsulta) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esPrimeraConsulta = esPrimeraConsulta;
    }

    public Boolean evaluacionInicial(){
        if(esPrimeraConsulta){
            return true;
        }
        return false;
    }
}
