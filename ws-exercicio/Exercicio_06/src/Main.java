import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números vão ser adicionados?");
		int N = sc.nextInt();
		
		int[] vet = new int[N];
		
		int valor;
		for (int i = 0; i < vet.length; i++ ) {
			valor = sc.nextInt();
			vet[i] = valor;
		}
		
		System.out.println("Valores Negativos:");
		for (int i = 0; i < vet.length; i++ ) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}	
		sc.close();
	}

}
