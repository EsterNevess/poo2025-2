package exercicios;

public class Imovel {
    private String local;
    private double valorImovel;

    public Imovel(String local, double valorImovel) {
        this.local = local;
        this.valorImovel = valorImovel;
    }

    @Override
    public String toString() {
        return "Local: " + local + ", Valor do Imóvel: R$" + String.format("%.2f", valorImovel);
    }
    
    public double calcularImpostoVenda() {
        // O imposto ITBI é de 3.5% do valor do imóvel.
        double impostoITBI = 0.035 * valorImovel;
        double valorLiquido = valorImovel - impostoITBI;
        return valorLiquido;
    }
    
    // Métodos para acesso aos atributos (getters)
    public String getLocal() {
        return local;
    }
    
    public double getValorImovel() {
        return valorImovel;
    }
}