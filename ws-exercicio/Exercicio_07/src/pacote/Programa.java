package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionario serão registrados?");
		int N = sc.nextInt();
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		int id;
		for(int i = 0; i < N; i++) {
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			//Adicionar o funcionario em uma lista
			Funcionario func1 = new Funcionario(nome,id,salario);
			listaFuncionarios.add(func1);
		}
		
		
		System.out.println("Entre com o ID do funcionário que vai receber aumento: ");
		final int idBusca = sc.nextInt();
		//Maneira um de procurar o ID
		Funcionario result = listaFuncionarios.stream().filter(x -> x.getId() == idBusca).findFirst().orElse(null);
		if(result != null) {
			System.out.print("Entre com a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			result.salarioAtualizado(porcentagem);
		}
		else {
			System.out.println("Id não encontrado.");
		}
		
		//Maneira dois de procurar o ID
//		int idBusca = sc.nextInt();
//		Integer posicao = posicaoID(listaFuncionarios,idBusca); 
//		if(result != null) {
//			System.out.print("Entre com a porcentagem do aumento: ");
//			double porcentagem = sc.nextDouble();
//			list.get(posicao).salarioAtualizado(porcentagem);
//		}
//		else {
//			System.out.println("Id não encontrado.");
//		}
		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for(Funcionario func: listaFuncionarios) {
			System.out.println(func);
		}
		sc.close();
	}
	
	//Método utilizado na maneira dois para achar o ID
	public static Integer posicaoID(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
