package ejemploAbstractasInterfaces01.ejemplo01_abstracta;

public class Deportiva extends Barco{
	private int CV;

	public Deportiva(String matricula, int eslora, int manga, int cV) {
		super(matricula, eslora, manga);
		CV = cV;
	}

	@Override
	public float precio_dia_alquiler() {
		return 5*CV;
	}
}
