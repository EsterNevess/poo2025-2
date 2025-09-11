package enumeradores;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java Backend", PeriodoCurso.MANHA);
		
		System.out.println("Curso:"+ curso.getNome());
		System.out.println("Dias:" + curso.getPeriodoCurso().getDiasSemana());
		System.out.println("Carga Horária:"+ curso.getPeriodoCurso().getCargaHoraria());
		System.out.println("Valor:"+ curso.getPeriodoCurso().getValor());
	}

}