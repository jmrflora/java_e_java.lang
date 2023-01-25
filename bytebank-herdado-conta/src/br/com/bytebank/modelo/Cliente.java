package br.com.bytebank.modelo;
/**
 * classe que representa um cliente
 * @author jmrflora
 *
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
