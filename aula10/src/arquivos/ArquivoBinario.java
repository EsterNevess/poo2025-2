package arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArquivoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("\\aula\\arquivo.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(arquivo);
			gravarArquivo.writeChars("Boa noite! Aula de Arquivos");
			gravarArquivo.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}