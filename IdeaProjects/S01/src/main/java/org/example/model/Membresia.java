package org.example.model;

public class Membresia {
    private int id;
    private String tipo;
    private String duracion;

    public Membresia() {}
    public Membresia(int id, String tipo, String duracion) {
        this.id = id;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }
}