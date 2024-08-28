package calculo;

import java.util.Locale;
import java.util.Scanner;
import utilidades.Retangulo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo1 = new Retangulo();
		
		System.out.println("Entre com o valor da altura e largura do retângulo: ");
		retangulo1.altura = sc.nextDouble();
		retangulo1.largura = sc.nextDouble();
		
		System.out.println("AREA = " + retangulo1.area());
		System.out.printf("PERIMETRO = %.2f%n",retangulo1.perimetro() );
		System.out.printf("DIAGONAL = %.2f%n", retangulo1.diagonal());
		sc.close();
	}

}
