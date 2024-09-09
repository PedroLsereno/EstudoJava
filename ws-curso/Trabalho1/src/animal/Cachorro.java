package animal;

public class Cachorro extends Animal {
	public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    @Override
    public void falar() {
        System.out.println(nome + " está latindo.");
    }
	
}
