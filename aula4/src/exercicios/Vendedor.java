package exercicios;

public class Vendedor {

    protected String nome;
    protected String cpf;
    protected double salarioBruto;

    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}