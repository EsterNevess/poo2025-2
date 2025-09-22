package conexao;

import persistence.ClienteDao;

public class TesteListar {

	public static void main(String[] args) {

		ClienteDao dao = new ClienteDao();
		System.out.println(dao.listar());
	}

}