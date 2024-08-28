import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,resultado,resto;
		N = sc.nextInt();
		System.out.println(N);
		
		resto = N;
		resultado = resto / 100;
		System.out.println(resultado + " nota(s) de R$ 100,00");
		resto = resto % 100;
		
		resultado = resto / 50;
		System.out.println(resultado + " nota(s) de R$ 50,00");
		resto = resto % 50;
		
		resultado = resto / 20;
		System.out.println(resultado + " nota(s) de R$ 20,00");
		resto = resto % 20;
		
		resultado = resto / 10;
		System.out.println(resultado + " nota(s) de R$ 10,00");
		resto = resto % 10;
		
		resultado = resto / 5;
		System.out.println(resultado + " nota(s) de R$ 5,00");
		resto = resto % 5;
		
		resultado = resto / 2;
		System.out.println(resultado + " nota(s) de R$ 2,00");
		resto = resto % 2;
		
		System.out.println(resto + " nota(s) de R$ 1,00");
		sc.close();
	}

}
