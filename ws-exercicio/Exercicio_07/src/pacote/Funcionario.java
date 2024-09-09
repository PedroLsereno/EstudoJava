package pacote;

public class Funcionario {
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void salarioAtualizado(double porcentagem) {
		salario += + (salario * (porcentagem / 100.0));
	}
	
	public String toString() {
		return id + "," + nome + "," + String.format("%.2f", salario);
	} 
	
	
}
