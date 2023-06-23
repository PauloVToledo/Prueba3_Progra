package org.example;
import java.util.ArrayList;

public class TiendaElectronica {
	private String direccion;
	public CatalogoDispositivos unnamed_CatalogoDispositivos_;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<DispositivoTecnologico> dispositivos = new ArrayList<DispositivoTecnologico>();

	public String getDireccion() {
		return this.direccion;
	}

	public Cliente AgregarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public DispositivoTecnologico agregarDispositivoTecnologico(DispositivoTecnologico dispositivo) {
		throw new UnsupportedOperationException();
	}
}