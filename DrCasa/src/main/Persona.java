package main;

import java.util.*;
import java.util.stream.Collectors;

import enfermedades.*;


public class Persona {

	List<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
	private double temperatura = 36;
	private int celulas, celulasAmenazadas;

//Constructores
	
	public Persona(int unasCelulas){
		celulas = unasCelulas;
	}
	
	public void disminuirCelulas(int unaCantidad){
		celulas -= unaCantidad;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public int getCelulas() {
		return celulas;
	}

	public void setCelulas(int celulas) {
		this.celulas = celulas;
	}

	public int getCelulasAmenazadas() {
		return celulasAmenazadas;
	}

	public void setCelulasAmenazadas(int celulasAmenazadas) {
		this.celulasAmenazadas = celulasAmenazadas;
	}

	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}

	
//Contraer enfermedad
	
	//Punto 1
	public void contraerEnfermedad(Enfermedad unaEnfermedad){
		enfermedades.add(unaEnfermedad);
	}

	//Punto 3
	public void vivir(){
		enfermedades.forEach(enfermedad -> enfermedad.infectar(this));
	}
	
	public void aumentarTemperatura(double unosGrados){
		temperatura += unosGrados;
	}
	
	public boolean estaEnComa(){
		return temperatura >= 45;
	}
	
	public boolean tiene(Enfermedad unaEnfermedad){
		return enfermedades.contains(unaEnfermedad);
	}
	
	public void curar(Enfermedad unaEnfermedad){
		enfermedades.remove(unaEnfermedad);
	}
	
	public void curacionMaxima() {
		enfermedades.clear();
	}
	
	
	public Enfermedad enfermedadQueMasCelulasAfecta(){
		
		Comparator<Enfermedad> cmp = Comparator.comparingInt(Enfermedad::getCelulasAmenazadas);
		
		return enfermedades.stream().max(cmp).get();
	}
	
	
	public int celulasAfectadasPorEnfermedadesAgresivas(){
		
		return this.enfermedadesAgresivas().stream().mapToInt(elem->elem.getCelulasAmenazadas()).sum();
		
	}
	
	public List<Enfermedad> enfermedadesAgresivas(){
		return this.enfermedades.stream().filter(elem->elem.sosAgresiva()).collect(Collectors.toList());
	}
	
	
}