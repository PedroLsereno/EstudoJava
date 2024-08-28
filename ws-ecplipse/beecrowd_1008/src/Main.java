import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ID, horas;
		double valor, salario;
		
		ID = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = valor * horas;
		System.out.println("NUMBER = " + ID);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
