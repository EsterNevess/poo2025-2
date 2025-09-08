package exercicios;

import javax.swing.JOptionPane;

public class MainCalculadoraJOptionPane {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        int opcao = 0;

        while (opcao != 5) {
            String menu = "--- Menu Calculadora ---\n"
                        + "1 - Soma\n"
                        + "2 - Subtração\n"
                        + "3 - Multiplicação\n"
                        + "4 - Divisão\n"
                        + "5 - Sair";
            
            try {
                String inputOpcao = JOptionPane.showInputDialog(null, menu);
                if (inputOpcao == null) { // Se o usuário clicar em "Cancelar"
                    opcao = 5;
                    continue;
                }
                opcao = Integer.parseInt(inputOpcao);
                
                if (opcao >= 1 && opcao <= 4) {
                    double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
                    double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
                    
                    char operacao = ' ';
                    switch (opcao) {
                        case 1:
                            operacao = '+';
                            break;
                        case 2:
                            operacao = '-';
                            break;
                        case 3:
                            operacao = '*';
                            break;
                        case 4:
                            operacao = '/';
                            break;
                    }

                    double resultado = calculadora.calcular(valor1, valor2, operacao);
                    if (!Double.isNaN(resultado)) {
                        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
                    }
                } else if (opcao == 5) {
                    JOptionPane.showMessageDialog(null, "Encerrando a calculadora.");
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número.");
            }
        }
    }
}