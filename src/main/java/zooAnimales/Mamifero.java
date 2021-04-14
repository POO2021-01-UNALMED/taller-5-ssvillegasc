package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	
	static {
		caballos = 0;
		leones = 0;
	}
	
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return caballos + leones;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon; 
	}

	private void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	private void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public int getPatas() {
		return patas;
	}
}
