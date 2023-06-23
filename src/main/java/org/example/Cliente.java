package org.example;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String numeroContacto;
	private String estadoCivil;
	private String ciudad;
	private TiendaElectronica tiendaElectronica;
	private CuentaTiendaTecnologica cuentaTienda;
	private ArrayList<DispositivoTecnologico> dispositivo = new ArrayList<DispositivoTecnologico>();

	public boolean registrarse() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public Cliente(String nombre, String apellido, String correoElectronico, String numeroContacto, String estadoCivil, String ciudad) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispotivoPorMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispotivoPorModelo(String modelo) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispotivoPorTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public void informacionDetalladaDispositivo() {
		throw new UnsupportedOperationException();
	}
}