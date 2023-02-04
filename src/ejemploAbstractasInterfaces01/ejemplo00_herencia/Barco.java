package ejemploAbstractasInterfaces01.ejemplo00_herencia;

public class Barco {
	private String matricula;
	private int eslora;
	private int manga;
	
	public Barco(String matricula, int eslora, int manga) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.manga = manga;
	}
	
	public float precio_dia_alquiler() {
		return 40;
	}
}
