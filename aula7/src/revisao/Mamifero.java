package revisao;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {
	protected String raca;

    public Mamifero(String nome, LocalDate dataVacinacao, String raca, String especie) {
        super(nome, dataVacinacao, raca, especie);
        this.raca = raca;
    }
    
}