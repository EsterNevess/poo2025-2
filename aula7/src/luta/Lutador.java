package luta;

public class Lutador {
    private String nome;
    private Categoria categoria;
    private int idade;
    private double peso;

    public Lutador(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.definirCategoria();
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    private void definirCategoria() {
        if (this.peso <= 70.3) {
            this.categoria = new Categoria(1, "Peso Leve");
        } else if (this.peso <= 77.1) {
            this.categoria = new Categoria(2, "Peso Meio-Médio");
        } else if (this.peso <= 83.9) {
            this.categoria = new Categoria(3, "Peso Médio");
        } else if (this.peso <= 93.0) {
            this.categoria = new Categoria(4, "Peso Meio-Pesado");
        } else if (this.peso <= 120.2) {
            this.categoria = new Categoria(5, "Peso Pesado");
        } else {
            this.categoria = new Categoria(0, "Categoria Inválida");
        }
    }
}