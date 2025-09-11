package enumeradores;

public enum PeriodoCurso {
	
	INTEGRAL("TER E QUI", "343", 2000.), NOTURNO("QUA E SEX",80, 3000.),
	MANHA("SEX", 80,3000.);
	
	private String diasSemana;
	private int cargaHoraria;
	private double valor;
	
	private PeriodoCurso(String diasSemana, int cargaHoraria, double valor) {
		this.diasSemana = diasSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	PeriodoCurso(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}

	public String getDiasSemana() {
		return diasSemana;
	}

	int getCargaHoraria() {
		return cargaHoraria;
	}

	double getValor() {
		return valor;
	}	
}
