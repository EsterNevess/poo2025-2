package constante;

//O final serve para tornar a classe imutável
public class Servidor {
	protected String nome;
	protected String lotacao;
	//não posso modificar
	protected final String LOTACAO = "BRASILIA";
	
	public Servidor(String nome, String lotacao) {
		this.nome = nome;
		this.lotacao = lotacao;
	}
	
	//o final no método serve para não permitir a sobrescrita
	public final void imprimirRelatorio() {
		System.out.println("Relatório impresso");
	}
}
