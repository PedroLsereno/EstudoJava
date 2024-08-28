import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int A, B, C, MaiorAB,Maior;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		MaiorAB = (A + B + Math.abs(A - B)) / 2;
		Maior = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;
		
		System.out.println(Maior + " eh o maior");
		sc.close();
	}

}
