package com.company;

public class Final extends Examen implements Comparable {
    private Double notaOral;
    private String descripcionNotaOral;

    public Final(String titulo, String enunciado, Double nota, Alumno alumno, Double notaOral, String descripcionNotaOral) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionNotaOral = descripcionNotaOral;
    }

    @Override
    public Boolean estaAprobado() {
        return super.estaAprobado() && notaOral >=4;
    }

    @Override
    public int compareTo(Object o) {
        Final otroFinal = (Final) o;
        if (((this.notaOral + this.getNota()) / 2) > ((otroFinal.notaOral + otroFinal.getNota()) / 2)) {
            return 1;
        }
        else if (((this.notaOral + this.getNota()) / 2) < ((otroFinal.notaOral + otroFinal.getNota()) / 2)) {
            return -1;
        }
        return 0;
    }
}
