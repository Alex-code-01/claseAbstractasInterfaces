package ejemploAlquilable.ejemplo01_abstracta;

import java.util.ArrayList;

public class actividad01 {

	public static void main(String[] args) {
		ArrayList<Barco> arr = new ArrayList<>();
		/**
		 * La clase Barco ya no se puede instanciar, dado que es una clase abstracta
		 */
		//Barco barco1 = new Barco("11223344Y", 33, 22);
		//arr.add(barco1);
		
		Velero velero1 = new Velero("44332211N", 44, 55, 3);
		arr.add(velero1);
		
		Deportiva deportiva1 = new Deportiva("99887765P", 33, 22, 1);
		arr.add(deportiva1);
		
		System.out.println("Productos Alquilables:\n");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).getClass().getSimpleName()+": "+arr.get(i).precio_dia_alquiler());
		}
	}
}
