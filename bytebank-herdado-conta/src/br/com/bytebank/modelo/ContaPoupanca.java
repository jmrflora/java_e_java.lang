package br.com.bytebank.modelo;
public class ContaPoupanca extends Conta{
    
    

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        // TODO Auto-generated method stub
        this.setSaldo(this.getSaldo() + valor);
    }
}
