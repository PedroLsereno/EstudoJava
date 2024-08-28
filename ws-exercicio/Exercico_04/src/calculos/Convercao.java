package calculos;

public class Convercao {
	
	public static double convercao(double dolarAtual, double totalDolar) {
		return dolarAtual * totalDolar;
	}
	
	public static double convercaoComImposto(double dolarAtual, double totalDolar) {
		return convercao(dolarAtual,totalDolar) + (convercao(dolarAtual,totalDolar) * 0.06);
	}
}
