package exercicios;

public class Pais {
    private String nome;

    // Construtor default
    public Pais() {
    }

    // Construtor com atributo
    public Pais(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}