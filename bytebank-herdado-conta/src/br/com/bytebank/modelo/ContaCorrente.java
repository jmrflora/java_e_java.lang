package br.com.bytebank.modelo;
public class ContaCorrente extends Conta implements Tributavel{
    //não herda construtor


    public ContaCorrente(int agencia, int numero){
        //chama o construtor específico da super classe
        super(agencia, numero);
    }
    @Override
    public void saca(double valor) throws SaldoInsuficienteEx {
        // TODO Auto-generated method stub
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }
    @Override
    public void deposita(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public double getValorImposto() {
        // TODO Auto-generated method stub
        return (0.01 * super.getSaldo());
    }
}
