package revisao;

import java.time.LocalDate;

public class TesteAnimal {
    public static void main(String[] args) {
        // Criando uma instância de Tucano
        Tucano tucano = new Tucano("Tico", LocalDate.of(2023, 5, 10), "Preto e branco", 1.2);
        System.out.println("Tucano: " + tucano.getNome());
        System.out.println("Ação: " + tucano.voar());
        System.out.println("Som: " + tucano.emitirSom());
        System.out.println("Alimentação: " + tucano.alimentar());
        System.out.println("----------------------------------------");

        // Criando uma instância de Cavalo
        Cavalo cavalo = new Cavalo("Spirit", LocalDate.of(2022, 11, 25), "Appaloosa", "Esportiva");
        System.out.println("Cavalo: " + cavalo.getNome());
        System.out.println("Ação: " + cavalo.inspecionar());
        System.out.println("Som: " + cavalo.emitirSom());
        System.out.println("Alimentação: " + cavalo.alimentar());
        System.out.println("Ação de Competição: " + cavalo.viajar());
        System.out.println("----------------------------------------");

        // Criando uma instância de Cachorro
        Cachorro cachorro = new Cachorro("Totó", LocalDate.of(2021, 3, 15), "Vira-lata", true);
        System.out.println("Cachorro: " + cachorro.getNome());
        System.out.println("Som: " + cachorro.emitirSom());
        System.out.println("Alimentação: " + cachorro.alimentar());
        System.out.println("Cuidado Doméstico: Levar ao veterinário? " + cachorro.levarVeterinario());
    }
}