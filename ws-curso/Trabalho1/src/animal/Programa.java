package animal;

public class Programa {

	public static void main(String[] args) {
		 	Cachorro cachorro = new Cachorro("Belinha", "Guaipeca", 5);
	        Gato gato = new Gato("Pantufa", "Laranja", 3);

	        System.out.println(cachorro.toString());
	        cachorro.falar();
	        cachorro.comer();
	        cachorro.andar();

	        System.out.println();

	        System.out.println(gato.toString());
	        gato.falar();
	        gato.comer();
	        gato.andar();
	}

}
