import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior, menor, X,Y,soma;
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if (X > Y) {
			maior = X;
			menor = Y;
		}
		else {
			maior = Y;
			menor = X;
		}
		soma = 0;
		for (int i = menor +1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		
		sc.close();
	}

}
