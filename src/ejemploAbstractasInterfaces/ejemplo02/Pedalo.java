package ejemploAbstractasInterfaces.ejemplo02;

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
}
