package com.company;

import com.company.embarcacion.Yate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Capitan capitan = new Capitan("Rafa","Vallejo",1);


        Yate yate = new Yate(capitan,1000.0,500.0,2000,22222224.0,5);

        System.out.println(yate.calcularMontoAlquiler());





    }
}
