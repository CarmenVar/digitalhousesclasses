package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PacienteParticular pacienteParticular = new PacienteParticular("08-02-1987","Pablo", "Jover",true,1500.0,32785591);
        PacienteObraSocial pacienteObraSocial = new PacienteObraSocial("29-09-1986","Florencia", "Fernandez", false,"Galeno", 150 );
        PacienteObraSocial pacienteObraSocial1 = new PacienteObraSocial("05-05-1980", "Luis", "Gutierrez", true, "Medife", 100);

        Consulta consulta = new Consulta(pacienteParticular,"01-04-2022","10:50", "Dermatologia");

        System.out.println(pacienteObraSocial.compareTo(pacienteObraSocial1));
        System.out.println(pacienteParticular.evaluacionInicial());
    }
}
