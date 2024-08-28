package Aula2;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta c1 = new Conta();
		c1.setNroConta(5555);
		System.out.println(c1.getNroConta());
		
		Conta c2 = new Conta(555,"Pedro",5000.00,"08/08/2024");
		System.out.println(c2.getData());
		System.out.println(c2.getNomeConta());
		System.out.println(c2.getNroConta());
		System.out.printf("%.2f%n",c2.getSaldo());
	}

}
