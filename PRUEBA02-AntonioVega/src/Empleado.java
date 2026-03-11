
public abstract class Empleado {
	private String dni, nombre, apellidos;
	private double sueldoBase;

	public Empleado(String dni, String nombre, String apellidos, double sueldoBase) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public abstract double getSueldo();

}
