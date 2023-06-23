package org.example;
public class PCEscritorio extends DispositivoTecnologico {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private PantallaPC pantalla;

	public PCEscritorio(String marca, String memoriaRam, String memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int cantidadStock) {
		super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anhoFabricacion, precio, cantidadStock);
	}

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}