package entities;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double ValorTotalNoEstoque() {
		return  preco * quantidade;
		
	}
	
	//Quando temos um parametro com o mesmo nome que um atributo, temos uma ambiguidade.
	public void AddProdutos(int quantidade) {
		//Quando usamos o this, estou querendo acessar o atributo da classe
		this.quantidade += quantidade;
	}
	
	public void RemoveProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	//Transformando o objeto em uma string
	public String toString() {
		return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + "und , Total: $" + String.format("%.2f", ValorTotalNoEstoque());
	}
}
