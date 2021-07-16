import java.util.Scanner;
public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*
         * if(condicion) se cumple {
         *    codigo
         *    codigo
         *    codigo
         *    }
         * if(condicion) se cumple {
         *    codigo
         *    codigo
         *    codigo
         * } else {
         *     codigo
         *     codigo
         *     codigo
         * }
         * if(condicion) si se cumple {
         *     codigo
         *     codigo
         *     codigo
         *     }
         *     
         * 
         * -- Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"

         */
		Scanner leerNombre= new Scanner (System.in);
		System.out.println("¡Hola! ¿Cómo te llamas?");
		String nombre=leerNombre.nextLine( );
		
		Scanner leerEdad= new Scanner (System.in);
		System.out.println("Ingresa tu edad");
		int edad= leerEdad.nextInt();
		String mensaje= datos(edad, nombre);
		System.out.println(mensaje);
	}
		
		
	    public static String datos(int edad, String nombre) {
	    	String mensaje= "";
	    	    	
	    	if(edad>=18 && edad <=29) {
	        mensaje= "Felicidades " + nombre +  " estas aceptado en el programa de generation Java Full Stack";
	    	} else {
	       			 mensaje = "Lo sentimos, no cumples los requisitos del bootcamp";
	       		 }
	       		 		
	    		
        			return mensaje;
        			
        }
	}

