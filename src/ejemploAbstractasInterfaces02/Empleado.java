package ejemploAbstractasInterfaces02;

public abstract class Empleado implements Asalariado{
	private String dni;
	private String nombre;
	private String nss;
	
	public Empleado(String dni, String nombre, String nss) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nss = nss;
	}
}
