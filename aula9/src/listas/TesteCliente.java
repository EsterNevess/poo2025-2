package listas;

import java.util.ArrayList;
import java.util.List;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Ana","ana@gmail.com");
		Cliente cliente2 = new Cliente("Marcos","marcos@gmail.com");
		Cliente cliente3 = new Cliente("Carlos","carlos@gmail.com");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		for (Cliente c : clientes) {
			System.out.println(c.getNome() + "-"+ c.getEmail());
		}
	}

}
