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

	public Cliente agregarCliente(Cliente cliente) {
		// Verificar si el cliente ya existe en la lista
		if (clientes.contains(cliente)) {
			System.out.println("El cliente ya está registrado en la tienda.");
			return null; // O podrías lanzar una excepción indicando que el cliente ya existe
		}

		// Verificar si el cliente tiene información requerida
		if (cliente.getNombre().isEmpty() || cliente.getDireccion().isEmpty()) {
			System.out.println("Falta información requerida del cliente.");
			return null; // O podrías lanzar una excepción indicando que falta información requerida
		}

		// Validar otras condiciones según tus necesidades

		// Agregar el cliente a la lista si pasa todas las validaciones
		clientes.add(cliente);
		return cliente;
	}


	public DispositivoTecnologico agregarDispositivoTecnologico(DispositivoTecnologico dispositivo) {
		// Verificar si el dispositivo ya existe en la lista
		if (dispositivos.contains(dispositivo)) {
			System.out.println("El dispositivo ya está registrado en la tienda.");
			return null; // O podrías lanzar una excepción indicando que el dispositivo ya existe
		}

		// Verificar si el dispositivo tiene información requerida
		if (dispositivo.getNombre().isEmpty() || dispositivo.getPrecio() <= 0) {
			System.out.println("Falta información requerida del dispositivo.");
			return null; // O podrías lanzar una excepción indicando que falta información requerida
		}

		// Validar otras condiciones según tus necesidades

		// Agregar el dispositivo a la lista si pasa todas las validaciones
		dispositivos.add(dispositivo);
		return dispositivo;
	}

}
