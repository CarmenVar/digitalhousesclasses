public class Parcial extends Examen{
    private Integer unidad;
    private Integer cantidadReintentosRealizados;

    public Parcial(Alumno unAlumno, String unTitulo, String enunciado, Double nota, Integer unidad) {
        super(unAlumno, unTitulo, enunciado, nota);
        this.unidad = unidad;
        cantidadReintentosRealizados = 0;
    }

    @Override
    public Boolean aprobado() {
        return getNota() >= 4;
    }

    public Boolean esRecuperable(){
        Boolean recuperable = false;

        if (aprobado()) { return recuperable; }

        if (unidad <= 3) {
            recuperable = cantidadReintentosRealizados < 3;
        }

        if (unidad > 3) {
            recuperable = cantidadReintentosRealizados < 2;
        }

        return recuperable;
    }
}
