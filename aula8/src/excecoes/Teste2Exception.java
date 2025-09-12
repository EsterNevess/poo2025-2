package excecoes;

public class Teste2Exception {

	public static void main(String[] args) {
			try {
				int vetor[]= {2,3,4};
				String texto = "teste";
				System.out.println(texto.toUpperCase());
				System.out.println(vetor[5]);
			} catch (NullPointerException e) {
				System.out.println("Esqueceu de instanciar!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do vetor inválida!");
			}
	}

}