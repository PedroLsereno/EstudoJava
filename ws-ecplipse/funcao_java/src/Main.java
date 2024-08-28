import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*SEM A FUNÇÃO
		int maior;
		if (a > b && a > c) {
			maior = a;
		}
		else if (b > a && b > c) {
			maior = b;
		}
		else {
			maior = c;
		}
		*/
		
		//Usando as funções criadas
		int maior2 = max(a,b,c);
		resultado(maior2);
		
		
		
		//Usando uma função com objeto
		Main obj = new Main();
		obj.resultado2(maior2);
		
		sc.close();
	}
	
	/*
	 O public sinaliza que essa função pode ser chamada em outras class.
	 Pode ser trocado por protected(acessívlel dentro do pacote ou subclass), ou private(acessivel apenas dentro dessa class) ou sem nada (acessível apenas dentro do pacote)
	 
	 O static é para que a função possa ser chamada independente de se criar um objeto. Ou seja, sem precisar ser instanciado e pertence a aquela class.
	 Funções sem o static, precisam de um objeto para serem utilizadas.
	 
	 o int sinaliza o tipo de dado que essa função vai retornar
	 Sempre que tiver um retorno, esse retono deve ser colocado em uma variavel
	 
	 o max é o nome da função e o que está dentro do () é os tipo de dados de entrada que a função vai receber.
	 
	 */
	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		}
		else if (b > a && b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}
	
	//Void é quando a função n vai retornar valor algum.
	public static void resultado(int valor) {
		System.out.println("Maior = " + valor);
	}
	
	public void resultado2(int valor) {
		System.out.println("Maior = " + valor);
	}

}
