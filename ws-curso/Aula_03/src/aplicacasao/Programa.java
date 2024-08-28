package aplicacasao;

import java.util.Locale;
import java.util.Scanner;
import utilitario.Calculator;

public class Programa {
	
	
	//Por a classe ser estatica, não é possível chamar membros que não são estaticos
	//Então o método crcunferencia e volume são obrigados a ter o static
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número do raio: ");
		double raio = sc.nextDouble();
		
		//Ao invez de chamar um objeto, chamo a propria classe
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	

}
