package listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> cores = new ArrayList <> ();
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Cinza");
		cores.add("Preto");
		System.out.println(cores);
		
		List<String>outrasCores = new ArrayList<>();
		outrasCores.add("Roxo");
		
		outrasCores.addAll(cores);
		System.out.println(outrasCores);
		System.out.println(outrasCores.get(1));
		System.out.println("Tamanho:"+outrasCores.size());
		System.out.println("Remover:"+outrasCores.remove(0));
		System.out.println("Tem azul na lista:"+(outrasCores.contains("Azul")?"Sim":"Não"));
		
//		for (int i = 0; i < outrasCores.size(); i++) {
//			System.out.println(outrasCores.get(i));
//		}
				
		for (String cor : outrasCores) {
			System.out.println(cor);
		}
	
	}

}
