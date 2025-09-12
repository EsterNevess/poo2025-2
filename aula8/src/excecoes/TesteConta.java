package excecoes;

public class TesteConta {

	public static void main(String[] args) {
		try {
			ContaCorrente cc = new ContaCorrente("Roni", 1000.);
			cc.deposito(10);
			cc.saque(2000.);
			System.out.println("Saldo:"+ cc.getSaldo());
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
	}
}