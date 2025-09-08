package heranca;

public class Gerente extends Funcionario {
	private double comissao;

	public Gerente(int id, String nome, String telefone, String email, double salario, double comissao) {
		super(id, nome, telefone, email, salario);
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nComissão:" + comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}