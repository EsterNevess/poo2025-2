package enumeradores;

public enum Setor {
	RH(5), DP(2), FINANCEIRO(10), CONTABILIDADE(3);
	
	private int sala;
	
	private Setor(int sala) {
		this.sala = sala;
	}
	
	public int getSala() {
		return sala;
	}
		

}