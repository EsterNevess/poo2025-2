package revisao;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
    private String marcaFerradura;

    public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
        super(nome, dataVacinacao, raca, "Cavalo");
        this.marcaFerradura = marcaFerradura;
    }

    @Override
    public String emitirSom() {
        return "Cavalo relinchando.";
    }


    @Override
    public String trocarFerradura() {
        return "Cavalo trocando a ferradura.";
    }

    @Override
    public String inspecionar() {
        return "Cavalo sendo inspecionado para competição.";
    }

    @Override
    public String viajar() {
        return "Cavalo viajando para o evento.";
    }

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}
}