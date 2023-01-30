package ejemploAbstractasInterfaces.ejemplo00_herencia;

public class actividad {

	public static void main(String[] args) {
		
		Barco barco1 = new Barco("11223344Y", 33, 22);
		Velero velero1 = new Velero("44332211N", 44, 55, 3);
		Deportiva deportiva1 = new Deportiva("99887765P", 33, 22, 1);
		
		System.out.println(barco1.precio_dia_alquiler());//40
		System.out.println(velero1.precio_dia_alquiler());//6
		System.out.println(deportiva1.precio_dia_alquiler());//40
	}
}
