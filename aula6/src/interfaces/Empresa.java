package interfaces;

public class Empresa implements Tributos {

	private String razaoSocial;
	private double rendimentos;
	private double irPessoaJuridica;
	private double icms;

	public Empresa(String razaoSocial, double rendimentos) {
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
		this.irPessoaJuridica = 0.15; // Exemplo de taxa padrão
		this.icms = 0.18; // Exemplo de taxa padrão
	}

	@Override
	public double calcularImpostoRenda() {
		return this.rendimentos * this.irPessoaJuridica;
	}

	@Override
	public double calcularIcms() {
		return this.rendimentos * this.icms;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIpi() {
		// TODO Auto-generated method stub
		return 0;
	}
}