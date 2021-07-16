import java.util.Scanner;


public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Hacer un programa que pida un número por teclado
		 * Se tiene que hacer un recorrido desde 1 hasta numero introducido
		 * Ejemplo:
		 * Número introducido: 12
		 * 
		 * Numeros pares = 2 + 4 + 6+ 8+ 10+ 12
		 * Numeros impares = 1 +3 +5+ 7 +9 +11
		 * 
		 * Tiene que imprimir la suma de los numeros pares e impares
		 */
	    
		Scanner num= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese algún numero");
		
		
		int sumanum =  num.nextInt();
		int par = 0;
		int impar= 0;
		
		
		
		System.out.println("El numero es " + num );
        for(int i = 1; i<=sumanum; i++){
            if (i % 2 == 0) {
            	par+=i;
            }else {
            	impar+=i;
            }
         }
            
        System.out.println("La suma par es: " + par);
        System.out.println("L suma impar es: " + impar);
	    
	} 
}
