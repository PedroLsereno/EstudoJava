import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Iniciando um vetor do tipo primário, ele inicia com os valores iniciais dele
		//ex: int inicia = 0, então o vetor vai ter o 0 em cada posicao
		int[] vetorzao = new int[10];
		vetorzao[0] = 15;
		vetorzao[1] = 3;
		vetorzao[2] = 20;
		vetorzao[3] = 23;
		vetorzao[4] = 55;
		vetorzao[5] = 10;
		vetorzao[6] = 11;
		vetorzao[7] = 6;
		vetorzao[8] = 89;
		vetorzao[9] = 16;
		System.out.println(vetorzao[0]);
		
		//OU
		int[] vetorzao2 = new int[] {15,3,20,23,55,10,11,6,89,16};
		
		//Como imprimir o vetor
		System.out.println("\nVetorzao 2");
		for(int i = 0; i < vetorzao2.length; i++) {
			System.out.print(vetorzao2[i] + " ");
		}
		
		System.out.println();
		
		//vetor com String
		String[] estados = new String[]{"AC","BA","CE","DF","AM","AP","PB","RN","MS","SP"};
		
		System.out.println("\nEstados");
		for(int i = 0; i < estados.length; i++) {
			System.out.print(estados[i] + " ");
		}
		
		System.out.println();
		
		//Busca Linear
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual estado que deseja buscar?");
		String busca = sc.next();
		
		for(int i = 0; i < estados.length; i++){
			if(busca.equals(estados[i])) {
				System.out.println("Achou");
				break;
			}
		}
		
		sc.close();
	}

}
