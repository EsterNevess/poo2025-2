package testes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import entity.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(new Fornecedor("123", "ABC 123"));
		fornecedores.add(new Fornecedor("345", "XPTO 345"));
		
//		try {
//			FileOutputStream arquivo = new FileOutputStream("/curso/fornecedor.dat");
//			ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
//			gravarArquivo.writeObject(fornecedores);
//			gravarArquivo.flush();
//			gravarArquivo.close();
//			//arquivo.close();
//			System.out.println("Arquivo com objetos gravado em disco com sucesso!");
//			
//		} catch (Exception e) {
//			
//			System.err.println("Arquivo não encontrado!");
//			e.printStackTrace();
//		}
		
		System.out.println("Recuperando arquivo com objetos!");
		
		try {
			FileInputStream arquivo =  new FileInputStream("/curso/fornecedor.dat");
			ObjectInputStream lerArquivo = new ObjectInputStream(arquivo);
			fornecedores = (ArrayList<Fornecedor>) lerArquivo.readObject();
			lerArquivo.close();
			arquivo.close();
			System.out.println(fornecedores);
		} catch (Exception e) {
			System.err.println("Arquivo corrompido!");
			e.printStackTrace();
		}
		
	}
}