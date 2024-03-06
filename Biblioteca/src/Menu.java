public class Menu {
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	public static final int SALIR = 0;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	public static final int VER_LIBROS = 4;
	
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int MODIFICAR_SOCIO = 3;
	public static final int VER_SOCIOS = 4;
	
	public static final int REALIZAR_PRESTAMO = 1;

	public static void menuPrincipal() {
		System.out.println("0- Salir \n" 
				+ GESTIONAR_LIBROS +"- Gestor Libros \n" 
				+ GESTIONAR_SOCIOS +"- Gestor Socios \n" 
				+ GESTIONAR_PRESTAMOS +"- Gestor Prestamos \n");

	}

	public static void menuLibros() {
		System.out.println("0- Salir \n" 
				+ INSERTAR_SOCIO +"- Insertar libro \n" 
				+ ELIMINAR_LIBRO +"- Eliminar libro \n" 
				+ MODIFICAR_LIBRO +"- Modificar libro \n"
				+ VER_LIBROS + "- Ver libros \n");

	}

	public static void menuSocios() {

		System.out.println("0- Salir \n" 
				+ INSERTAR_SOCIO +"- Insertar socio \n" 
				+ ELIMINAR_SOCIO +"- Eliminar socio \n"
				+ MODIFICAR_SOCIO +"- Modificar socio \n"
				+ VER_SOCIOS +"- Ver socios");
		
	}	

	public static void menuPrestamos() {

		System.out.println("0- Salir \n" 
				+ "1- Realizar prestamo \n");

	}
}

