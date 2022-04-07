package Pr03;

/**
 * 
 * @author joseporiollopezbosch
 * 
 */

public class Exercise03 {

	public static void main(String[] args) {
//Declaration
		int x = 24;
		int y = 9;
		double n = 20.332;
		double m = 1.233;
		
		int 	suma1 		= x + y;
		int 	resta1		= x - y;
		int 	producto1	= x * y;
		int 	cociente1 	= x / y;
		int		resto1		= x % y;
		double	suma2		= n + m;
		double	resta2		= n - m;
		double	producto2	= n * m;
		double	cociente2	= n / m;
		double	resto2		= n % m;
		double	suma3		= x + n;
		double	cociente3	= y / m;
		double	resto3		= y % m;
		double	sumaT		= x + y + n + m;
		double	productoT	= x * y * n * m;		
//Output
		System.out.println("El valor de la variable X es: "+x);
		System.out.println("El valor de la variable Y es: "+y);
		System.out.println("\nSuma de X e Y : "+suma1);
		System.out.println("Diferencia de X e Y : "+resta1);
		System.out.println("Producto de X e Y : "+producto1);
		System.out.println("Cociente de X e Y : "+cociente1);
		System.out.println("Resto de X e Y : "+resto1);
		System.out.println("\nSuma de N e M : "+suma2);
		System.out.println("Diferencia de N e M : "+resta2);
		System.out.println("Producto de N e M : "+producto2);
		System.out.println("Cociente de N e M : "+cociente2);
		System.out.println("Resto de N e M : "+resto2);
		System.out.println("\nSuma de X e N : "+suma3);
		System.out.println("Cociente de Y e M : "+cociente3);
		System.out.println("Resto de Y e M : "+resto3);
		System.out.println("\nEl doble de X : "+x*2);
		System.out.println("El doble de Y : "+y*2);
		System.out.println("El doble de N : "+n*2);
		System.out.println("El doble de M : "+m*2);
		System.out.println("\nLa suma total de las variables es : "+sumaT);
		System.out.println("\nEl producto total de las variables es : "+productoT);
		
	}

}
