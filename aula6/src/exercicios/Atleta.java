package exercicios;

public class Atleta {
    private String nome;
    private double peso;
    private Pais pais;
    private String modalidade;

    // Construtor default
    public Atleta() {
    }

    // Construtor com atributos
    public Atleta(String nome, double peso, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.pais = pais;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public String getModalidade() {
        return modalidade;
    }

    // Método para verificar a situação do atleta
    public String verificaSituacao() {
        if (this.peso > 90) {
            this.modalidade = "peso pesado";
            return "participará";
        } else if (this.peso >= 60 && this.peso <= 90) {
            this.modalidade = "peso médio";
            return "participará";
        } else {
            return "Não Participará";
        }
    }
}