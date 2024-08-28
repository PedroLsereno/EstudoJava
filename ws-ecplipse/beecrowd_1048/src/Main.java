import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, ajuste, novoSalario;
		int porcentagem;
		salario = sc.nextDouble();
		
		if (salario <= 400.0) {
			porcentagem = 15;
			ajuste = salario * (porcentagem / 100.0);
			novoSalario = salario + ajuste;
		}
		else if (salario > 400.0 && salario <= 800.0) {
			porcentagem = 12;
			ajuste = salario * (porcentagem / 100.0);
			novoSalario = salario + ajuste;
		}
		else if (salario > 800.0 && salario <= 1200.0) {
			porcentagem = 10;
			ajuste = salario * (porcentagem / 100.0);
			novoSalario = salario + ajuste;
		}
		else if (salario > 1200.0 && salario <= 2000.0) {
			porcentagem = 7;
			ajuste = salario * (porcentagem / 100.0);
			novoSalario = salario + ajuste;
		}
		else {
			porcentagem = 4;
			ajuste = salario * (porcentagem / 100.0);
			novoSalario = salario + ajuste;
		}
		
		System.out.printf("Novo salario: %.2f%n",novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n",ajuste);
		System.out.println("Em percentual: " + porcentagem + " %");
		
		sc.close();
	}

}
