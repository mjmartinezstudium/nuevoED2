package es.studium.refactorizacion;

public class GeometriaSinRef {
	 
	private static final double PI = 3.14;

	public static void main(String[] args) {
		int numero = 13; // radio del c�rculo;
 
		perimetro(numero);
 
		superficie(numero);
	}

	private static void superficie(int numero) {
		double numero3 = PI * numero * numero;
		System.out.println("La superficie del c�rculo es " + numero3);
	}

	private static void perimetro(int numero) {
		double numero2 = 2 * PI * numero;
		System.out.println("El per�metro del c�rculo es " + numero2);
	}
 
}