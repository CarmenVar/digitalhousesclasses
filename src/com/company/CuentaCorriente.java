package com.company;

public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    public CuentaCorriente(Cliente titular, Double saldo) {
        super(titular, saldo);
        montoAutorizado = 1000.0;
    }

    @Override
    public void extraer(Double monto) {
        if(getSaldo() + montoAutorizado >= monto){
            System.out.println("pude extraer " + monto);
            super.extraer(monto);
            informarSaldo();
        }else{
            System.out.println("no pude extraer");
        }
    }

    @Override
    protected Boolean puedoExtraer(Double monto) {
        return getSaldo() + montoAutorizado >= monto;
    }


    public void depositar(Cheque cheque) {
        depositar(cheque.getValor());
    }
}
