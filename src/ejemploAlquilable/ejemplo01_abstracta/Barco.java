package ejemploAlquilable.ejemplo01_abstracta;

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

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", manga=" + manga + ", precio_dia_alquiler()="
				+ precio_dia_alquiler() + "]";
	}
	
	
}
