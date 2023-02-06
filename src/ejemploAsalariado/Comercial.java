package ejemploAsalariado;

public class Comercial extends Empleado{
	private double ventas;
	private double comision;
	
	public Comercial(String dni, String nombre, String nss, double ventas, double comision) {
		super(dni, nombre, nss);
		this.ventas = ventas;
		this.comision = comision;
	}

	@Override
	public float salario() {
		// TODO Auto-generated method stub
		return (float) (ventas*comision);
	}

	@Override
	public String toString() {
		return "Comercial [ventas=" + ventas + ", comision=" + comision + ", salario()=" + salario() + "]";
	}
	
	 

}
