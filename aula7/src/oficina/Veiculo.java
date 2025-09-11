package oficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
    protected String modelo;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;
    protected double valorCobrado;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
        this.valorCobrado = 0.0;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", dataConserto=" + dataConserto + ", proprietario=" + proprietario.getNome() + ", valorCobrado=" + valorCobrado + "]";
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getValorCobrado() {
        return this.valorCobrado;
    }
}