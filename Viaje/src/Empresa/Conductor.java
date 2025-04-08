package Empresa;

public class Conductor extends Personas {

	private long numDocumento;

	private String nombre;

	private String Apellido;
	
	private boolean Licencia;

	public Conductor() { 
	
		super();
	}

	public Conductor (long numDocumento, String nombre, String apellido, boolean Licencia) {
		super();
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.Apellido = apellido;
		this.Licencia = Licencia;
	}
	
	public boolean getLicenciaVal() {
		return Licencia;
	}
	
	public void setLicenciaVal(boolean Licencia) {
                this.Licencia=Licencia;
		
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
