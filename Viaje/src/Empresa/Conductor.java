package Empresa;

public class Conductor extends Personas {

	@Override
	public int getidentificacion(int id) {
		return id;
	}

	@Override
	public String getNombre(String Name) {
		return Name;
	}

	@Override
	public void setCantidadDeID(int cantidad) {
	}

	@Override
	public int getCantidadDeID() {
		return 0;
	}

	public Boolean verificarLicencia() {
		int id = getCantidadDeID();
		Boolean licencia = false;

		if (id == getIdentificacion(id)) {
			return true;
		}

		return licencia;
	}

	public Boolean AsignacionDeRutaS() {

		return null;
	}
}
