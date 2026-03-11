import java.util.ArrayList;
import java.util.List;


public class Plantilla {
	private List<Empleado> empleados;

	public Plantilla() {
		this.empleados = new ArrayList<>();
	}

	public void agregarEmpleado(Empleado empleado) {
		if (empleado != null) {
			empleados.add(empleado);
		}
	}

	public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
		List<Empleado> filtrados = new ArrayList<>();
		String nombreCompleto;

		if (filtroNombre == null || filtroNombre.trim().isEmpty()) {
			return new ArrayList<>(empleados);
		}

		for (Empleado e : empleados) {
			nombreCompleto = (e.getNombre() + e.getApellidos()).toLowerCase();

			if (nombreCompleto.contains(filtroNombre.toLowerCase())) {
				filtrados.add(e);
			}
		}
		return filtrados;
	}

}