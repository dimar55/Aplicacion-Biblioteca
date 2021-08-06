
package Listas;

public class DiasPermitidos {
   int diasColeccion;
   int diasUsuario;

    public DiasPermitidos() {
        
    }

    public DiasPermitidos(int diasColeccion, int diasUsuario) {
        this.diasColeccion = diasColeccion;
        this.diasUsuario = diasUsuario;
    }

    public int getDiasColeccion() {
        return diasColeccion;
    }

    public void setDiasColeccion(int diasColeccion) {
        this.diasColeccion = diasColeccion;
    }

    public int getDiasUsuario() {
        return diasUsuario;
    }

    public void setDiasUsuario(int diasUsuario) {
        this.diasUsuario = diasUsuario;
    }
    
}

