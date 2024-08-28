package empresa;

public class Funcionarios {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public void aumentoSalario(double percentual) {
		salarioBruto += (salarioBruto * percentual) / 100;
	}
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", salarioLiquido());
	}
}
