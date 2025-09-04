package exemplos;

import javax.swing.JOptionPane;

public class TesteSwing {

	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o num1:"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o num2:"));

		JOptionPane.showMessageDialog(null, "Média:" + (num1 + num2) / 2);
		
	}

}
