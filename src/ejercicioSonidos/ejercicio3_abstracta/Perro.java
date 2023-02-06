package ejercicioSonidos.ejercicio3_abstracta;

public class Perro extends Animal {
	
	private boolean peligroso;
	private boolean adiestrado;
	
	public Perro(String raza, String sexo, int num_patas, boolean peligroso, boolean adiestrado) {
		super(raza, sexo, num_patas);
		this.peligroso = peligroso;
		this.adiestrado = adiestrado;
	}
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	public boolean isAdiestrado() {
		return adiestrado;
	}
	public void setAdiestrado(boolean adiestrado) {
		this.adiestrado = adiestrado;
	}
	@Override
	public String grito() {
		return "Guau";
	}
	@Override
	public String toString() {
		return "Perro [peligroso=" + peligroso + ", adiestrado=" + adiestrado + ", grito()=" + grito() + "]";
	}
}
