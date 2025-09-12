package excecoes;

public class TesteException {

	public static void main(String[] args) {
		try {
			System.out.println(calcular(10, 0));
			System.out.println("teste");
			System.out.println("aula");
		} catch (ArithmeticException e) {
			System.err.println("Você dividiu um  nº por zero!");
			//e.printStackTrace();
		}finally {
			System.out.println("Fecha banco de dados!");
		}

	}
	
	public static int calcular(int a, int b) {
//		if (b==0) {
//			throw new ArithmeticException("Divisão por zero!");
//		}	
//			return a/b;
//
		
		return a/b;
	}

}