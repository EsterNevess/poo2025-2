package exemplos;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		//atribuição direta para o atributo
	/*	pessoa.nome = "Ana";
		pessoa.altura = 1.65;
		pessoa.peso = 62;
	*/
		
		pessoa.setNome("Ana");
		pessoa.setAltura(1.85);
		pessoa.setPeso(78.);
		
		System.out.println("Nome:" + pessoa.getNome());
		System.out.println("Resultado IMC:" + pessoa.resultado());
	}

}
