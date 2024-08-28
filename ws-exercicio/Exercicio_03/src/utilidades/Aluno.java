package utilidades;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public String verificandoNota() {
		if(notaTotal() > 60.0) {
			return "Passado";
		}
		else {
			double notaFaltante = 60.0 - notaTotal();
			return "Reprovado \nFaltou " + String.format("%.2f", notaFaltante) + " pontos";
		}
	}
	
	public String toString() {
		return "Grade Final = " + String.format("%.2f", notaTotal()) + "\n" + verificandoNota();
	}
}
