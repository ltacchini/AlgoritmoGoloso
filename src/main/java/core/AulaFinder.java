package core;

import java.util.Set;

import domain.Aula;

public class AulaFinder {
//public class CodAulaFactory {
	
	Set<Aula> aulas;
	
	public AulaFinder(Set<Aula> aulas) {
		this.aulas = aulas;
	}
	
	public Aula find(String nombreEdificio, String nombreAula){
//	public CodigoAula build(String nombreEdificio, String nombreAula){
		for(Aula a: aulas) {
			if(a.nombre.equals(nombreAula) && a.edificio.equals(nombreEdificio)) {
				return a;
			}
		}		
		throw new RuntimeException("No se encontró el aula: "+ nombreAula + "edificio: "+ nombreEdificio);		
	}
}
