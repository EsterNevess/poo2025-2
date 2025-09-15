package listas;

public class ExemploVarArgs {

	public static void main(String[] args) {
	System.out.println("Resultado da Soma:" + calcularSoma(10,20,30,50,2));
	}
	
	//varargs
	public static int calcularSoma(int numero, int... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma;
	}

}
