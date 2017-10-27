package enfermedades;

import main.Persona;

public class Enfermedad {

	protected int celulasAmenazadas;
	
	
//Constructor
	public Enfermedad(int cantidadCelulas){
		celulasAmenazadas = cantidadCelulas;
	}
	
//Accesors
	public int getCelulasAmenazadas() {
		return celulasAmenazadas;
	}

	public void setCelulasAmenazadas(int celulasAmenazadas) {
		this.celulasAmenazadas = celulasAmenazadas;
	}


	public void aumentarCelulasAmenazadas(int unaCantidad){
		celulasAmenazadas += unaCantidad;
	}
	
	public void disminuirCelulasAmenazadas(int unaCantidad){
		celulasAmenazadas -= unaCantidad;
	}
	
	public void infectar(Persona unaPersona){
		
	}
	
	public boolean sosAgresiva() {
		return true;
	}

	
}