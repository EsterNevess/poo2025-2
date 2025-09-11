package exercicios;

public class TesteAtleta {
    public static void main(String[] args) {
        int totalParticipantes = 0;

        // Criar os objetos do tipo Pais
        Pais brasil = new Pais("Brasil");
        Pais eua = new Pais("EUA");

        // Criar os objetos do tipo Atleta
        Atleta atleta1 = new Atleta("Anderson Silva", 98, brasil);
        Atleta atleta2 = new Atleta("Jon Jone", 59, eua);
        Atleta atleta3 = new Atleta("Vitor Belfort", 110, brasil);

        // Array para facilitar a iteração sobre os atletas
        Atleta[] atletas = {atleta1, atleta2, atleta3};

        // Loop para verificar a situação de cada atleta e exibir o resultado
        for (Atleta atleta : atletas) {
            String situacao = atleta.verificaSituacao();
            System.out.println("O atleta " + atleta.getNome() + " " + situacao);
            
            if (situacao.equalsIgnoreCase("participará")) {
                totalParticipantes++;
            }
        }

        // Exibir o total de participantes
        System.out.println("Total de Participantes: " + totalParticipantes);
    }
}