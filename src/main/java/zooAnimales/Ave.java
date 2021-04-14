package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	
	static {
		halcones = 0;
		aguilas = 0;
	}
	
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}

	private void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}
}
