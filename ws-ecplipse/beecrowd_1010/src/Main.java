import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ID_1, und_peca_1,ID_2, und_peca_2;
		double valor_peca_1, valor_peca_2,soma;
		
		ID_1 = sc.nextInt();
		und_peca_1 = sc.nextInt();
		valor_peca_1 = sc.nextDouble();
		
		ID_2 = sc.nextInt();
		und_peca_2 = sc.nextInt();
		valor_peca_2 = sc.nextDouble();
		
		soma = und_peca_1 * valor_peca_1 + und_peca_2 * valor_peca_2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
		
		sc.close();
	}

}
