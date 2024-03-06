import java.util.Scanner;

public class GestorPrestamo {

	public static void run(Scanner scan) {
		
		int opcion;
		
		do {
			Menu.menuPrestamos();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.REALIZAR_PRESTAMO:
				break;
			default:
				break;
			}
			
		}while(opcion != Menu.SALIR);
		
	}
}
