package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alumno alumno1 = new Alumno("Rodrigo", "Irrera", "AB108");
        Alumno alumno2 = new Alumno("Fernando", "Irrera", "AB109");
        Parcial parcial1 = new Parcial("Examen1", "POO", 5.0, alumno1, 4, 1);
        System.out.println(parcial1.estaAprobado());
        System.out.println(parcial1.esPosibleSeguirRecuperando());
        Final final1 = new Final("POO", "Final POO", 5.0, alumno1, 8.0, "Incompleto");
        Final final2 = new Final("POO", "Final POO", 6.0, alumno2, 10.0, "Incompleto");
        System.out.println(final1.estaAprobado());
        System.out.println(final2.estaAprobado());
        if(final1.compareTo(final2)>0){
            System.out.println("El examen final mayor es del alumno 1");
        }
        else if(final1.compareTo(final2)<0){
            System.out.println("El examen final mayor es del alumno 2");
        }
        else System.out.println("Ambos examanes son iguales");

    }
}
