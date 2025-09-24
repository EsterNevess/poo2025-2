package testes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import entity.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(LocalDate.now(), 500.);
		pedido1.finalizarPedido();
		
		//Classe Anônima
		Pedido pedido2 = new Pedido(LocalDate.now(), 1000.){
			
			@Override
			public void finalizarPedido() {
				System.out.println("Pedido encerrado com sucesso!");
			}
			
		};
		pedido2.finalizarPedido();

		List<Pedido> pedidos = Arrays.asList(pedido1,pedido2);
		
//		for (Pedido pedido : pedidos) {
//			System.out.println(pedido);
//		}
		
		pedidos.forEach((pedido)->System.out.println(pedido));
		
	}

}