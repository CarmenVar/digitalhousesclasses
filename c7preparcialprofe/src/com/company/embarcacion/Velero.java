package com.company.embarcacion;

import com.company.Capitan;

public class Velero extends Embarcacion {

    private Integer cantidadDeMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public Boolean esGrande(){
        return cantidadDeMastiles > 4;
    }
}
