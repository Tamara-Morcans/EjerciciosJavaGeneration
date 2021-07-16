import java.util.Scanner;
public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Debe diseñar un programa que reciba 3 números por consola y determine
		 * cual de los 3 números es el mayor.
          Plus: Imprimir los números ordenados de mayor a menor.
          Plus: Imprimir los números ordenados de menor a mayor.

		 */
		
		Scanner valor1= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el primer número");
		float primernumber =  valor1.nextFloat();
		
		Scanner valor2= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el segundo número");
		float segundonumber =  valor2.nextFloat();
		
		Scanner valor3= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el tercer número");
		float tercernumber =  valor3.nextFloat();
		
		if(primernumber > segundonumber) {
			System.out.println("El número mayor es" + primernumber);
		} else if(segundonumber > tercernumber) {
			System.out.println("El número mayor es" + segundonumber);
		} else {
			System.out.println("El número mayor es" + tercernumber);
		}
		
		
		
	}

}
