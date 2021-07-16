import java.util.Scanner;

public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner tabla= new Scanner (System.in);
		System.out.println("¡Hola! Ingrese algún numero");
		int tablademultiplicar =  tabla.nextInt();
		
        System.out.println("Tabla del " + tabla );
        for(int i = 1; i<=10; i++){
            System.out.println(tablademultiplicar + " * " + i + " = " + 
        tablademultiplicar*i);   
		}
	}

}
