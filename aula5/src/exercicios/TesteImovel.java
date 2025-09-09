package exercicios;

public class TesteImovel {
    public static void main(String[] args) {
        // Criando um objeto da classe Casa
        Casa minhaCasa = new Casa("Rua dos Ipês, 123", 500000.00, true);
        
        // Criando um objeto da classe Proprietario para a Casa
        Proprietario proprietarioCasa = new Proprietario("João Silva", minhaCasa);
        
        // Exibindo os dados da Casa e o valor a pagar
        System.out.println("--- Dados do Proprietário e Imóvel ---");
        System.out.println("Proprietário: " + proprietarioCasa.getNome());
        System.out.println(minhaCasa.toString());
        System.out.println("Possui garagem: " + (minhaCasa.temGaragem() ? "Sim" : "Não"));
        
        double valorAPagarCasa = minhaCasa.calcularImpostoVenda();
        System.out.println("Valor a receber após o imposto: R$" + String.format("%.2f", valorAPagarCasa));
        System.out.println("-------------------------------------");

        // Criando um objeto da classe Apto
        Apto meuApto = new Apto("Av. Central, 456", 250000.00, 5);

        // Criando um objeto da classe Proprietario para o Apartamento
        Proprietario proprietarioApto = new Proprietario("Maria Oliveira", meuApto);
        
        // Exibindo os dados do Apartamento e o valor a pagar
        System.out.println("\n--- Dados do Proprietário e Imóvel ---");
        System.out.println("Proprietário: " + proprietarioApto.getNome());
        System.out.println(meuApto.toString());
        System.out.println("Andar: " + meuApto.getAndar());

        double valorAPagarApto = meuApto.calcularImpostoVenda();
        System.out.println("Valor a receber após o imposto: R$" + String.format("%.2f", valorAPagarApto));
        System.out.println("-------------------------------------");
    }
}