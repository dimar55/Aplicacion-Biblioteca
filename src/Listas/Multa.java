package Listas;

public class Multa {
    
    int id_multa, id_usuario, id_prestamo, dia_mora, valor_multa;

    public Multa() {
    }

    public Multa(int id_multa, int id_usuario, int id_prestamo, int dia_mora, int valor_multa) {
        this.id_multa = id_multa;
        this.id_usuario = id_usuario;
        this.id_prestamo = id_prestamo;
        this.dia_mora = dia_mora;
        this.valor_multa = valor_multa;
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getDia_mora() {
        return dia_mora;
    }

    public void setDia_mora(int dia_mora) {
        this.dia_mora = dia_mora;
    }

    public int getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(int valor_multa) {
        this.valor_multa = valor_multa;
    }
    
    
}
