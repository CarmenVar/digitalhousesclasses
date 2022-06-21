package com.company;

public class SocioHabilitado extends Socio{

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioHabilitado(String numeroDeSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta) {
        super(numeroDeSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false;
    }

    @Override
    public Double calcularCuotaMensual(){
        if(estaHabilitado){
            return super.calcularCuotaMensual() + costoPileta;
        }else{
            return super.calcularCuotaMensual();
        }
    }

    public void habilitar(){
        estaHabilitado = true;
    }
}
