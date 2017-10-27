package enfermedades;
import main.*;

public class Autoinmune extends Enfermedad{

	
	public Autoinmune(int cantidadCelulas) {
		super(cantidadCelulas);
	}

	public void infectar(Persona unaPersona){
		unaPersona.disminuirCelulas(this.celulasAmenazadas);
	}
	
	
	
}