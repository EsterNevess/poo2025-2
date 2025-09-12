package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args) throws FileNotFoundException {
//		try {
//			FileReader leitura = new FileReader("c:/aula/foto1.jpg");
//			System.out.println("Arquivo encontrado");
//		} catch (FileNotFoundException e) {
//			System.out.println("Arquivo não encontrado!");
//			//e.printStackTrace();
//		}
		FileReader leitura = new FileReader("c:/aula/foto1.jpg");
	}

}