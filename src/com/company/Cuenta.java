package com.company;

public abstract class Cuenta {

    private Cliente titular;
    private Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double monto){
        if(monto > 0){
            saldo += monto;
            informarSaldo();
        }
    }


    public void extraer(Double monto){
        if(puedoExtraer(monto)){
            saldo -= monto;
        }
    }

    protected Boolean puedoExtraer(Double monto){
        return monto <= saldo;
    }

    public void informarSaldo(){
        System.out.println("tu saldo actual es de " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }
}
