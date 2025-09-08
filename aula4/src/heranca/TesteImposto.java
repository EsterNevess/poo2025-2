package heranca;

public class TesteImposto {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("João","j@gmail.com", 120000., "23", "2323");
		PessoaJuridica pj = new PessoaJuridica("Xpto ltda", "x@gmail.com", 350000., "qualquer coisa", "234");
		
		System.out.println(pf.calcularIR()); 
		System.out.println(pj.calcularIR());
	}
}