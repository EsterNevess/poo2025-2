package exercicios;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String continuar = "N";

        do {
            System.out.println("Produto:");
            String descricao = scanner.next();
            
            System.out.println("Valor:");
            double valor = scanner.nextDouble();
            
            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();
            
            // Instancia um novo objeto Produto
            Produto produto = new Produto(descricao, valor, quantidade);

            // Exibe as informações do produto
            System.out.println("\nDescrição:" + produto.getDescricao());
            System.out.println("Valor:" + produto.getValor());
            System.out.println("Total:" + produto.calcularTotal());
            System.out.println("ICMS:" + produto.calcularIcms());
            
            // Pergunta se deseja encerrar
            System.out.println("\nDeseja encerrar o programa? (S/N)");
            continuar = scanner.next();
            
        } while (continuar.equalsIgnoreCase("N"));
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
