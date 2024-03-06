import java.util.Scanner;

public class GestorBiblioteca {

	public static void run() {
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			Menu.menuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case Menu.SALIR:
				System.out.println("Finalizar programa...");
				break;
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;
			case Menu.GESTIONAR_PRESTAMOS:
				GestorPrestamo.run(scan);
				break;
			default:
				break;
			}
			
		}while(opcion != Menu.SALIR);
		
	}
}
