package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TesteDados {
    public static void main(String[] args) {
        // Criando o Estado
        Estado rj = new Estado("Rio de Janeiro", "RJ");

        // Criando a Cidade
        Cidade petropolis = new Cidade("Petrópolis", rj);

        // Criando o Endereço
        Endereco robertaEndereco = new Endereco(
            "Rua Fonseca Ramos 181",
            "Centro",
            "25620-020",
            petropolis
        );

        // Criando a lista de Telefones
        List<Telefone> telefonesRoberta = new ArrayList<>();
        telefonesRoberta.add(new Telefone("2234-1250"));
        telefonesRoberta.add(new Telefone("2237-1350"));

        // Criando o objeto Contato
        Contato roberta = new Contato("Roberta", robertaEndereco, telefonesRoberta);

        // Exibindo os dados no console
        System.out.println("Nome: " + roberta.getNome());
        System.out.println("Rua: " + roberta.getEndereco().getRua() + " " +
                           "Bairro: " + roberta.getEndereco().getBairro() + " " +
                           "CEP: " + roberta.getEndereco().getCep() + " " +
                           "Cidade: " + roberta.getEndereco().getCidade().getNomeCidade() + " " +
                           "Estado: " + roberta.getEndereco().getCidade().getEstado().getSigla());
        
        // Exibindo os telefones
        roberta.mostrarTelefones();
    }
}