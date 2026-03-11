
public class Tecnico extends Empleado {

	private int categoria;

	public Tecnico(String dni, String nombre, String apellidos, double sueldoBase, int categoria) {
		super(dni, nombre, apellidos, sueldoBase);
		this.categoria = categoria;
	}

	@Override
	public double getSueldo() {
		return getSueldoBase() + (categoria * 100);
	}

}
