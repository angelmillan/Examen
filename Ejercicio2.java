import java.util.Scanner;
/** Examen de 1º de DAM
 * @author Angel Millán Miralles
 * @author Angelmillan@me.com
 * @version 2.0
 */ 
public class Ejercicio2 {
	
	public static void main (String args[]) {
		
		// creamos una instancia de la clase Scanner y pedimos entrada de palabra
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String palabra = sc.next();
		sc.close();
		
		
		System.out.println("Esta palabra tiene tílde ? " + tieneTilde (palabra));	
		System.out.println("Esta palabra tiene " + numeroVocales(palabra) + " vocales en total");
		System.out.println(concatena(palabra));
	}
	/** Método tieneTilde devuelve boolean true si lo tiene
	 * @param palabra es la palabra a estudiar
	 * @return tilde booleano de retorno
	 */
	public static boolean tieneTilde(String palabra){
		boolean tilde = false;
		palabra = palabra.toLowerCase();
		for (int i = 0; i <= (palabra.length()-1);i++){
		if (palabra.charAt(i) == 'á' || palabra.charAt(i) == 'é' ||
			palabra.charAt(i) == 'í' || palabra.charAt(i) == 'ó' ||
			palabra.charAt(i) == 'ú')
			tilde = true;
		}
	return tilde;
	}
	
	/** Método numeroVocales devuelve el número de vocales de palabra
	 * @param palabra es la palabra a estudiar
	 * @return vocales un int con el contador de vocales
	 */
	public static int numeroVocales(String palabra){
		int vocales = 0;
		palabra = palabra.toLowerCase();
		for (int i = 0; i <= (palabra.length()-1);i++){
		if (palabra.charAt(i) == 'á' || palabra.charAt(i) == 'é' ||
			palabra.charAt(i) == 'í' || palabra.charAt(i) == 'ó' ||
			palabra.charAt(i) == 'ú' || palabra.charAt(i) == 'a' || 
			palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || 
			palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u')
			vocales += 1;
		}
	return vocales;
	}
	
	/** Método concatena devuelve la palabra en mayúscula y minúscula
	 * concatenadas de forma seguida, unicas
	 * @param palabra es la palabra a estudiar
	 * @return palabra tipo String de vuelta con la suma de mayúsculas y minúsculas
	 */
	public static String concatena(String palabra){
	String cadena = palabra.toUpperCase() + palabra.toLowerCase();
	return cadena;
	} 
}

