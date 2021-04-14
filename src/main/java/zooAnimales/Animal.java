package zooAnimales;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre =nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() +"\n"
			+"Aves: " + Ave.cantidadAves() +"\n"
			+"Reptiles: " + Reptil.cantidadReptiles() +"\n"
			+"Peces: " + Pez.cantidadPeces() +"\n"
			+"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		String cadena ="Mi nombre es "+nombre+", tengo una edad de "+edad
						+", habito en "+habitat+ " y mi genero es "+genero; 
		if(zona != null)
			cadena += ", la zona en la que me ubico es "+zona.getNombre()
			+", en el "+zona.getZoo().getNombre(); 
		return cadena;
	}

}
