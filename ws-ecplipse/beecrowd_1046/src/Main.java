import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim,tempo;
		tempo = 0;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			tempo = fim - inicio;
		}
		else {
			tempo = 24 - inicio + fim;
		}
	
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		sc.close();
	}

}
