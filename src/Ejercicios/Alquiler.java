package Ejercicios;

public class Alquiler {
	
	protected float precioDia=50;
	
	public Alquiler(int precioDia) {
		this.precioDia = precioDia;
	}

	public float getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(float precioDia) {
		this.precioDia = precioDia;
	}

	@Override
	public String toString() {
		return "PrecioDia: " + precioDia;
	}
	
	public float getPrecioAlquiler(int numDias) {
		float totalAlquiler = precioDia*numDias;
		return totalAlquiler;
	}
	
}
