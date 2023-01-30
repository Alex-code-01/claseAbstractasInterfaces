package ejercicioSonidos.ejercicio4_interfaz;

public class Robot implements Sonidos{
	
	private boolean brazo_mecanico;

	public Robot(boolean brazo_mecanico) {
		super();
		this.brazo_mecanico = brazo_mecanico;
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
}
