package exercicios;

public class Produto {

    private String descricao;
    private double valor;
    private int quantidade;

    // Construtor
    public Produto(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o total
    public double calcularTotal() {
        return this.valor * this.quantidade;
    }

    // Método para calcular o ICMS (12% do total)
    public double calcularIcms() {
        return this.calcularTotal() * 0.12;
    }
}