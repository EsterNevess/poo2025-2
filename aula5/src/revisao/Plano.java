package revisao;

public class Plano {
	protected String empresa;
	protected double valorPago = 80.;
	protected double valorIss = 5;

	public Plano(String empresa, double valorPago, double valorIss) {
		super();
		this.empresa = empresa;
		this.valorPago = valorPago;
		this.valorIss = valorIss;
	}

	@Override
	public String toString() {
		return "Plano empresa:" + empresa + ", valorPago=" + String.format("%.2f", valorPago) + ", valorIss="
				+ valorIss;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorIss() {
		return valorIss;
	}

	public void setValorIss(double valorIss) {
		this.valorIss = valorIss;
	}

	public double calcularPagamento() {
		return valorPago *= 0.95;
	}

}