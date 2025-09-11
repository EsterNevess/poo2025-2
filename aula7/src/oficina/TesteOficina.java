package oficina;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        // Criar um proprietário
        Proprietario proprietario = new Proprietario("José da Silva");

        // Criar um objeto do tipo carro com data de agendamento em agosto (para o desconto de revisão)
        // e um sábado (para o desconto de óleo)
        Carro carro = new Carro("Ford Ka", LocalDate.of(2025, 8, 23), proprietario, "Hatch");

        System.out.println("Proprietário: " + carro.getProprietario().getNome());
        System.out.println("Veículo: " + carro.toString());
        System.out.println("----------------------------------------");

        // Trocar o óleo e fazer a revisão no carro
        System.out.println("Valor da troca de óleo (com desconto): R$" + carro.trocarOleo());
        System.out.println("Valor da revisão (com desconto): R$" + carro.revisao());
        System.out.println("----------------------------------------");

        // Exibir o nome do proprietário, os dados do carro e o valor total cobrado
        System.out.println("Dados do Carro: " + carro.toString());
        System.out.println("Valor total cobrado: R$" + carro.getValorCobrado());
    }
}