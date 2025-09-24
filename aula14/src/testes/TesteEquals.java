package testes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entity.Fornecedor;

public class TesteEquals {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("1234", "ABC 123444444");
		Fornecedor f2 = new Fornecedor("123", "ABC 123");
		Fornecedor f3 = new Fornecedor("1234", "ABCD 1234");

		List<Fornecedor> fornecedores = Arrays.asList(f1,f2,f3);
	    
		Set<Fornecedor> fornecedoresSet = new HashSet<>();
	    fornecedoresSet.addAll(fornecedores);
		
		//System.out.println(fornecedoresSet);
		for (Fornecedor fornecedor : fornecedoresSet) {
			System.out.println(fornecedor.getCnpj() + "-" + fornecedor.getRazaoSocial());
		}
		
	}

}