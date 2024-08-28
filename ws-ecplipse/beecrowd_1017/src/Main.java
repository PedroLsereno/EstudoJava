import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade, distancia;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		distancia = velocidade * tempo;
		
		double gasto = distancia / 12.0;
		
		System.out.printf("%.3f%n", gasto);
		
		sc.close();
	}

}
