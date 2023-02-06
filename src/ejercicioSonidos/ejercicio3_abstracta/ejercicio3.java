package ejercicioSonidos.ejercicio3_abstracta;

import java.util.ArrayList;

public class ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Animal> arr = new ArrayList<>();
		
		Perro perro1 = new Perro("Pastor alemán", "Masculino", 4, false, true);
		arr.add(perro1);
		Pato pato1 = new Pato("Pekin", "Femenino", 2, true);
		arr.add(pato1);
		Perro perro2 = new Perro("Chihuahua", "Masculino", 4, true, false);
		arr.add(perro2);
		
		
		System.out.println("Animales: \n");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
	}

}
