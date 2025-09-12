package revisao;

//Classe serve para instanciar os filhos
public abstract class Empregado {
	protected String nome;
	protected double salario;
	protected Setor setor;

	public Empregado(String nome, double salario, Setor setor) {
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "nome:" + nome + ", salario:" + salario + "setor:"+setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	//Método abstract não contém implementação.  A implementação será nos filhos.
	public abstract double calcularHoraExtra();
	
	

	public void setSalario(double salario) {
		this.salario = salario;
	}

}