package testes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
//		Conta conta = new Conta() {
//
//			@Override
//			public void transacao() {
//				System.out.println("Transação efetuada!");
//
//			}
//		};
//
//		conta.transacao();
		
		Conta conta1 = () -> System.out.println("Transação efetuada!");
		conta1.transacao();
		
		JButton button = new JButton();
		
		button.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}