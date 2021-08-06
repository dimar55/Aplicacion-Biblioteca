package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    Connection conect ;
    public Connection conexion()
        {
            try {
                Class.forName("org.postgresql.Driver");;
                conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Biblioteca","postgres","1234");
                System.out.println("Conexion establecida");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                //JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
}
