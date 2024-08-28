package utilitario;

public class Calculator {

		//O termo "final" serve para informar que esse valor é uma constante e não pode mudar
		//Nome de constantes sempre são em letra maiuscula
		public static final double PI = 3.14159;
		
		public static double circunferencia(double raio) {
			return 2.0 * PI * raio;
		}
		
		public static double volume(double raio) {
			return 4.0 * PI * Math.pow(3,raio) / 3.0;
		}
}
