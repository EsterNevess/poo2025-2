package exercicios;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, Tutor tutor, String cor) {
        super(nome, idade, "Gato", tutor);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato [Nome: " + getNome() + ", Idade: " + getIdade() + ", Cor: " + cor + "]";
    }
}
