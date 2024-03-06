import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBBDD extends Conector {

	public static void insertarLibro(Libro l) {
		conectar();
		Statement st;
		
		try {
			st = cn.createStatement();
			
			String sentenciaInsert = "INSERT INTO libros(titulo, autor, num_pag) VALUES (?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sentenciaInsert);
            
            ps.setString(1,l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setInt(3,l.getNum_pag());
            
            ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertarSocio(Socio s) {
		conectar();
		Statement st;
		
		try {
			st = cn.createStatement();
			
			String sentenciaInsert = "INSERT INTO socios(id, nombre, apellido, direccion, poblacion, provincia, dni) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sentenciaInsert);
            
            ps.setInt(1, s.getId());
            ps.setString(2,s.getNombre());
            ps.setString(3,s.getApellido());
            ps.setString(4,s.getDireccion());
            ps.setString(5,s.getPoblacion());
            ps.setString(6,s.getProvincia());
            ps.setString(7,s.getDni());
            
            ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void eliminarLibro(int id) {
		conectar();
		Statement st;
		
		try {
			st = cn.createStatement();
			st.execute("delete from libros where id=" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void eliminarSocio(int id) {
		conectar();
		Statement st;
		
		try {
			st = cn.createStatement();
			st.execute("delete from socios where id=" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getLibro(int id, Libro libro) {
		Statement st;
		
		try {
			st = cn.createStatement();
			
			String sentenciaInsert = "UPDATE libros SET titulo=?, autor=?, num_pag=? WHERE id="+id;
            PreparedStatement ps = cn.prepareStatement(sentenciaInsert);
            
            libro.setId(id);
			ps.setString(1,libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3,libro.getNum_pag());
            
            ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getSocio(int id, Socio socio) {
		Statement st;
		
		try {
			st = cn.createStatement();
			
			String sentenciaInsert = "UPDATE socios SET nombre=?, apellido=?, direccion=?, poblacion=?, provincia=?, dni=? WHERE id="+id;
            PreparedStatement ps = cn.prepareStatement(sentenciaInsert);
            
            socio.setId(id);
            ps.setString(1,socio.getNombre());
            ps.setString(2,socio.getApellido());
            ps.setString(3,socio.getDireccion());
            ps.setString(4,socio.getPoblacion());
            ps.setString(5,socio.getProvincia());
            ps.setString(6,socio.getDni());

            ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static ArrayList<Libro> getLibros() {
		conectar();
		ArrayList<Libro> libros = new ArrayList<>();

		Statement st;
		try {
			st = cn.createStatement();
			String sentenciaSelect = "SELECT * FROM libros";

			ResultSet resultado = st.executeQuery(sentenciaSelect);

			while (resultado.next()) {
				Libro l = new Libro();
				l.setAutor(resultado.getString("autor"));
				l.setId(resultado.getInt("id"));
				l.setNum_pag(resultado.getInt("Num_pag"));
				l.setTitulo(resultado.getString("titulo"));
				
				libros.add(l);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		cerrar();

		return libros;
	}
	
	public static ArrayList<Socio> getSocios() {
		conectar();
		ArrayList<Socio> socios = new ArrayList<>();

		Statement st;
		try {
			st = cn.createStatement();
			String sentenciaSelect = "SELECT * FROM socios";

			ResultSet resultado = st.executeQuery(sentenciaSelect);

			while (resultado.next()) {
				Socio s = new Socio();
				s.setId(resultado.getInt("id"));
				s.setNombre(resultado.getString("nombre"));
				s.setApellido(resultado.getString("apellido"));
				s.setDireccion(resultado.getString("direccion"));
				s.setPoblacion(resultado.getString("poblacion"));
				s.setProvincia(resultado.getString("provincia"));
				s.setDni(resultado.getString("dni"));
				
				socios.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		cerrar();

		return socios;
	}

}
