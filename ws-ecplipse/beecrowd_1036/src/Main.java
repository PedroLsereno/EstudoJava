import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta,x1,x2;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = Math.pow(B, 2) - 4 * A * C;
		
		if (A <= 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			x1 = (-B + Math.sqrt(delta)) / (2 * A);
			x2 = (-B - Math.sqrt(delta)) / (2 * A);
			
			System.out.printf("R1 = %.5f%n",x1);
			System.out.printf("R2 = %.5f%n",x2);
		}
		
		sc.close();
	}

}
