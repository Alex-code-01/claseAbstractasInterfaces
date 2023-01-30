package ejercicioSonidos_ejercicio4;

public class Pato extends Animal {
	
	private boolean plumaje;

	public Pato(String raza, String sexo, int num_patas, boolean plumaje) {
		super(raza, sexo, num_patas);
		this.plumaje = plumaje;
	}

	public boolean isPlumaje() {
		return plumaje;
	}

	public void setPlumaje(boolean plumaje) {
		this.plumaje = plumaje;
	}

	@Override
	public String grito() {
		return "Cuac";
	}

}
