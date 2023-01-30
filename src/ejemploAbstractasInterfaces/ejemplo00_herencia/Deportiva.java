package ejemploAbstractasInterfaces.ejemplo00_herencia;

public class Deportiva extends Barco{
	private int CV;

	public Deportiva(String matricula, int eslora, int manga, int cV) {
		super(matricula, eslora, manga);
		CV = cV;
	}
}
