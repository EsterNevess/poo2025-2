package heranca;

public class Funcionario{
	private int id;
	private String nome;
	private String telefone;
	private String email;
	private double salario;

	public Funcionario(int id, String nome, String telefone, String email, double salario) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return  "Nome:" + nome + "\nTelefone:" 
				+ telefone + "\nEmail:" + email + "\nSalário:";
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularFolha() {
		return salario = salario - salario * 0.06;
	}
	
}