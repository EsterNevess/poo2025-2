package exemplos;

import javax.swing.JOptionPane;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
			
		produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Cód.:")));
		produto.setDescricao(JOptionPane.showInputDialog("Descrição:"));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço:")));
		
		JOptionPane.showMessageDialog(null,"Cód.:" + produto.getCodigo() 
		+ "\nDesc.:"+ produto.getDescricao() + "\nPreço:"
				+ produto.getPreco());
		
	}

}