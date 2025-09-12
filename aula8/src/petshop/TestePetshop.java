package petshop;

public class TestePetshop {
    public static void main(String[] args) {
        LojaDePets petShop = new LojaDePets("Meu Pet Feliz");

        // 1. Adicionar animais à loja
        Cachorro cachorro1 = new Cachorro("Rex", 3, "Golden Retriever");
        Cachorro cachorro2 = new Cachorro("Bolinha", 1, "Poodle");
        Gato gato1 = new Gato("Mimi", 2, "Preto");

        petShop.adicionarAnimal(cachorro1);
        petShop.adicionarAnimal(gato1);
        petShop.adicionarAnimal(cachorro2);

        // 2. Listar todos os animais disponíveis
        petShop.listarAnimais();

        // 3. Adotar um animal (tentativa bem-sucedida)
        try {
            petShop.adotarAnimal(1); // Adotando o animal no índice 1 (Mimi)
            petShop.listarAnimais();
        } catch (AnimalException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 4. Lidar com uma exceção personalizada (tentativa com erro)
        try {
            petShop.adotarAnimal(5); // Tentando adotar um animal que não existe
        } catch (AnimalException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}