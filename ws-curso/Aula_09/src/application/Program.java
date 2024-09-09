package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		//Não aceita de tipos primitivos, então se quizer usar, use o wapper class
		List<String> list;

		//Agora tenho que Instanciar a lista para poder utilizar ela
		list = new ArrayList<>();
		
		//Ou pode escrever assim: List<Integer> list = new ArrayList<>();
		
		//Adicionando elementos na lista
		list.add("Pedro");
		list.add("Joao");
		list.add("Maria");
		list.add("Ana");
		list.add("Alex");
		
		//Como adicionar um elemento em algum lugar da lista
		list.add(2, "Marcos");
		
		//Como ver o tamanho da lista
		System.out.println(list.size());
		
	
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------");
		//Como remover um elemento da lista
		list.remove("Ana");
		list.remove(1);

		//Removendo através de um predicado
		list.removeIf(x -> x.charAt(0) ==  'M'); //Removendo o elemento x tal que x é igual a M
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------");
		//Encontrar posição de um elemento
		System.out.println("Encontrando o elemento Pedro: " + list.indexOf("Pedro"));
		System.out.println("Encontrando um elemento que n existe: " + list.indexOf("Jose	"));
		
		System.out.println("------------------------");
		list.add("Joao");
		list.add("Maria");
		list.add("Marcos");
		list.add("Ana");
		
		//Filtrando a lista
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		//.stream() converte a lista parta stream, sendo possivel usar o predicado (funcao lambda)
		//.filter() é um predicado
		//.collect(Collectors.toList()) converte novamente para lista
		
		for(String nome: resultado) {
			System.out.println(nome);
		}
		
		System.out.println("------------------------");
		//Encontrar o meu primeiro elemento baseado no predicado (função lambda)
		String name = list.stream().filter( x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//.stream converte a lista parta stream, sendo possivel usar o predicado (funcao lambda)
		//.filter() é um predicado
		//.findFirst() pega o primeiro elemento
		//.orElse(null) se n encontrar nada no findFirst ele retorna um valor nulo
		
		System.out.println(name);
		
	}
}
