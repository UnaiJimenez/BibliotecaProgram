import java.util.ArrayList;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}
	
	public static void mostrarSocios(ArrayList<Socio> socios) {
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
	
	public static void mostrarLibro(Libro libro) {
		System.out.println(libro);
	}
	
	public static void mostrarMensaje(String mensaje) {
		
	}
		
	
}
