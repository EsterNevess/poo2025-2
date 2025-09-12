package petshop;

import java.util.ArrayList;
import java.util.List;

public class LojaDePets {
    private String nomeLoja;
    private List<Animal> animais;

    public LojaDePets(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println(animal.getClass().getSimpleName() + " " + ((AnimalDeEstimacao) animal).getNome() + " adicionado à loja.");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal disponível para adoção.");
        } else {
            System.out.println("--- Animais disponíveis para adoção na " + nomeLoja + " ---");
            for (int i = 0; i < animais.size(); i++) {
                System.out.print("[" + i + "] ");
                animais.get(i).imprimir();
            }
            System.out.println("-------------------------------------------------");
        }
    }

    public void adotarAnimal(int index) throws AnimalException {
        if (index < 0 || index >= animais.size()) {
            throw new AnimalException("Índice de animal inválido. O animal não foi encontrado.");
        }

        Animal animalAdotado = animais.get(index);
        animais.remove(index);
        System.out.println(((AnimalDeEstimacao) animalAdotado).getNome() + " foi adotado com sucesso!");
    }
}