package interfaces;

public class Empresa implements Tributos {
	private String razaoSocial;
	private double rendimentos;
	
	@Override
	public double calcularImpostoRenda() {
		// TODO Auto-generated method stub
		return rendimentos * irPessoaJuridica;
	}

	@Override
	public double calcularIcms() {
		// TODO Auto-generated method stub
		return rendimentos * icms;
	}

	@Override
	public double calcularIpi() {
		// TODO Auto-generated method stub
		return 0;
	}

}