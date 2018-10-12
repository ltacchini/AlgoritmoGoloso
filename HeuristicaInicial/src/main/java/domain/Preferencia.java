package domain;

public class Preferencia {
	Clase clase;
	String edificio;
	
	Preferencia(Clase clase, String edificio){
		this.clase = clase;
		this.edificio = edificio;
	}
	
	public Clase getClase() {
		return clase;
	}
	
	@Override
	public String toString() {
		return clase + "-" + edificio;
	}


}