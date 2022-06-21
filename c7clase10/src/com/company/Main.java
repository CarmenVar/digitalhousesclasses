package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Socio socio = new Socio("1","Tincho",2000.0,"Rugby");
        Socio socio2 = new Socio("1","Tincho",200000.0,"Natacion");

        Socio socioHabilitado= new SocioHabilitado("2","Wanda",1500.0,"Padel",550.0);

        System.out.println(socioHabilitado.calcularCuotaMensual());

        System.out.println(socio);

        System.out.println(socio.equals(socio2));

    }
}
