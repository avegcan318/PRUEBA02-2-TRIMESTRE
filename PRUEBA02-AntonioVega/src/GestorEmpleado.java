import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestorEmpleado {

    private Plantilla plantilla;
    private IEntradaSalida consola;

    public GestorEmpleado(Plantilla plantilla, IEntradaSalida consola) {
        this.plantilla = plantilla;
        this.consola = consola;
    }

    public void ejecutar() {
        int opcion = 0;
        do {
            consola.mostrarMenu();
            opcion = consola.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> contratarEmpleado();
                case 2 -> listarTodos();
                case 3 -> listarPorFiltro();
				case 4 -> consola.imprimirLinea("Se ha salido del programa.");
                default -> consola.imprimirLinea("Opción no válida.");
            }

        } while (opcion != 4);
    }

    private void contratarEmpleado() {
		int tipo, categoria;
		String dni, nombre, apellidos;
		double sueldoBase, ventas;

        consola.imprimirLinea(" Nuevo Empleado ");
		tipo = consola.leerEntero("Seleccione un Tipo (1-Técnico, 2-Comercial): ");

		dni = consola.leerTexto("DNI: ");
		nombre = consola.leerTexto("Nombre: ");
		apellidos = consola.leerTexto("Apellidos: ");
		sueldoBase = consola.leerImporte("Sueldo Base: ");

        if (tipo == 1) {
			categoria = consola.leerEntero("Categoría: ");
            plantilla.agregarEmpleado(new Tecnico(dni, nombre, apellidos, sueldoBase, categoria));

        } else if (tipo == 2) {
			ventas = consola.leerImporte("Ventas: ");
            plantilla.agregarEmpleado(new Comercial(dni, nombre, apellidos, sueldoBase, ventas));
        }
    }

	private void listarTodos() {
        List<Empleado> todos = plantilla.getEmpleadosPorNombre("");

        listarEmpleados(todos);
    }

	private void listarPorFiltro() {
        String texto = consola.leerTexto("Texto a filtrar: ");
        List<Empleado> filtrados = plantilla.getEmpleadosPorNombre(texto);

        listarEmpleados(filtrados);
    }

    private void listarEmpleados(List<Empleado> lista) {
        if (lista.isEmpty()) {
            consola.imprimirLinea("No hay resultados.");

        }

		ordenarPorNombre(lista);

        for (int i = 0; i < lista.size(); i++) {
            Empleado e = lista.get(i);

			consola.imprimirLinea((i + 1) + e.getNombre() + " " + e.getApellidos() + ": " + e.getSueldo());

        }
    }

	private void ordenarPorNombre(List<Empleado> empleados) {
		Collections.sort(empleados, Comparator.comparing(Empleado::getNombre));
	}

}