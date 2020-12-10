package es.studium.refactorizacion;

import java.util.Scanner;

public class Geometria2 {
	
	private static final double PI = 3.14;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica el lado del cuadrado:");
		//El valor del radio debemos introducirlo con coma ej.: 15,2
		double radio = entrada.nextDouble();
 
		mostrarLongitud(radio);
		mostrarSuperficie(radio);
		
		entrada.close();
	}
 
	private static void mostrarSuperficie(double radio) {
		double superficie = PI * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}
 
	private static void mostrarLongitud(double radio) {
		double perimetro = 2 * PI * radio;
		System.out.println("El perímetro del círculo es " + perimetro);
	}
}