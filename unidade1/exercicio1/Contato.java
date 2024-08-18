/**
 * Codigo Secreto = 1961762906
 * Explicação do código
 * O que a classe faz 
 *
 * @author Ana Sara 
 * @since 13/08/2024
 *
 */ 

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome.toUpperCase() + ", telefone=" + telefone + "]";
    }
}