package oficina;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
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
        if (this.dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            valor -= 50.0;
        }
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public double revisao() {
        double valor = TipoServico.REVISAO.getValorPorServico();
        if (this.dataConserto.getMonth() == Month.AUGUST) {
            valor *= 0.90; // 10% de desconto
        }
        this.valorCobrado += valor;
        return valor;
    }

    public String getCategoria() {
        return this.categoria;
    }
}