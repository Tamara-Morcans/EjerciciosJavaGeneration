
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Switch
		 * switch(condición) {
		 * case valor:
		 *          código
		 *          código
		 *          código
		 *          break;
		 * case valor2:
		 *          código
		 *          código
		 *          código
		 *          break;	
		 * }
		 */
		
		int dia = 2;
		String mensaje = "";
		
		switch (dia)  {
			case 1:
				mensaje = "Lunes";
				break;
			case 2:
				mensaje = "Martes";
				break;
			case 3:
				mensaje = "Miercoles";
				break;
			case 4:
				mensaje = "Jueves";
				break;
			case 5:
				mensaje = "Viernes";
				break;
			case 6:
				mensaje = "Sábado";
				break;
			case 7:
				mensaje = "Domingo";
				break;
			default:
				mensaje= "Día invalido";
				break;
				
			
		}
			
		
			System.out.println(mensaje);
			
			/*
			 * Crear una calculadora que pueda sumar,restar,multiplicar y dividir 
			 * 2 números.
			 * La calculadora debe pedir los dos números y posterior a eso
			 * preguntar que operación se quiere realizar, el menú es el 
			 * siguiente:
			 * 1. Suma
			 * 2. Resta
			 * 3. Multiplicación
			 * 4. División
			 * 
			 * Al final debe mostrar los resultados y la operación que realizó.
			 * Suma = 10;
			 * 
			 * Nota: Se debe usar el switch
			 */
			
			
	}

}
