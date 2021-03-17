package Ejercicios;

public class TPersonas extends Alquiler {
	private String matricula;
	private String tipo;
	private int numPlazas;

	public TPersonas(String matricula, int precioDia, String tipo, int numPlazas) {
		super(precioDia);
		this.tipo = tipo;
		this.numPlazas = numPlazas;
		this.matricula = matricula;
	}
	

	public String getMatricula() {
		return matricula;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public String getTipo() {
		return tipo;
	}
	
	public float getPrecioAlquiler(int numDias) {
		float totalAlquiler = 0;
		if(tipo.equals("coche")) {
			super.precioDia =(float) (numPlazas*1.5);
			totalAlquiler = (float) (super.getPrecioAlquiler(numDias)+(numPlazas*1.5));
		}
		if(tipo.equals("microbus")) {
			super.precioDia = numPlazas*2;
			totalAlquiler = (float) (super.getPrecioAlquiler(numDias)+(numPlazas*2));
		}
		return totalAlquiler;
	}


	@Override
	public String toString() {
		return "Tipo de vehiculo: "+tipo+" Número de Plazas: "+numPlazas+" "+super.toString();
	} 
	
	
}
