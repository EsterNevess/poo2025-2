package conexao;

import java.util.Scanner;

import entity.Cliente;
import persistence.ClienteDao;

public class TesteInserir {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			System.out.println("Digite o telefone:");
			String telefone = sc.nextLine();
			System.out.println("Digite o email:");
			String email = sc.nextLine();
			Cliente cliente = new Cliente(0,nome,email,telefone);
			ClienteDao dao = new ClienteDao();
			dao.inserir(cliente);
		
	}

}