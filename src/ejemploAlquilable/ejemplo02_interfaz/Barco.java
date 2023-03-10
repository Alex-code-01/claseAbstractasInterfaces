package ejemploAlquilable.ejemplo02_interfaz;

public abstract class Barco implements Alquilable{
	private String matricula;
	private int eslora;
	private int manga;
	
	public Barco(String matricula, int eslora, int manga) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.manga = manga;
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", manga=" + manga + "]";
	}
	
	
}
