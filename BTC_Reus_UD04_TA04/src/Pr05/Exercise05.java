package Pr05;

/**
 * 
 * @author joseporiollopezbosch
 *
 */

public class Exercise05 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;
		
		System.out.println("\n A = "+a+
				"\n B = "+b+
				"\n C = "+c+
				"\n D = "+d+"\n");	
		//Reasignamos valores a las variables
		System.out.println("Reasignación de valores a variables");
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("\n A = "+a+
				"\n B = "+b+
				"\n C = "+c+
				"\n D = "+d);
	}

}
