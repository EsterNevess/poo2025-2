package revisao;

public class Tecnico extends Empregado {
	private String nivel;

	public Tecnico(String nome, double salario, String nivel, Setor setor) {
		super(nome, salario, setor);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "nivel:" + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public double calcularHoraExtra() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}