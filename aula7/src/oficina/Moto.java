package oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    @Override
    public double lavarVeiculo() {
        double valor = TipoServico.LAVAGEM.getValorPorServico();
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public double trocarOleo() {
        double valor = TipoServico.OLEO.getValorPorServico();
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public double revisao() {
        double valor = TipoServico.REVISAO.getValorPorServico();
        this.valorCobrado += valor;
        return valor;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }
}