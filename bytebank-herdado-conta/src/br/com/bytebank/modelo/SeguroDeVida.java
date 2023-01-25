package br.com.bytebank.modelo;
public class SeguroDeVida implements Tributavel {

    private double saldo = 100;
    
    @Override
    public double getValorImposto() {
        // TODO Auto-generated method stub
        return this.saldo;
    }
    
}
