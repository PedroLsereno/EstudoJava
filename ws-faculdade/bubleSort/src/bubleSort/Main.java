package bubleSort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		System.out.println("BUBBLE SORT");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		
		//BUBBLE SORT
		int troca;
		for(int i = 0; i < vetor.length; i++) {
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					troca = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = troca;
				}
			}
		}
		System.out.println("\nVetor em ordem:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		
	}

}
