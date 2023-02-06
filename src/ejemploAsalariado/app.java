package ejemploAsalariado;

import java.util.ArrayList;

public class app {
	

	public static void main(String[] args) {
		//Iniciamos ArrayList
		ArrayList<Asalariado> arr = new ArrayList<>();
		
		//Instanciamos objetos de cada clase
		Comercial comercial1 = new Comercial("11223344R", "Pepe Pérez", "598734fFDDS", 54.4d, 4.4d);
		arr.add(comercial1);
		
		Contable contable1 = new Contable("44332211P", "Jose Perez", "549078FKHDF", 12, 20.3d);
		arr.add(contable1);
		
		Directivo directivo1 = new Directivo("88776655T", "Manuel Lopez", "908753403OIU", 30.2d);
		arr.add(directivo1);
		
		SubContratado subcontratado1 = new SubContratado("77668855U");
		arr.add(subcontratado1);
		
		//Recorremos el ArrayList
		System.out.println("Asalariados:\n");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}								
	}

}
