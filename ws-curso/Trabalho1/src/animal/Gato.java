package animal;

public class Gato extends Animal{
	
	 public Gato(String nome, String raca, int idade) {
	        super(nome, raca, idade);
	    }

	    @Override
	    public void falar() {
	        System.out.println(nome + " está miando.");
	    }
}
