import java.util.Scanner;

public class FormulariosDeDatos {

	public static Libro pedirDatosLibro(Scanner scan) {

		Libro l = new Libro();
		
		System.out.println("Introduce el autor del nuevo libro:");
		l.setAutor(scan.nextLine());
		System.out.println("Introduce el numero de paginas del nuevo libro:");
		l.setNum_pag(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el titulo del nuevo libro:");
		l.setTitulo(scan.nextLine());
		
		return l;
		
	}
	
	public static Socio pedirDatosSocio(Scanner scan) {

		Socio s = new Socio();
		
		System.out.println("Introduce el id del nuevo socio");
		s.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el nombre del nuevo socio:");
		s.setNombre(scan.nextLine());
		System.out.println("Introduce el apellido del nuevo socio:");
		s.setApellido(scan.nextLine());
		System.out.println("Introduce la direccion del nuevo socio:");
		s.setDireccion(scan.nextLine());
		System.out.println("Introduce la plobacion del nuevo socio:");
		s.setPoblacion(scan.nextLine());
		System.out.println("Introduce la provincia del nuevo socio:");
		s.setProvincia(scan.nextLine());
		System.out.println("Introduce el dni del nuevo socio:");
		s.setDni(scan.nextLine());
		
		return s;
		
	}
	
	public static Libro modificarDatosLibro(Scanner scan) {
		
		Libro libro1 = new Libro();
		
		System.out.println("Introduce el nuevo autor del libro:");
		libro1.setAutor(scan.nextLine());
		System.out.println("Introduce el nuevo numero de paginas del libro:");
		libro1.setNum_pag(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el nuevo titulo del libro:");
		libro1.setTitulo(scan.nextLine());
		
		return libro1;
		
	}
	
	public static Socio modificarDatosSocio(Scanner scan) {
		
		Socio socio1 = new Socio();
		
		System.out.println("Introduce el nuevo nombre del socio:");
		socio1.setNombre(scan.nextLine());
		System.out.println("Introduce el nuevo apellido del socio:");
		socio1.setApellido(scan.nextLine());
		System.out.println("Introduce la nueva direccion del socio:");
		socio1.setDireccion(scan.nextLine());
		System.out.println("Introduce la nueva poblacion del socio:");
		socio1.setPoblacion(scan.nextLine());
		System.out.println("Introduce la nueva provincia del socio:");
		socio1.setProvincia(scan.nextLine());
		System.out.println("Introduce el nuevo dni del socio:");
		socio1.setDni(scan.nextLine());
		
		return socio1;
		
	}
	
	public static int pedirId(Scanner scan) {
		
		System.out.println("Introduce el id: ");
		int idEliminar = Integer.parseInt(scan.nextLine());
		
		return idEliminar;
		
	}

}
