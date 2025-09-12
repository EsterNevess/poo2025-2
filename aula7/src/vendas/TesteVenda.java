package vendas;

import java.time.LocalDate;

public class TesteVenda {
    public static void main(String[] args) {
        // 1. Instanciar 3 produtos
        Produto tv = new Produto(1, "Tv", 3000.0, Categoria.ELETRONICO);
        Produto pneu = new Produto(2, "Pneu", 800.0, Categoria.AUTOMOTIVO);
        Produto celular = new Produto(3, "Celular", 2500.0, Categoria.ELETRONICO);

        // 2. Realizar a venda
        Venda venda1 = new Venda(tv, LocalDate.now(), 1);
        Venda venda2 = new Venda(pneu, LocalDate.now(), 1);
        Venda venda3 = new Venda(celular, LocalDate.now(), 1);

        // 3. Exibir os dados
        System.out.println("Total por Item:");
        System.out.println(tv.getDescricao() + " " + venda1.getTotalVenda());
        System.out.println(pneu.getDescricao() + " " + venda2.getTotalVenda());
        System.out.println(celular.getDescricao() + " " + venda3.getTotalVenda());

        double totalGeral = venda1.getTotalVenda() + venda2.getTotalVenda() + venda3.getTotalVenda();
        System.out.println("Total Geral Venda: " + totalGeral);
    }
}