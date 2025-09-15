package listas;

import java.util.List;

public class ExemploIndexOf {

	public static void main(String[] args) {
		//Não permite novos elementos também não permite modificações
		List<String> setores = List.of("RH","Contabilidade","CPD");
		
		setores.set(0, "Financeiro");
		System.out.println(setores);
	}

}
