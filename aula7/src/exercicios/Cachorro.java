package exercicios;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, Tutor tutor, String raca) {
        super(nome, idade, "Cachorro", tutor);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Cachorro [Nome: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + raca + "]";
    }
}