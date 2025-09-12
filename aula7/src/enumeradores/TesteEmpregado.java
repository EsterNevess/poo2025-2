package enumeradores;

import enumeradores.Empregado.EstadoCivil;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("João", "j@gmail.com", EstadoCivil.SOLTEIRO, Setor.FINANCEIRO);
		
		System.out.println("Dados:" + empregado.toString());
		
		
		Setor[] setores = Setor.values();
		
		for (int i = 0; i < setores.length; i++) {
			System.out.println(setores[i].getSala() + "-" + setores[i]);
		}
		
		//Inferência
		var teste = true; 
				
		//for each
		System.out.println("****************");
		for (Setor s : setores) {
			System.out.println(s.getSala() + "-"+ s);
		}
		
		String[] nomes = {"João, José, Ana"};
		
		for (String s : nomes) {
			System.out.println(s);
		}
		
	}

}