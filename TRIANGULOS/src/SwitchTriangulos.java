import java.util.Scanner;

public class SwitchTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crear un programa donde se introduzcan los tres ángulos internos de 
		//un triángulo y se determine si el triángulo es válido o no.
		

		Scanner ang1= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el primer ángulo");
		float primerangulo =  ang1.nextFloat();
		
		Scanner ang2= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el segundo ángulo");
		float segundoangulo =  ang2.nextFloat();
		
		Scanner ang3= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese el tercer ángulo");
		float tercerangulo =  ang3.nextFloat();
		
		float totales= primerangulo + segundoangulo + tercerangulo;
		
		if(totales == 180) {
			System.out.println("Su triangulo es valido");
		} else {
			System.out.println("Lo siento, su triangulo no es valido");
		}
		
	
		
	}

}
