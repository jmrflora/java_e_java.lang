package br.com.bytebank.modelo;
public class CalculadorImposto {
    private double valorImposto;

    public void registraValor(Tributavel t){
       valorImposto = this.valorImposto + t.getValorImposto();
    }

    public double getValorImposto() {
        return valorImposto;
    }

}
