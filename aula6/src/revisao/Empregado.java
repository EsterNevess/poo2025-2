package revisao;

public abstract class Empregado {
    private String nome;
    private double salario;
    private Setor setor;

    public Empregado(String nome, double salario, Setor setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", salario: " + salario + ", setor: " + setor.toString() + ", ";
    }

    public abstract double calcularHoraExtra();

    // Getters e Setters (opcionais, mas boas práticas)
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}