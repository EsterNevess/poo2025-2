package exercicios;

public class TesteLivro {
    public static void main(String[] args) {
        // Crie uma editora
        Editora editora = new Editora("Editora ABC");

        // Crie um autor
        Autor autor = new Autor("Machado de Assis");

        // Crie os livros
        Livro livro1 = new Livro("Dom Casmurro", autor, editora);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor, editora);

        // Adicione os livros ao autor
        autor.adicionarLivro(livro1);
        autor.adicionarLivro(livro2);

        // Adicione capítulos ao livro 1
        livro1.adicionarCapitulo(new Capitulo("Capítulo I: Do meu tempo de garoto"));
        livro1.adicionarCapitulo(new Capitulo("Capítulo II: O beijo da prima Justina"));

        // Adicione capítulos ao livro 2
        livro2.adicionarCapitulo(new Capitulo("Capítulo I: O prêmio da morte"));
        livro2.adicionarCapitulo(new Capitulo("Capítulo II: A verbação dos fatos"));

        // Exiba os dados
        System.out.println("Autor: " + autor.getNome());
        System.out.println("---------------------------------");

        for (Livro livro : autor.getLivros()) {
            System.out.println("Livro: " + livro.getTitulo() + " (Editora: " + editora.getNome() + ")");
            System.out.println("Capítulos:");
            for (Capitulo capitulo : livro.getCapitulos()) {
                System.out.println(" - " + capitulo.getTitulo());
            }
            System.out.println("---------------------------------");
        }
    }
}