package empresa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios funcionario1 = new Funcionarios();
		
		System.out.print("Nome: ");
		funcionario1.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario1.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario1.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionário: " + funcionario1);
		
		System.out.println();
		System.out.print("Qual a porcentagem do aumento do salário? ");
		funcionario1.aumentoSalario(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + funcionario1);
		sc.close();
	}

}
