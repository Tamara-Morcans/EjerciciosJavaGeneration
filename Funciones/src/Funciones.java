import java.util.Scanner;
public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Debe dise�ar un programa que reciba 3 n�meros por consola y determine
		 * cual de los 3 n�meros es el mayor.
          Plus: Imprimir los n�meros ordenados de mayor a menor.
          Plus: Imprimir los n�meros ordenados de menor a mayor.

		 */
		
		Scanner valor1= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el primer n�mero");
		float primernumber =  valor1.nextFloat();
		
		Scanner valor2= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el segundo n�mero");
		float segundonumber =  valor2.nextFloat();
		
		Scanner valor3= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el tercer n�mero");
		float tercernumber =  valor3.nextFloat();
		
		if(primernumber > segundonumber) {
			System.out.println("El n�mero mayor es" + primernumber);
		} else if(segundonumber > tercernumber) {
			System.out.println("El n�mero mayor es" + segundonumber);
		} else {
			System.out.println("El n�mero mayor es" + tercernumber);
		}
		
		
		
	}

}
