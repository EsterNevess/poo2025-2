package listas;

import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		//set - não permite elementos duplicados
		//Não mantém a ordem de inserção
		//Set<String> times= new HashSet<> ();
		//mantém a ordem dos elementos
		//Set<String> times = new LinkedHashSet<>();
		
		//Ordena os elementos
		Set<String> times = new TreeSet<>();
		
		times.add("Fluminense");
		times.add("Fluminense");
		times.add("Fluminense");
		times.add("Vasco");
		times.add("América");
		times.add("Bangu");
		times.add("Botafogo");
		times.add("Vasco");
		
		System.out.println(times);
	}

}
