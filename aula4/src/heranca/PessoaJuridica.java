package heranca;

public class PessoaJuridica extends ImpostoRenda {
	private String razaoSocial;
	private String cnpj;

	public PessoaJuridica(String nome, String email, double rendimentos, String razaoSocial, String cnpj) {
		super(nome, email, rendimentos);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularIR() {
		return rendimentos * 0.20;
	}

}