import java.util.ArrayList;
import java.util.Scanner;

public class GestorSocios {

	public static void run(Scanner scan) {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		do {
			Menu.menuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				Socio socio = FormulariosDeDatos.pedirDatosSocio(scan);
				GestorBBDD.insertarSocio(socio);
				break;
			case Menu.ELIMINAR_SOCIO:
				int idElim = FormulariosDeDatos.pedirId(scan);
				GestorBBDD.eliminarSocio(idElim);
				break;
			case Menu.MODIFICAR_SOCIO:
				gestorBBDD.conectar();
				int idMod = FormulariosDeDatos.pedirId(scan);
				socio = FormulariosDeDatos.modificarDatosSocio(scan);
				GestorBBDD.getSocio(idMod, socio);
				gestorBBDD.cerrar();
				break;
			case Menu.VER_SOCIOS:
				ArrayList<Socio> socios = gestorBBDD.getSocios();
				Visor.mostrarSocios(socios);
				break;
			default:
				break;
			}
			
		}while(opcion != Menu.SALIR);
		
	}
}
