import java.util.Scanner;

import biblioteca.FilaObject;
import biblioteca.PilhaObject;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Criando objeto Fila e a Pilha com o tamanho 10
		FilaObject fila = new FilaObject(10);
		PilhaObject pilha = new PilhaObject(10);
		
//------------------------------------------------------------------
		System.out.println("Quantos elementos vai adicionar? (max 10)");
		int N = sc.nextInt();
		sc.nextLine();
		//Inserindo até 10 elementos na Fila
		for (int i = 0; i < N; i++) {
			System.out.print("Insira o " + (i+1) + "º elemento:" );
			String inserir = sc.nextLine();
			fila.inserir(inserir);
		}
//--------------------------------------------------------------------
		
		//Mostrando a Fila inicial
		System.out.println();
		System.out.println("Fila incial");
		fila.mostrarFila();
				
//--------------------------------------------------------------------
		
		//Invertendo os elementos na fila
		for (int i = 0; i < N; i++) {
			pilha.empilhar(fila.retirar());
		}
		fila.resetFila();//Já que tirei todos elementos da fila, resetei o inico e fim
		
		while (pilha.vazio() == false) {
			fila.inserir(pilha.desempilhar());		
		}
//-----------------------------------------------------------------------
		
		//Mostrando a fila invertida
		System.out.println();
		System.out.println("Fila invertida");
		fila.mostrarFila();
		
		//esvaziando a fila
		for (int i = 0; i < pilha.tamanho(); i++) {
			fila.retirar();
		}
		
		//Mostrando fila e pilha vazia
		System.out.println();
		System.out.println("Fila vazia");
		fila.mostrarFila();
		System.out.println();
		System.out.println("Pilha vazia");
		pilha.mostrarPilha();
		
		sc.close();
	}

}
