package ejemploAsalariado;

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

	@Override
	public String toString() {
		return "SubContratado [dni=" + dni + ", salario()=" + salario() + "]";
	}
	
	

}
