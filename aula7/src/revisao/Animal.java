package revisao;

import java.time.LocalDate;

public abstract class Animal {
    protected String nome;
    protected LocalDate dataVacinacao;
    protected String raca;
    protected String especie;

    public Animal(String nome, LocalDate dataVacinacao, String raca, String especie) {
        super();
        this.nome = nome;
        this.dataVacinacao = dataVacinacao;
        this.raca = raca;
        this.especie = especie;
    }

    public abstract String emitirSom();

    public abstract boolean alimentar();

    public String getNome() {
        return nome;
    }
}