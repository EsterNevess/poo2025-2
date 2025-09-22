package conexao;

import persistence.ClienteDao;

public class TesteApagar {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		dao.apagar(1);
		System.out.println("Apagado com sucesso!");
	}
}