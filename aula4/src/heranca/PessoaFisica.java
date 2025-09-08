package heranca;

public class PessoaFisica extends ImpostoRenda {

	private String cpf;
	private String rg;

	public PessoaFisica(String nome, String email, double rendimentos, String cpf, String rg) {
		super(nome, email, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public double calcularIR() {
		return rendimentos * 0.15;
	}

}