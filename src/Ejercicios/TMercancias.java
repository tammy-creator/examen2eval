package Ejercicios;

public class TMercancias extends Alquiler {
	private String matricula;
	private String tipo;
	private int pma;

	public TMercancias(String matricula, int precioDia, String tipo, int pma) {
		super(precioDia);
		this.tipo = tipo;
		this.pma = pma;
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getTipo() {
		return tipo;
	}

	public int getPma() {
		return pma;
	}
	
	public float getPrecioAlquiler(int numDias) {
		
		float totalAlquiler = super.getPrecioAlquiler(numDias)+(pma*20);
		super.precioDia += pma*20;
		if(tipo.equals("camion")) {
			super.precioDia +=40;
			totalAlquiler += 40;
		}
		
		return totalAlquiler;
	} 
	
	@Override
	public String toString() {
		return "Tipo de vehiculo: "+tipo+" PMA (toneladas) : "+pma+" "+super.toString();
	} 
	
}
