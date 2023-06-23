package org.example;
public class PantallaPC {
	private String marca;
	private String modelo;
	private String anho;
	private PCEscritorio pc;

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getAnho() {
		return this.anho;
	}

	public PantallaPC(String marca, Object modelo_String, String anho) {
		throw new UnsupportedOperationException();
	}
}