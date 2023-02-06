package ejemploAlquilable.ejemplo02_interfaz;

public class Pedalo implements Alquilable{
	private int numPedalo;
	private boolean columpio;
	
	public Pedalo(int numPedalo, boolean columpio) {
		super();
		this.numPedalo = numPedalo;
		this.columpio = columpio;
	}

	@Override
	public float precio_dia_alquiler() {
		// TODO Auto-generated method stub
		return 2*numPedalo;
	}

	@Override
	public String toString() {
		return "Pedalo [numPedalo=" + numPedalo + ", columpio=" + columpio + ", precio_dia_alquiler()="
				+ precio_dia_alquiler() + "]";
	}
	
}
