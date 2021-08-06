package Listas;

public class Coleccion {
    
    int id_coleccion;
    String nombre;
    int dia_permitido;

    public Coleccion() {
    }

    public Coleccion(int id_coleccion, String nombre, int dia_permitido) {
        this.id_coleccion = id_coleccion;
        this.nombre = nombre;
        this.dia_permitido = dia_permitido;
    }

    public int getId_coleccion() {
        return id_coleccion;
    }

    public void setId_coleccion(int id_coleccion) {
        this.id_coleccion = id_coleccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia_permitido() {
        return dia_permitido;
    }

    public void setDia_permitido(int dia_permitido) {
        this.dia_permitido = dia_permitido;
    }
    
   
    
}
