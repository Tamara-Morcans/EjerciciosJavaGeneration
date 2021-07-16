import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ciclo While
		 * While(Condición){
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * Escribir un programa que pida dos numeros por consola de manera
		 * reiterada. La ejecución del programa terminará cuando los numeros
		 * ingresados sean iguales.
		 * 
		 * Nota: Utilizar ciclo while
		 */
		
		
		Scanner ciclo =  new Scanner ( System.in);
		float val1= 0;
		float val2= 1;
						
		while (val1 != val2) {
			System.out.println("Ingresa un numero");
			val1 =  ciclo.nextFloat();
			System.out.println("Ingresa otro numero");
			val2 =  ciclo.nextFloat();
			
		}
	
		System.out.println("El programa ha termindo");
		
		}
		
		
		
		
		
		
		
		
		
		
	}


