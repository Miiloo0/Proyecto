package Empresa;
import java.util.List;

public class Personas{
	
	private long numDocumento;
	
	private String nombre;
	
	private String apellido;

	public Persona() {
		super();
	}

	public Persona( long numDocumento,
			String nombre, String apellido) {
		super();
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apellido = apellido;

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
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	@Override
	public String toString() {
		return ", numDocumento=" + numDocumento + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
