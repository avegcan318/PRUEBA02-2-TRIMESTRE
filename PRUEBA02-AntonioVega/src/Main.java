
public class Main {

	public static void main(String[] args) {
		Consola consola = new Consola();

		Plantilla plantilla = new Plantilla();

		GestorEmpleado gestor = new GestorEmpleado(plantilla, consola);

		gestor.ejecutar();
	}
}
