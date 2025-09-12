package luta;

public class TesteLuta {
    public static void main(String[] args) {
        // Crie três categorias e lutadores
        Lutador lutador1 = new Lutador("José Aldo", 35, 69.5); // Peso Leve
        Lutador lutador2 = new Lutador("Anderson Silva", 46, 83.0); // Peso Médio
        Lutador lutador3 = new Lutador("Jon Jones", 38, 115.0); // Peso Pesado
        Lutador lutador4 = new Lutador("Charles do Bronx", 34, 70.3); // Peso Leve

        // Crie uma luta válida (mesma categoria, lutadores diferentes)
        Luta lutaValida = new Luta(lutador1, lutador4, 5);
        if (lutaValida.confirmarLuta()) {
            System.out.println("Luta Confirmada!"); 
            System.out.println("Lutadores: " + lutador1.getNome() + " vs " + lutador4.getNome());
            System.out.println("Categoria: " + lutador1.getCategoria().getTipo());
        } else {
            System.out.println("Luta Cancelada!"); 
        }

        System.out.println("-----------------------------------");

        // Crie uma luta inválida (categorias diferentes)
        Luta lutaInvalida = new Luta(lutador1, lutador2, 3);
        if (lutaInvalida.confirmarLuta()) {
            System.out.println("Luta Confirmada!"); 
        } else {
            System.out.println("Luta Cancelada!"); 
            System.out.println("Motivo: Categorias diferentes.");
        }
    }
}