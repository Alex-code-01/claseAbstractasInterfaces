package ejemploAsalariado;

public class Directivo extends Empleado{
	private double dietas;

	public Directivo(String dni, String nombre, String nss, double dietas) {
		super(dni, nombre, nss);
		this.dietas = dietas;
	}

	@Override
	public float salario() {
		// TODO Auto-generated method stub
		return (float) (dietas*40);
	}

	@Override
	public String toString() {
		return "Directivo [dietas=" + dietas + ", salario()=" + salario() + "]";
	}
	
	
}
