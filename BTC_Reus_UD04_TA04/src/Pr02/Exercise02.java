/**
 * 
 * @author joseporiollopezbosch
 *
 */

package Pr02;

public class Exercise02 {

	public static void main(String[] args) {
//Declaración variables
		int 	varN = 12;
		double 	varA = 63.657;
		char 	varC = 'a';
		
		double 	suma;
		double 	diferencia;
		int 	valNumChar;
//Lógica
		suma 		= varN+varA;
		diferencia 	= varA-varN;
//Salida

		System.out.println("Variable N: "+varN);
		System.out.println("Variable A: "+varA);
		System.out.println("Variable C: "+varC);
		System.out.println("\n"+varN+" + "+varA+" = "+suma);
		System.out.println("\n"+varA+" - "+varN+" = "+diferencia);
		System.out.println("Valor numérico del caracter '"+varC+"' es: "+ (int)varC);
	}

}
