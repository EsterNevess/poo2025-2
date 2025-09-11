package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String nome;
    private List<Animal> animais;

    public Tutor(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public String getNome() {
        return nome;
    }

    public List<Animal> getAnimais() {
        return animais;
    }
}