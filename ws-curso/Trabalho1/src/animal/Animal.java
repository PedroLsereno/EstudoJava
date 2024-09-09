package animal;

public class Animal {
	    protected String nome;
	    protected String raca;
	    protected int idade;

	    public Animal(String nome, String raca, int idade) {
	        this.nome = nome;
	        this.raca = raca;
	        this.idade = idade;
	    }

	    public void andar() {
	        System.out.println(nome + " está andando.");
	    }

	    public void falar() {
	        System.out.println(nome + " está fazendo um som.");
	    }

	    public void comer() {
	        System.out.println(nome + " está comendo.");
	    }
	    
	    public String toString() {
	        return "Animal: " + getClass().getSimpleName() + ", Nome: " + nome + ", Idade: " + idade + " anos";
	    }
}

