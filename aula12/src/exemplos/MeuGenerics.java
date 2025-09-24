package exemplos;

public class MeuGenerics<T> {
	private T valor;

	public MeuGenerics(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "valor:" + valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
}