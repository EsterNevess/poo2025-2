package exercicios;

public class Freelancer extends Vendedor {

    private int diasTrabalhados;
    private double valorDiaria;

    public Freelancer(String nome, String cpf, int diasTrabalhados, double valorDiaria) {
        super(nome, cpf);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDiaria = valorDiaria;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    // Método para calcular o salário bruto do freelancer
    public void calcularSalarioBruto() {
        this.salarioBruto = this.diasTrabalhados * this.valorDiaria;
    }
}
