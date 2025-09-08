package exercicios;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Instancia os dois vendedores fixos
        FixoVendedor joana = new FixoVendedor("Joana", "123.456.789-01", 1500.0, 0.10); // Salário base e 10% de comissão
        FixoVendedor maria = new FixoVendedor("Maria", "987.654.321-09", 1500.0, 0.10); // Salário base e 10% de comissão

        String continuar = "N";

        do {
            System.out.println("----------Sistema de Vendas----------");
            System.out.println("Vendedores:");
            System.out.println("1-Joana");
            System.out.println("2-Maria");
            System.out.println("Escolha o vendedor?");
            int escolha = scanner.nextInt();

            if (escolha == 1 || escolha == 2) {
                System.out.println("Digite o valor da venda");
                double valorVenda = scanner.nextDouble();

                if (escolha == 1) {
                    joana.calcularSalarioBruto(valorVenda);
                } else {
                    maria.calcularSalarioBruto(valorVenda);
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.println("Deseja encerrar o programa? (S/N)");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("N"));

        System.out.println("----------Salário dos Vendedores----------");
        System.out.println("nome:" + joana.getNome());
        System.out.println("salarioBruto:" + joana.getSalarioBruto());
        System.out.println("nome:" + maria.getNome());
        System.out.println("salarioBruto:" + maria.getSalarioBruto());
        
        System.out.println("\n----------Total Vendido----------");
        System.out.println("Total:" + (joana.getSalarioBruto() + maria.getSalarioBruto()));
        
        scanner.close();
    }
}