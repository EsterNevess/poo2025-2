package exercicios;

public class TesteAnimal {
    public static void main(String[] args) {
        // Crie um tutor
        Tutor tutor = new Tutor("Maria Oliveira");

        // Crie os animais e os associe ao tutor
        Cachorro cachorro = new Cachorro("Rex", 5, tutor, "Labrador");
        Gato gato = new Gato("Félix", 2, tutor, "Preto");

        // Adicione os animais ao tutor
        tutor.adicionarAnimal(cachorro);
        tutor.adicionarAnimal(gato);

        // Exiba os dados
        System.out.println("Tutor: " + tutor.getNome());
        System.out.println("---------------------------------");

        for (Animal animal : tutor.getAnimais()) {
            System.out.println(animal);
        }
    }
}