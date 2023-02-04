package ejemploAbstractasInterfaces02;

public class Contable extends Empleado{
	private int horasExtra;
	private double precioExtra;
	
	public Contable(String dni, String nombre, String nss, int horasExtra, double precioExtra) {
		super(dni, nombre, nss);
		this.horasExtra = horasExtra;
		this.precioExtra = precioExtra;
	}

	@Override
	public float salario() {
		// TODO Auto-generated method stub
		return (float) (horasExtra*precioExtra);
	}
}
