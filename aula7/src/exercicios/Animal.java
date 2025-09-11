package exercicios;

public class Animal {
    private String nome;
    private int idade;
    private String especie;
    private Tutor tutor;

    public Animal(String nome, int idade, String especie, Tutor tutor) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public Tutor getTutor() {
        return tutor;
    }
}