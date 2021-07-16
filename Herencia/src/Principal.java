
public class Principal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal();
		//animal.nombre = "Gato";
		//System.out.println(animal.beber());
		
		Perro canelo = new Perro();//Se cambió la instanciación
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
	//Imprimimos su edad
		
		Gato pulgas = new Gato();
		System.out.println(pulgas.comer());
		
		}

}