package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	
	static {
		ranas = 0;
		salamandras = 0;
	}
	
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "oceano", genero, "rojo", true);
		ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "oceano", genero, "negro y amarillo", false);
		salamandras++;
		return salamandra;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public boolean isVenenoso() {
		return venenoso;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
}
