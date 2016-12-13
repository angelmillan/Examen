import java.util.Scanner;
/** Examen de 1º de DAM
 * @author Angel Millán Miralles
 * @author Angelmillan@me.com
 * @version 1.0
 */ 
public class Ejercicio1 {
	
	public static void main (String args[]) {
		//inicializamos variables tipo entero, numeroInicial, incremento, columnas
		int numeroInicial = 0;
		int incremento = 0;
		int columnas = 0;
		//obtenemos datos a traves de Scanner
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Introduzca el número inicial");
		numeroInicial= entrada.nextInt();
		System.out.println("Introduzca el número a incrementar desde el inicial");
		incremento= entrada.nextInt();
		System.out.println("Introduzca el número de columnas a imprimir en pantalla");
		columnas= entrada.nextInt();
		entrada.close();
		
		//cpmprobamos que las columnas sean distionto de cero, negativo o mayor de 10
		//y en su caso lo ponemos por defecto a 2
		if (columnas <= 1 || columnas > 10)
			columnas = 2;
			
			imprimeColumnas(numeroInicial,incremento,columnas);
		
	}
		/**Método para imprimir columnas
		 * @param numeroInicial el numero en que comenzamos
		 * @param incremento la cantidad en la incrementamos el número inicial
		 * @param columnas el número de columnas en la que queremos imprimir
		 */
		public static void imprimeColumnas(int numeroInicial,int incremento, int columnas) {
				
			for (int i = 1; i <= 10; i++) {
				for (int j = 1; j <= columnas && i<=10; j ++){
				System.out.printf("%8d", numeroInicial);
				numeroInicial += incremento;
				i++;
				}
			i--;
			System.out.printf("%n");
			}
		}	
	
}

