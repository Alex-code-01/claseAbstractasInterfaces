package ejemploAbstractasInterfaces.ejemplo01;

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
}
