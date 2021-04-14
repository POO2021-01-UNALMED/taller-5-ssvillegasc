package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	
	static {
		iguanas = 0;
		serpientes = 0;
	}
	
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static int cantidadReptiles() {
		return iguanas + serpientes;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return serpiente; 
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	private void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	private void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}
}
