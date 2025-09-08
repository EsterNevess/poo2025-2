package exercicios;

public class Funcionario {

    private String nome;
    private double salario;

    // Construtor que recebe todos os atributos
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular o INSS (11% do salário)
    public double calcularInss() {
        return salario * 0.11;
    }

    // Método para calcular o vale-transporte (6% do salário)
    public double calcularValeTransporte() {
        return salario * 0.06;
    }

    // Método para calcular o salário líquido
    public double calcularSalarioLiquido() {
        return salario - calcularInss() - calcularValeTransporte();
    }
}