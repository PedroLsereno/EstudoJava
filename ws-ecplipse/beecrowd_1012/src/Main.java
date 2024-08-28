import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, area;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		area = (A*C) / 2.0;
		System.out.printf("TRIANGULO: %.3f%n",area);
		
		area = 3.14159 * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n",area);
		
		area = ((A + B) * C) / 2.0;
		System.out.printf("TRAPEZIO: %.3f%n",area);
		
		area = B * B;
		System.out.printf("QUADRADO: %.3f%n",area);
		
		area = A * B;
		System.out.printf("RETANGULO: %.3f%n",area);
		sc.close();
	}

}
