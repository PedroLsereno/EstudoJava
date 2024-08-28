
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		System.out.println("Convertendo tudo para minuscolo:");
		String s01 = original.toLowerCase();
		System.out.println("-" + s01 + "-");
		
		System.out.println();
		System.out.println("Convertendo tudo para maiusculo:");
		String s02 = original.toUpperCase();
		System.out.println("-" + s02 + "-");

		System.out.println();
		System.out.println("Tirando os espaços das extremidades:");
		String s03 = original.trim();
		System.out.println("-" + s03 + "-");
		
		System.out.println();
		System.out.println("Recortando o texto a partir de um caractere:");
		String s04 = original.substring(2);
		System.out.println("-" + s04 + "-");
		
		System.out.println();
		System.out.println("Recortando o texto a partir de um caractere:");
		String s05 = original.substring(2,10);
		System.out.println("-" + s05 + "-");
		
		System.out.println();
		System.out.println("Trocando um caractere por outro:");
		String s06 = original.replace("a", "x");
		System.out.println("-" + s06 + "-");
		String s07 = original.replace("abc", "xy");
		System.out.println("-" + s07 + "-");
		
		System.out.println();
		System.out.println("Vendo a primeira e ultima posição de uma string/caractere:");
		int s08 = original.indexOf("ab");
		System.out.println("-" + s08 + "-");
		int s09 = original.lastIndexOf("ab");
		System.out.println("-" + s09 + "-");
		
		/*
		Comentário em bloco 
		*/
		
		//Comentário em linha
		System.out.println();
		String s = "potato apple lemon";
		String[] vet = s.split(" ");
		for (int i = 0; i < 3; i++) {
			System.out.println(vet[i]);
		}
	}

}
