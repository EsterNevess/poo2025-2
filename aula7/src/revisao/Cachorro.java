package revisao;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
    private boolean castrado;

    public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
        super(nome, dataVacinacao, raca, "Cachorro");
        this.castrado = castrado;
    }

    @Override
    public String emitirSom() {
        return "Cachorro latindo: Au Au!";
    }

    @Override
    public boolean levarVeterinario() {
        return true;
    }

    @Override
    public boolean alimentar() {
        // Já tem o método alimentar acima, então pode ser removido ou alterado
        return true;
    }
}