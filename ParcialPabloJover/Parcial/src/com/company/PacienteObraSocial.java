package com.company;

public class PacienteObraSocial extends Paciente implements Comparable{

    private String nombreObraSocial;
    private Integer numeroDeAsociado;

    public PacienteObraSocial(String fechaNacimiento, String nombre, String apellido, Boolean esPrimeraConsulta, String nombreObraSocial, Integer numeroDeAsociado) {
        super(fechaNacimiento, nombre, apellido, esPrimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }


    @Override
    public int compareTo(Object object) {

        PacienteObraSocial otroPacienteObraSocial = (PacienteObraSocial) object;

        if (this.numeroDeAsociado > otroPacienteObraSocial.numeroDeAsociado){
            return 1;
        }else if(this.numeroDeAsociado < otroPacienteObraSocial.numeroDeAsociado){
            return -1;
        }
        return 0;
    }
}
