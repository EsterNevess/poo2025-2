package exercicios;

public class TesteFuncionario {
    public static void main(String[] args) {

        // 1. Instanciar um funcionário com os dados do exemplo
        Funcionario funcionario = new Funcionario("Adriano", 3000.0);

        // 2. Obter os valores calculados
        double inss = funcionario.calcularInss();
        double valeTransporte = funcionario.calcularValeTransporte();
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        // 3. Exibir o resultado no console
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("INSS: " + inss);
        System.out.println("Vale Transporte: " + valeTransporte);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}