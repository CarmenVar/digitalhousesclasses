package com.company;

public class Consulta {

    private Paciente paciente;
    private String fechaConsulta;
    private String horaYMinutosConsulta;
    private String especialidad;

    public Consulta(Paciente paciente, String fechaConsulta, String horaYMinutosConsulta, String especialidad) {
        this.paciente = paciente;
        this.fechaConsulta = fechaConsulta;
        this.horaYMinutosConsulta = horaYMinutosConsulta;
        this.especialidad = especialidad;
    }
}
