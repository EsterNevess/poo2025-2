package exercicios;

public class Calculadora {

    public double calcular(double valor1, double valor2, char operacao) {
        double resultado = 0.0;
        
        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    // Retorna um valor que pode ser verificado para indicar erro
                    resultado = Double.NaN; 
                }
                break;
            default:
                System.out.println("Operação inválida.");
                resultado = Double.NaN;
                break;
        }
        return resultado;
    }
}