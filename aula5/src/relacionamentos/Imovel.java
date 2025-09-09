package relacionamentos;

public class Imovel {
	private String local;
	private String tipo;
	private double valor;
	// relacionando pessoa com imóvel;
	private Pessoa pessoa;
	
	
	public Imovel(String local, String tipo, double valor, Pessoa pessoa) {
		this.local = local;
		this.tipo = tipo;
		this.valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Imovel [local=" + local + ", tipo=" + tipo + ", valor=" + valor + ", pessoa=" + pessoa + "]";
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	
}