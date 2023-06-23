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
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivoPorMarca(String marca) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();

		for (DispositivoTecnologico dispositivo : dispositivo) {
			if (dispositivo.getMarca().equals(marca)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivoPorModelo(String modelo) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();

		for (DispositivoTecnologico dispositivo : dispositivo) {
			if (dispositivo.getModelo().equals(modelo)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivoPorTipo(String tipo) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<>();

		for (DispositivoTecnologico dispositivo : dispositivo) {
			if (dispositivo.getTipo().equals(tipo)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}


	public void informacionDetalladaDispositivo() {
		for (DispositivoTecnologico dispositivo : dispositivo) {
			System.out.println("Marca: " + dispositivo.getMarca());
			System.out.println("Modelo: " + dispositivo.getModelo());
			System.out.println("Tipo: " + dispositivo.getTipo());
			System.out.println("Descripción: " + dispositivo.getDescripcion());
			System.out.println("Precio: " + dispositivo.getPrecio());
			System.out.println("----------------------");
		}
	}


	public CharSequence getDireccion() {
		return getDireccion();
	}
}
//probar con menú.