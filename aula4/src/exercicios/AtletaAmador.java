package exercicios;

public class AtletaAmador extends Maratona {
	private boolean atestado;

	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	public boolean isAtestado() {
		return atestado;
	}

	public void setAtestado(boolean atestado) {
		this.atestado = atestado;
	}

	public String toString() {
		return super.toString() + "\n" + atestado + "\n";
	}
}