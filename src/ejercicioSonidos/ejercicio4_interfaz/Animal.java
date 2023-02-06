package ejercicioSonidos.ejercicio4_interfaz;

public abstract class Animal implements Sonidos{
	
	private String raza;
	private String sexo;
	private int num_patas;
	
	public Animal(String raza, String sexo, int num_patas) {
		super();
		this.raza = raza;
		this.sexo = sexo;
		this.num_patas = num_patas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getNum_patas() {
		return num_patas;
	}

	public void setNum_patas(int num_patas) {
		this.num_patas = num_patas;
	}

	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", sexo=" + sexo + ", num_patas=" + num_patas + "]";
	}
}
