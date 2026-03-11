
public class Comercial extends Empleado {

	private double ventas;

	public Comercial(String dni, String nombre, String apellidos, double sueldoBase, double ventas) {
		super(dni, nombre, apellidos, sueldoBase);
		this.ventas = ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public double getSueldo() {
		return getSueldoBase() + (ventas * 0.10);
	}
}
