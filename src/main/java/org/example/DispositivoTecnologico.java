package org.example;
import java.util.ArrayList;

public abstract class DispositivoTecnologico {
	protected String marca;
	protected String memoriaRam;
	protected String memoriaAlmacenamiento;
	protected String procesador;
	protected String modelo;
	protected int anhoFrabricacion;
	protected int precio;
	protected int cantidadStock;
	private TiendaElectronica tiendaElectronica;
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();

	public String getMarca() {
		return this.marca;
	}

	public String getMemoriaRam() {
		return this.memoriaRam;
	}

	public String getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAnhoFrabricacion() {
		return this.anhoFrabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public int getCantidadStock() {
		return this.cantidadStock;
	}

	public DispositivoTecnologico(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int cantidadStock) {
		throw new UnsupportedOperationException();
	}

	public abstract String getTipo();

	public CharSequence getNombre() {
		return getNombre();
	}

	public String getDescripcion() {
		return getDescripcion();
	}
}