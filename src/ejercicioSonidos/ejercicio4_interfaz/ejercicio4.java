package ejercicioSonidos.ejercicio4_interfaz;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Sonidos[] arr = new Sonidos[4];
		System.out.println("Longitud del array: "+arr.length);
		
		Perro perro1 = new Perro("Pastor alemán", "Masculino", 4, false, true);
		arr[0]=perro1;
		Pato pato1 = new Pato("Pekin", "Femenino", 2, true);
		arr[1]=pato1;
		Perro perro2 = new Perro("Chihuahua", "Masculino", 4, true, false);
		arr[2]=perro2;
		Robot robot1 = new Robot(true);
		arr[3]=robot1;
		
		
		System.out.println("Recorriendo el array de objetos");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i].grito());
		}
		System.out.println("\nRecorriendo el array con for each");
		/*
		 * for element in elements
		 * siendo elements el array
		 */
		for (Sonidos s: arr) {
			System.out.println(s.grito());
		}

	}

}
