package enumeradores;

public class Empregado {

	enum EstadoCivil {
		CASADO('C'), VIUVO('V'), DIVORCIADO('D'), SOLTEIRO('S');
		private char estado;
		private EstadoCivil(char estado) {
			this.estado = estado;
		}
	}

	private String nome;
	private String email;
	private EstadoCivil estadoCivil;
	private Setor setor;
	
	public Empregado(String nome, String email, EstadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", email=" + email + ", estadoCivil=" + estadoCivil + ", setor=" + setor
				+ "]";
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

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	
	
	

}