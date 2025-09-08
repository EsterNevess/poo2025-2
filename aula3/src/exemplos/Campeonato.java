package exemplos;

public class Campeonato {
	private int id;
	private String time;
	private int pontos;
	private static int contadorTimes = 0;

	// construtor não tem retorno e não é void e tem o mesmo nome da classe
	public Campeonato() {
		
	}

	// Overload - mesmo nome com argumentos diferentes
	public Campeonato(int id, String time, int pontos) {
		this.id = id;
		this.time = time;
		this.pontos = pontos;
		contadorTimes++;
	}

	//Sobrescrita
	@Override
	public String toString() {
		return "Time:" + time + " Pontos:" + pontos;
	}
	
	
	public static int getContadorTimes() {
		return contadorTimes;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}