package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import calculos.Convercao;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto está valendo o dolar? ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.print("Quantos dolares vai comprar? ");
		double comprarDolar = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais: %.2f%n", Convercao.convercaoComImposto(cotacaoDolar,comprarDolar));
		
		sc.close();
	}

}
