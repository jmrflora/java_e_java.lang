package br.com.bytebank.modelo;
public class AcaoBolsa implements Tributavel {

    private double saldo = 100;
    @Override
    public double getValorImposto() {
        
        return this.saldo;
    }
}
