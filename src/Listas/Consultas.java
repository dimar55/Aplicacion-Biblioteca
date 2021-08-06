package Listas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.Global.getDate;

public class Consultas {
    
    static Conexion.Conectar con =new Conexion.Conectar();
    static Connection cn=con.conexion();
    
    
    public List<Autor> obtautor(){
       String sql="SELECT * FROM AUTOR";
        List<Autor> autores=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                autores.add(new Autor(rs.getInt(1),rs.getString(2)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return autores;
    }
    public List<Libro> obtlibro(){
       String sql="SELECT * FROM LIBRO";
        List<Libro> libros=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                libros.add(new Libro(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7),rs.getInt(8),rs.getInt(9)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return libros;
    }
    
    public List<Libro> obtlibroc(String titulo){
       String sql="SELECT * FROM LIBRO WHERE titulo like '%"+titulo+"%'";
        List<Libro> libros=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                libros.add(new Libro(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7),rs.getInt(8),rs.getInt(9)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return libros;
    }
    
    public List<Coleccion> obtcoleccion(){
       String sql="SELECT * FROM COLECCION";
        List<Coleccion> colecciones=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                colecciones.add(new Coleccion(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return colecciones;
    }
    public List<Coleccion> obtcoleccionc(String nombre){
       String sql="SELECT * FROM COLECCION WHERE nombre = '"+nombre+"'";
        List<Coleccion> colecciones=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                colecciones.add(new Coleccion(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return colecciones;
    }
    
    public List<DiasPermitidos> obtDiaspermitidos (String id_libro, int id_usuario){
    String sql="SELECT COLECCION.dia_permitido,USUARIO.dia_permitido \n" +
"FROM USUARIO, (LIBRO INNER JOIN COLECCION ON COLECCION.id_coleccion=LIBRO.id_coleccion)\n" +
"WHERE LIBRO.id_libro='"+id_libro+"' and USUARIO.id_usuario = "+id_usuario+"";
    List<DiasPermitidos> permitidos= new ArrayList<>();
        try {
            Statement st=cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
            permitidos.add(new DiasPermitidos(rs.getInt(1),rs.getInt(2)));
            }
        } catch (Exception ex) {
             Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
            return permitidos;
    
    }
    
    public List<NombreAutor> obtnomautor(String id_libro){
       String sql="SELECT AUTOR.nombre\n" +
         "FROM(LIBROSAUTOR INNER JOIN AUTOR ON LIBROSAUTOR.id_autor=AUTOR.id_autor)\n" +
         "WHERE (LIBROSAUTOR.id_libro like '"+id_libro+"');";
        List<NombreAutor> nom_autores=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                nom_autores.add(new NombreAutor(rs.getString(1)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return nom_autores;
    }
    
    
    public List<CantPrestamo> obtprestamoc(int codigo){
       String sql="SELECT COUNT(*) FROM PRESTAMO WHERE id_usuario = "+codigo+" and fecha_devolucion is null";
        List<CantPrestamo> prestamos=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                prestamos.add(new CantPrestamo(rs.getInt(1)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return prestamos;
    }
    
    
    public List<Prestamo> obtprestamocd(){
       String sql="SELECT * FROM PRESTAMO WHERE fecha_devolucion is null;";
        List<Prestamo> prestamos=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                prestamos.add(new Prestamo(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return prestamos;
    }
    public List<ValorLibro> obtVlibro(String id_libro){
       String sql="SELECT valor_libro FROM LIBRO WHERE id_libro='"+id_libro+"'";
        List<ValorLibro> Vlibros=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                Vlibros.add(new ValorLibro(rs.getInt(1)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return Vlibros;
    }
    
    public List<Multa> obtMulta(){
       String sql="SELECT * FROM MULTA ";
        List<Multa> Multas=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                Multas.add(new Multa(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return Multas;
    }
    
    public List<Multa> obtMultar(int id_usuario){
       String sql="SELECT * FROM MULTA WHERE id_usuario= "+id_usuario+" ";
        List<Multa> Multas=new ArrayList<>();
         try {
            Statement st= cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                Multas.add(new Multa(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
            }
         }catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return Multas;
    }
} 

