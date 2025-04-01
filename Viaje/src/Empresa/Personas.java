package Empresa;
import java.util.List;

public class Personas{
	
	private long numDocumento;
	
	private String nombre;
	
	private String apellido;

	public Persona() {
		super();
	}

	public Persona(TipoDocumento miTipoDoc, long numDocumento,
			String nombre, String apellido) {
		super();
		this.miTipoDoc = miTipoDoc;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public TipoDocumento getMiTipoDoc() {
		return miTipoDoc;
	}

	public void setMiTipoDoc(TipoDocumento miTipoDoc) {
		this.miTipoDoc = miTipoDoc;
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
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	@Override
	public String toString() {
		return "miTipoDoc=" + miTipoDoc.getNombre() + ", numDocumento=" + numDocumento + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
