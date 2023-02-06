package ejercicioSonidos.ejercicio4_interfaz;

public class Robot implements Sonidos{
	
	private String nombre;
	private boolean brazo_mecanico;

	public Robot(String nombre, boolean brazo_mecanico) {
		super();
		this.nombre = nombre;
		this.brazo_mecanico = brazo_mecanico;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isBrazo_mecanico() {
		return brazo_mecanico;
	}

	public void setBrazo_mecanico(boolean brazo_mecanico) {
		this.brazo_mecanico = brazo_mecanico;
	}

	@Override
	public String grito() {
		return "Soy un robot, no grito";
	}

	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", brazo_mecanico=" + brazo_mecanico + ", grito()=" + grito() + "]";
	}
}
