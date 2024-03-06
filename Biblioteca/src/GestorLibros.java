import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
				
		do {
			Menu.menuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				Libro libro = FormulariosDeDatos.pedirDatosLibro(scan);
				GestorBBDD.insertarLibro(libro);
				break;
			case Menu.ELIMINAR_LIBRO:
				int idElim = FormulariosDeDatos.pedirId(scan);
				GestorBBDD.eliminarLibro(idElim);
				break;
			case Menu.MODIFICAR_LIBRO:
				gestorBBDD.conectar();
				int idMod = FormulariosDeDatos.pedirId(scan);
				libro = FormulariosDeDatos.modificarDatosLibro(scan);
				GestorBBDD.getLibro(idMod, libro);
				gestorBBDD.cerrar();
				break;
			case Menu.VER_LIBROS:
				ArrayList<Libro> libros = gestorBBDD.getLibros();
				Visor.mostrarLibros(libros);
				break;
			default:
				break;
			}
			
		}while(opcion != Menu.SALIR);
		
	}
}
