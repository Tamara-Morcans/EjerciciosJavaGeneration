import java.util.Scanner;

public class SwitchTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crear un programa donde se introduzcan los tres �ngulos internos de 
		//un tri�ngulo y se determine si el tri�ngulo es v�lido o no.
		

		Scanner ang1= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el primer �ngulo");
		float primerangulo =  ang1.nextFloat();
		
		Scanner ang2= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el segundo �ngulo");
		float segundoangulo =  ang2.nextFloat();
		
		Scanner ang3= new Scanner (System.in);
		System.out.println("�Hola! Ingrese el tercer �ngulo");
		float tercerangulo =  ang3.nextFloat();
		
		float totales= primerangulo + segundoangulo + tercerangulo;
		
		if(totales == 180) {
			System.out.println("Su triangulo es valido");
		} else {
			System.out.println("Lo siento, su triangulo no es valido");
		}
		
	
		
	}

}
