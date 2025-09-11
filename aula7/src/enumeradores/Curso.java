package enumeradores;

public class Curso {
	private String nome;
	private PeriodoCurso periodoCurso;		


	public Curso(String nome, PeriodoCurso periodoCurso) {
		super();
		this.nome = nome;
		this.periodoCurso = periodoCurso;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", periodoCurso=" + periodoCurso + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PeriodoCurso getPeriodoCurso() {
		return periodoCurso;
	}

	public void setPeriodoCurso(PeriodoCurso periodoCurso) {
		this.periodoCurso = periodoCurso;
	}

}
