package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Instituto instituto = new Instituto();

        OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstance();

        instituto.agregarOfertaAcademica(ofertaAcademicaFactory.generarOfertaAcademica("FRONTEND"));
        instituto.agregarOfertaAcademica(ofertaAcademicaFactory.generarOfertaAcademica("BACKEND"));
        instituto.agregarOfertaAcademica(ofertaAcademicaFactory.generarOfertaAcademica("FULLSTACK"));

        instituto.generarInforme();
    }
}
