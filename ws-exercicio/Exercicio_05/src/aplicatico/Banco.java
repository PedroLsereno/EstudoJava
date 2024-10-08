package aplicatico;

import java.util.Locale;
import java.util.Scanner;
import utilitarios.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cont1;
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome da conta: ");
		String nomeConta = sc.nextLine();
		System.out.print("Vai efetuar um depósito inicial? (y/n) ");
		char respostaDeposito = sc.next().charAt(0);
		
		if (respostaDeposito == 'y') {
			System.out.print("Digite o valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			cont1 = new Conta(numConta,nomeConta,depositoInicial);
		}
		else {
			cont1 = new Conta(numConta,nomeConta);
		}
		
		
		System.out.println();
		System.out.println("Conta Adicionada:");
		System.out.println(cont1.toString());
		
		
		System.out.println();
		System.out.print("Digite o valor a ser adicionado ao seu saldo: ");
		double valor = sc.nextDouble();
		cont1.addSaldo(valor);
		
		System.out.println();
		System.out.println("Conta Atualizda:");
		System.out.println(cont1.toString());
		
		System.out.println();
		System.out.print("Digite o valor a ser removido do seu saldo: ");
		valor = sc.nextDouble();
		cont1.removeSaldo(valor);
		
		System.out.println();
		System.out.println("Conta Atualizda:");
		System.out.println(cont1.toString());
		
		sc.close();
	}

}
