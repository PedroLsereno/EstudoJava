package teste;

public class Main {

	public static void main(String[] args) {
		Integer[] vet = new Integer[] {2,7,7,2,3,7};
		
		int aux = 0;
		int troca = 0;
		boolean verificador = true;
		aux = vet[troca];
		while(verificador != false) {
			for(int i = 1; i < vet.length; i++) {
				vet[troca] = 0;
				if(vet[i] == aux) {
					troca += 1;
					aux = vet[troca];
					i = 0;
				}
			}
			verificador = true;
		}
		System.out.println("Valor único: " + aux);
	}
}
