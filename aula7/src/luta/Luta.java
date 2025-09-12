package luta;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean confirmado;

    public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
        this.confirmado = false; // A luta começa como não confirmada
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public boolean confirmarLuta() {
        if (this.desafiante.getCategoria().getTipo().equals(this.desafiado.getCategoria().getTipo()) && !this.desafiante.equals(this.desafiado)) {
            this.confirmado = true;
            return true;
        } else {
            this.confirmado = false;
            return false;
        }
    }
}