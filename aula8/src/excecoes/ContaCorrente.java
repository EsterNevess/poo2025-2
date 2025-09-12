package excecoes;

public class ContaCorrente implements Conta {
	private String titular;
	private double saldo;

	public ContaCorrente(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (valor > saldo) {
			throw new ContaException("Saldo insuficiente!");
		}
		saldo-= valor;
		return true;
	}

	@Override
	public boolean deposito(double valor) {
		if (valor <= 0) {
			throw new ContaException("Valor inválido!");
		}
		saldo += valor;
		return true;
	}
}