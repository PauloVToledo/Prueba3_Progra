package org.example;
public class Notebook extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private String bateriaEnAmperaje;

	public Notebook(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int cantidadStock) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anhoFabricacion, precio, cantidadStock);
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public String getBateriaEnAmperaje() {
		return this.bateriaEnAmperaje;
	}

	public void setBateriaEnAmperaje(String bateriaEnAmperaje) {
		this.bateriaEnAmperaje = bateriaEnAmperaje;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}