package petshop;

public class Cachorro extends AnimalDeEstimacao {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void imprimir() {
        System.out.println("Cachorro - Nome: " + getNome() + ", Idade: " + getIdade() + " anos, Raça: " + raca);
    }
}
