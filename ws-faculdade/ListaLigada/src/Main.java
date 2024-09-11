
public class Main {

	public static void main(String[] args) {
		//Lista Ligada = Lista Encadeada
		//A lista sempre sabe quem é se próximo
		//Possui tamanho dinâmico
		//Para acessar  um elemento tenho que bustar pela lista
		
		
		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("Tamanho da lista: " +lista.getTamanho());
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
	}

}
