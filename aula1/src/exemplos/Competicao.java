package exemplos;

public class Competicao {

	public static void main(String[] args) {
		int idade =  20;
		double altura = 1.65;
		
		if (altura > 1.70  || idade > 18) {
			System.out.println("Competirá");
		} else {
			System.out.println("Não competirá");
		}
		System.out.println("Fim de programa!");
	}

}
