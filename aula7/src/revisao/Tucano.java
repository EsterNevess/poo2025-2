package revisao;

import java.time.LocalDate;

public class Tucano extends Ave {
    private double peso;

    public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
        super(nome, dataVacinacao, "Tucano", "Ave", cor);
        this.peso = peso;
    }

    @Override
    public String voar() {
        return "Tucano voando alto!";
    }

    @Override
    public String emitirSom() {
        return "Tucano emitindo um som de 'cra-cra!'";
    }

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

}