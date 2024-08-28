package animal;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public Cachorro() {
    	
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }
}
