package interfaces;

public class Pessoa implements Tributos {
	private String nome;
	private double rendimentos;

	
	
	public double calcularImpostoRenda() {
		return rendimentos * irPessoaFisica;
	}
	
	
	public double calcularIcms() {
		return rendimentos * icms;
	}
	
	public double calcularIpi() {
		return 0;
	}
}
