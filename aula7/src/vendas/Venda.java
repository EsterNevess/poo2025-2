package vendas;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
    private Produto produto;
    private LocalDate dataDaCompra;
    private int quantidade;
    private double totalVenda;

    public Venda(Produto produto, LocalDate dataDaCompra, int quantidade) {
        this.produto = produto;
        this.dataDaCompra = dataDaCompra;
        this.quantidade = quantidade;
        this.calcularVenda(); // Chamando o método para calcular o total da venda
    }

    @Override
    public void calcularVenda() {
        this.totalVenda = this.produto.getValor() * this.quantidade;
    }

    @Override
    public String toString() {
        return "Venda{" +
               "produto=" + produto.getDescricao() +
               ", dataDaCompra=" + dataDaCompra +
               ", quantidade=" + quantidade +
               ", totalVenda=" + totalVenda +
               '}';
    }

    public double getTotalVenda() {
        return totalVenda;
    }
}