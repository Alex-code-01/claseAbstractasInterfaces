package ejemploAbstractasInterfaces01.ejemplo01_abstracta;

public abstract class Barco {
	private String matricula;
	private int eslora;
	private int manga;
	
	public Barco(String matricula, int eslora, int manga) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.manga = manga;
	}
	
	public abstract float precio_dia_alquiler();
}
