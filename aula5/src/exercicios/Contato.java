package exercicios;

import java.util.List;

public class Contato {
    private String nome;
    private Endereco endereco;
    private List<Telefone> telefones;

    public Contato(String nome, Endereco endereco, List<Telefone> telefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
    
    // Método para exibir todos os telefones
    public void mostrarTelefones() {
        for (Telefone tel : telefones) {
            System.out.println("Telefone: " + tel.getNumero());
        }
    }
}
