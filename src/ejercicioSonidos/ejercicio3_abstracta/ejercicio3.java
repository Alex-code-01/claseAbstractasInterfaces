package ejercicioSonidos.ejercicio3_abstracta;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[3];
		
		Perro perro1 = new Perro("Pastor alemán", "Masculino", 4, false, true);
		arr[0]=perro1;
		Pato pato1 = new Pato("Pekin", "Femenino", 2, true);
		arr[1]=pato1;
		Perro perro2 = new Perro("Chihuahua", "Masculino", 4, true, false);
		arr[2]=perro2;
		
		
		System.out.println("Recorriendo el array de animales");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i].grito());
		}

	}

}
