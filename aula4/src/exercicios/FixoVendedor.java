package exercicios;

public class FixoVendedor extends Vendedor {

    private double salarioBase;
    private double comissao;

    public FixoVendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        // O salário bruto inicial é o salário base
        this.salarioBruto = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Método para calcular o salário bruto com base na venda
    public void calcularSalarioBruto(double valorVenda) {
        this.salarioBruto += valorVenda * this.comissao;
    }
}