package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Entrando com os valores
		System.out.println("Ente com os valores: ");
		System.out.print("Nome: ");
		Produtos produto = new Produtos();
		produto.nome = sc.next();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		//Duas maneiras de mostrar o toString
		System.out.println();
		System.out.println("Product Data: " + produto.toString());
		System.out.println("Product Data: " +produto);
		
		System.out.println();
		System.out.print("Entre com o número para adicionar ao estoque: ");
		int qtd = sc.nextInt();
		produto.AddProdutos(qtd);
		
		System.out.println();
		System.out.println("Updated Data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o número para remover ao estoque: ");
		qtd = sc.nextInt();
		produto.RemoveProdutos(qtd);
		
		System.out.println();
		System.out.println("Updated Data: " + produto);
		sc.close();
	}

}
