package br.com.bytebank.teste;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteEx;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200);

        try {
            conta.saca(210);
        } catch (SaldoInsuficienteEx ex) {
            System.out.println("ex:"+ex.getMessage());
        }
        System.out.println("saldo:"+conta.getSaldo());
    }
}
