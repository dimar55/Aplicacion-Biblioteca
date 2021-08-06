package Listas;

import java.util.Date;

public class Libro {
    
    String id_libro, titulo;
    String edicion;
    String ciudad;
    int anio;
    String editorial, descripcion;
    int valor_libro, id_coleccion;

    public Libro() {
    }

    public Libro(String id_libro, String titulo, String edicion, String ciudad, int anio, String editorial, String descripcion, int valor_libro, int id_coleccion) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.edicion = edicion;
        this.ciudad = ciudad;
        this.anio = anio;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.valor_libro = valor_libro;
        this.id_coleccion = id_coleccion;
    }

    public String getId_libro() {
        return id_libro;
    }

    public void setId_libro(String id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValor_libro() {
        return valor_libro;
    }

    public void setValor_libro(int valor_libro) {
        this.valor_libro = valor_libro;
    }

    public int getId_coleccion() {
        return id_coleccion;
    }

    public void setId_coleccion(int id_coleccion) {
        this.id_coleccion = id_coleccion;
    }

    
    
}
