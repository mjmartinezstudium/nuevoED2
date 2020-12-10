package es.studium.refactorizacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Geometria {
	private static final double PI = 3.14;
	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Indica el lado del cuadrado:");
		int radio = Integer.valueOf(entrada.readLine());
 
		mostrarLongitud(radio);
 
		mostrarSuperficie(radio);
	}
 
	private static void mostrarSuperficie(int radio) {
		double superficie = PI * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}
 
	private static void mostrarLongitud(int radio) {
		double perimetro = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + perimetro);
	}
}