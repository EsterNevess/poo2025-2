package relacionamentos;

import java.util.Arrays;

public class Time {
	private String nome;
	private String treinador;
	private Atleta[] atletas;

	public Time(String nome, String treinador, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", treinador=" + treinador + ", atletas=" + Arrays.toString(atletas) + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public void setTreinador(String treinador) {
		this.treinador = treinador;
	}

	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}

	public void imprimirTime() {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] != null) {
				System.out.println(atletas[i].getNome());
			}
		}
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

}