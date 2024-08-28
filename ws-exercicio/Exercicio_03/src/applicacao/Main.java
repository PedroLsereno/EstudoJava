package applicacao;

import java.util.Locale;
import java.util.Scanner;
import utilidades.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = sc.nextLine();
		aluno1.nota1 = sc.nextDouble();
		aluno1.nota2 = sc.nextDouble();
		aluno1.nota3 = sc.nextDouble();
		
		System.out.println(aluno1);
		sc.close();
	}

}
