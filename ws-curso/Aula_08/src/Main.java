
public class Main {

	public static void main(String[] args) {
		// Estudando for-each
		
		String[] vet = new String[] {"Maria", "Pedro", "João"};
		
		//Maneira que é feita normalmente
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.println();
		
		//Usando o for-each -- Para cada objeto nomeQualquer contido no vetor vet faça:
		//1º Inicio colocando o Tipo de dado, nesse caso String
		//2º Coloco um apelido qualquer, nesse caso nomeQualquer
		//3º Coloco a coleção que vou buscar, nesse caso é um vetor com nome vet
		for (String nomeQualquer : vet) {
			System.out.println(nomeQualquer);
		}
	}

}
