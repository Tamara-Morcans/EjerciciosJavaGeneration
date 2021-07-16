import java.util.HashSet;
import java.util.Set;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * La coleccion set no puede contener elementos duplicados 
		 * Solo tiene los metodos heredados de Collection
		 * Existen diferentes formas de implementaciones.
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una tabla
		 * hash. Es la que mejor rendimiento tiene.
		 * Los elementos no tienen un orden
		 */
		
		Set<String>frutas= new HashSet();
		frutas.add("Manzanas");
		frutas.add("Mandarina");
		frutas.add("Maracuya");
		frutas.add("Melon");
		frutas.add("Mango");
		frutas.add("Carambola");
		frutas.add("Fresa");
		frutas.add("Sandia");
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		}
	}

}
