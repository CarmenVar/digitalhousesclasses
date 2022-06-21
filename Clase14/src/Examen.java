public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private Double nota;

    public Examen(Alumno unAlumno, String unTitulo, String enunciado, Double nota) {
        alumno = unAlumno;
        titulo = unTitulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public abstract Boolean aprobado();

    public Double getNota(){
        return nota;
    }
}
