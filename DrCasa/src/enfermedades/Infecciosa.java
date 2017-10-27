package enfermedades;
import main.*;

public class Infecciosa extends Enfermedad{
	double fiebre;
	Persona huesped;
	
	public Infecciosa(int cantidadCelulas) {
		super(cantidadCelulas);
	}

	public void infectar(Persona unaPersona){

		fiebre= this.celulasAmenazadas / 1000;
		unaPersona.aumentarTemperatura(this.celulasAmenazadas / 1000);
	}

//Punto2
	public void reproducite(){
		this.celulasAmenazadas *= 2;
		
	}
	
	
}