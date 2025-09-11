package revisao;

public class Setor {
    private String nomeSetor;

    public Setor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    @Override
    public String toString() {
        return nomeSetor;
    }

    // Getter e Setter (opcionais, mas boas práticas)
    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}