package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		Diretor diretor = new Diretor(1,"Ana","23","a@gmail.com", 8000., "ADM", 1000.);
		Gerente gerente = new Gerente(2, "Carlos", "21", "c@gmail.com", 6000., 10);
		
		System.out.println("Dados do diretor:"+diretor);
		System.out.println("Salário:"+ diretor.calcularFolha());
		
				
		System.out.println("\nDados do Gerente:" + gerente);
		System.out.println("Salário:"+ gerente.calcularFolha());
		
		
		
	}

}