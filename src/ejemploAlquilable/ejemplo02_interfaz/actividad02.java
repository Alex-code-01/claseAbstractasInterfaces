package ejemploAlquilable.ejemplo02_interfaz;

import java.util.ArrayList;

public class actividad02 {

	public static void main(String[] args) {
		ArrayList<Alquilable> arr = new ArrayList<>();
		
		Velero velero1 = new Velero("44332211N", 44, 55, 3);
		arr.add(velero1);
		
		Deportiva deportiva1 = new Deportiva("99887765P", 33, 22, 1);
		arr.add(deportiva1);
		
		Pedalo pedalo1 = new Pedalo(12, true);
		arr.add(pedalo1);
		
		System.out.println("Productos Alquilables:\n");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
	}
}
