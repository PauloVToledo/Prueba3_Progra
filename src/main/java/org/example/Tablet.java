package org.example;
import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico {
	private String resolucionPantalla;
	private ArrayList<AccesoriosTablet> accesorio = new ArrayList<AccesoriosTablet>();

	public Tablet(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int cantidadStock) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anhoFabricacion, precio, cantidadStock);
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<AccesoriosTablet> getAccesoriosTablet() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}