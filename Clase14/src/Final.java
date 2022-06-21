public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno unAlumno, String unTitulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(unAlumno, unTitulo, enunciado, nota);

        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public Boolean aprobado() {
        return getNota() >= 4 && notaOral >= 4;
    }

    public Double promedio(){
        return (getNota() + notaOral) / 2;
    }

    @Override
    public int compareTo(Object unObjeto) {
        Final otroFinal = (Final) unObjeto;

        if (promedio() > otroFinal.promedio()){
            return 1;
        } else if (promedio() < otroFinal.promedio()) {
            return -1;
        } else {
            return 0;
        }
    }
}
