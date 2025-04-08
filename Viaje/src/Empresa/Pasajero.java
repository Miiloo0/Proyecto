package Empresa;

import java.util.List;

public class Pasajero {

	private long numDocumento;

	private String nombre;

	private String Apellido;

  private int Boletos

	public Personas() {
		super();
	}

	public Personas(long numDocumento, String nombre, String apellido) {
		super();
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.Apellido = Apellido;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	@Override
	public String toString() {
		return ", numDocumento=" + numDocumento + ", nombre=" + nombre + ", apellido=" + Apellido + "]";
	}

}
