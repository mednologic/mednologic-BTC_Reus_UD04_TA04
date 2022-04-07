/**
 * 
 * @author joseporiollopezbosch
 *
 */

package Pr01;

public class Exercise01 {

	public static void main(String[] args) {
//Declaración de variables
		int num1 = 2836;
		int num2 = 122;
		int suma;
		int resta;
		int multiplicacion;
		float division;
		float modulo;
//Lógica		
		suma 			= num1 + num2;
		resta 			= num1 - num2;
		multiplicacion 	= num1 * num2;
		division		= num1 / num2;
		modulo			= num1 % num2;
		
//Salida		
		System.out.println("La suma de: "+num1+" y "+num2+" es: "+ suma);
		System.out.println("\nLa resta de: "+num1+" y "+num2+" es: "+ resta);
		System.out.println("\nLa multiplicacion de: "+num1+" y "+num2+" es: "+ multiplicacion);
		System.out.println("\nLa division de: "+num1+" y "+num2+" es: "+ division);
		System.out.println("\nEl módulo de: "+num1+" y "+num2+" es: "+ modulo);

	}

}
