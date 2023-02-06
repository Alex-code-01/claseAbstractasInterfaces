package ejemploAlquilable.ejemplo00_herencia;

import java.util.ArrayList;

public class actividad00 {

	public static void main(String[] args) {
		ArrayList<Barco> arr = new ArrayList<>();
		
		Barco barco1 = new Barco("11223344Y", 33, 22);
		arr.add(barco1);
		
		Velero velero1 = new Velero("44332211N", 44, 55, 3);
		arr.add(velero1);
		
		Deportiva deportiva1 = new Deportiva("99887765P", 33, 22, 1);
		arr.add(deportiva1);
		
		System.out.println("Productos Alquilables:\n");
		
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
	}
}
