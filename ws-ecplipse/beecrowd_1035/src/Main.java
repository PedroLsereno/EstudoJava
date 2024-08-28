import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,somaAB,somaCD, par;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		somaAB = A + B;
		somaCD = C + D;
		
		par = A % 2;
		
		if (B>C && D>A && somaCD>somaAB && C>0 && D>0 && par == 0 ) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		sc.close();
	}

}
