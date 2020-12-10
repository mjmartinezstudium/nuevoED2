package es.studium.refactorizacion;

public class GeometriaRef {
	
	private static final double PI = 3.14;

	public static void main(String[] args) {
		
		/*Refactorizaci�n aplicada: renombrar variables numero, numero2 y numero3 a radio, longitud y superficie*/
		/*Extraer constante 3.14 a PI*/
		/*Extrar m�todos mostrarLongitud() y mostrarSuperficie()*/
		/*Inline en la variable local mensaje*/
		
		int radio = 13; // radio del c�rculo;
		
		mostrarLongitud(radio);
 
		mostrarSuperficie(radio);
	}

	private static void mostrarSuperficie(int radio) {
		double superficie = PI * radio * radio;
		System.out.println("La superficie del c�rculo es " + superficie);
	}

	private static void mostrarLongitud(int radio) {
		double longitud = 2 * PI * radio;
		System.out.println("El per�metro del c�rculo es " + longitud);
	}

}
