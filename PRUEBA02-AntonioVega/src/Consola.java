import java.util.Scanner;

public class Consola implements IEntradaSalida {
	private Scanner sc = new Scanner(System.in);

	public Consola() {
		this.sc = new Scanner(System.in);
	}

	public void imprimir(String texto) {
		System.out.print(texto);
	}

	public void imprimirLinea(String texto) {
		System.out.println(texto);
	}

	public String leerTexto(String mensaje) {
		imprimir(mensaje);
		return sc.nextLine().trim();
	}

	public int leerEntero(String mensaje) {
		while (true) {
			imprimir(mensaje);
			try {
				return Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				imprimirLinea("Entrada no válida. Debes introducir un número entero.");
			}
		}
	}

	public double leerImporte(String mensaje) {
		while (true) {
			imprimir(mensaje);
			try {
				return Double.parseDouble(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				imprimirLinea("Entrada no válida. Debes introducir un número entero.");
			}
		}
	}

	public void mostrarMenu() {

		imprimirLinea("MENU");
		imprimirLinea("1 - Contratar empleado");
		imprimirLinea("2 - Listar todos los empleados");
		imprimirLinea("3 - Listar empleados con filtro");
		imprimirLinea("4 - Salir\n");

	}

	public void pausa() {
		imprimirLinea("\nPulse una tecla para continuar.");
	        sc.nextLine();
	    }
	}
	
	
