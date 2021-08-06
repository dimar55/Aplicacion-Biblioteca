package Listas;

public class Usuario {
    
    int id_usuario;
    String nombre, apellido, tipo_usuario;
    int dia_permitido;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre, String apellido, String tipo_usuario, int dia_permitido) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_usuario = tipo_usuario;
        this.dia_permitido = dia_permitido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public int getDia_permitido() {
        return dia_permitido;
    }

    public void setDia_permitido(int dia_permitido) {
        this.dia_permitido = dia_permitido;
    }
    
    
}
