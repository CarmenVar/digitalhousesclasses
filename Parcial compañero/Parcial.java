package com.company;

public class Parcial extends Examen {
    private Integer numeroDeUnidad;
    private Integer numeroDeReintentos;

    public Parcial(String titulo, String enunciado, Double nota, Alumno alumno, Integer numeroDeUnidad, Integer numeroDeReintentos) {
        super(titulo, enunciado, nota, alumno);
        this.numeroDeUnidad = numeroDeUnidad;
        this.numeroDeReintentos = numeroDeReintentos;
    }

    public Boolean esPosibleSeguirRecuperando(){
        return ((numeroDeUnidad <=3 && numeroDeReintentos <=3)||(numeroDeUnidad>3 && numeroDeReintentos <= 2));
    }
}
