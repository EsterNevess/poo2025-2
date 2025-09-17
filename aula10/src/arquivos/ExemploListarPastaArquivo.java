package arquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploListarPastaArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo ou Pasta:\n");
		String nome = sc.nextLine();

		File file = new File(nome);

		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\n Arquivo (%s) existe - tamanho: %d bytes", file.getName(),
						file.length());
			} else {
				System.out.println("\n Conteúdo da Pasta:");
				// String[] diretoriosArquivos= file.list();

				for (String s : file.list()) {
					System.out.printf("%s\n", s);
				}

			}

		} else {
			System.out.println("Arquivo não encontrado!");
		}

	}

}