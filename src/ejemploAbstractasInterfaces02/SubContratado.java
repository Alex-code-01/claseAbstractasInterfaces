package ejemploAbstractasInterfaces02;

public class SubContratado implements Asalariado{
	private String dni;

	public SubContratado(String dni) {
		super();
		this.dni = dni;
	}

	@Override
	public float salario() {
		// TODO Auto-generated method stub
		return 1200;
	}
	
	

}
