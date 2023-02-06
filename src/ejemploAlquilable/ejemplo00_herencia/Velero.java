package ejemploAlquilable.ejemplo00_herencia;

public class Velero extends Barco{
	private int numMastiles;

	public Velero(String matricula, int eslora, int manga, int numMastiles) {
		super(matricula, eslora, manga);
		this.numMastiles = numMastiles;
	}
	
	@Override
	public float precio_dia_alquiler() {
		return 2*numMastiles;
	}

	@Override
	public String toString() {
		return "Velero [numMastiles=" + numMastiles + ", precio_dia_alquiler()=" + precio_dia_alquiler() + "]";
	}
	
}
