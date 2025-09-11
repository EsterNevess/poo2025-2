package interfaces;

//Interface não permite new
//Todos métodos são abstratos
//Interface não tem implementação por enquanto
public interface Conta {
	
	//Assinatura de métodos abstratos
	public double saque(double valor);
	public double depositar(double valor);
	public double transferir(double valor);
	public double pix(double valor);

}
