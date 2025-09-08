package heranca;

//Abstract não permite instância (new)
public abstract class ImpostoRenda {
	protected String nome;
	protected String email;
	protected double rendimentos;

	public ImpostoRenda(String nome, String email, double rendimentos) {
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	//método abstrato é um método sem corpo obrigando os filhos a implementar o corpo.
	public abstract double calcularIR();
}