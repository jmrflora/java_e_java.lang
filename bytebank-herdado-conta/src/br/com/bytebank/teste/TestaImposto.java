package br.com.bytebank.teste;
import br.com.bytebank.modelo.AcaoBolsa;
import br.com.bytebank.modelo.CalculadorImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TestaImposto {
    public static void main(String[] args) {
        CalculadorImposto calc = new CalculadorImposto();
        ContaCorrente cc = new ContaCorrente(111, 222);
        SeguroDeVida sv = new SeguroDeVida();
        AcaoBolsa ab = new AcaoBolsa();


        calc.registraValor(cc);
        calc.registraValor(sv);
        calc.registraValor(ab);
        System.out.println("valor do imposto: "+ calc.getValorImposto());
    }
}
