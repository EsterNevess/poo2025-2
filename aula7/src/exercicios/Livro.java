package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private Editora editora;
    private List<Capitulo> capitulos;

    public Livro(String titulo, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        this.capitulos.add(capitulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }
}