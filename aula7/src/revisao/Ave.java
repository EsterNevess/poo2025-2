package revisao;

import java.time.LocalDate;

public abstract class Ave extends Animal {
    public String cor;

    public Ave(String nome, LocalDate dataVacinacao, String raca, String especie, String cor) {
        super(nome, dataVacinacao, raca, especie);
        this.cor = cor;
    }

    public abstract String voar();
}