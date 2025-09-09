package relacionamentos;

public class TesteImovel {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Antônio", "123");
		Pessoa pessoa2 = new Pessoa("Adriana", "124");
		
		Imovel imovel1 = new Imovel("Rua Bingen", "Apto", 189000., pessoa1);
		
		System.out.println(imovel1.toString());
	}

}