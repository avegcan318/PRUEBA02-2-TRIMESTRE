
public interface IEntradaSalida {

	void imprimir(String texto);

	void imprimirLinea(String texto);

	String leerTexto(String mensaje);

	int leerEntero(String mensaje);

	double leerImporte(String mensaje);

	void mostrarMenu();

	void limpiarPantalla();

	void pausa();
}