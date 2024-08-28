import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ID, qtd;
		double total, custo;
		
		custo = 0;
		ID = sc.nextInt();
		qtd = sc.nextInt();
		
		switch(ID) {
		case 1:
			custo = 4.00;
			break;
		case 2:
			custo = 4.50;
			break;
		case 3:
			custo = 5.00;
			break;
		case 4:
			custo = 2.00;
			break;
		case 5:
			custo = 1.50;
			break;
		default:
			System.out.println("Código inválido");
			break;
		}
		
		total = custo * qtd;
		System.out.printf("Total: R$ %.2f%n",total);
		sc.close();
	}

}
