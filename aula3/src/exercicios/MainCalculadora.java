package exercicios;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- Menu Calculadora ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro valor: ");
                double valor1 = scanner.nextDouble();
                System.out.print("Digite o segundo valor: ");
                double valor2 = scanner.nextDouble();

                char operacao = ' ';
                switch (opcao) {
                    case 1:
                        operacao = '+';
                        break;
                    case 2:
                        operacao = '-';
                        break;
                    case 3:
                        operacao = '*';
                        break;
                    case 4:
                        operacao = '/';
                        break;
                }
                
                double resultado = calculadora.calcular(valor1, valor2, operacao);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado da operação: " + resultado);
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando a calculadora.");
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            }
        }
        scanner.close();
    }
}