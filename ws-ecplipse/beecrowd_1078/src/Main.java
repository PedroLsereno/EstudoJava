import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for(int i = 0;i < 10; i++) {
			int multiplicacao = (i+1) * N;
			System.out.println(i+1 + " x "+ N + " = " + multiplicacao);
		}
		sc.close();
	}

}
