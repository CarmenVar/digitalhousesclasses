package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Equipo equipo =  new Equipo("Isótopos de Albuquerque");

        equipo.agregarJugador(new Jugador(30,"Messi",true,false));
        equipo.agregarJugador(new Jugador(19,"Aguero",true,true));
        equipo.agregarJugador(new Jugador(1,"Dibu",true,false));
        equipo.agregarJugador(new Jugador(10,"James Rodriguez",true,false));
        equipo.agregarJugador(new Jugador(5,"Rafa Vallejo",false,false));

        equipo.mostrarJugadoresTitulares();

        System.out.println(equipo.getCantidadTitularesLesionados());



    }
}
