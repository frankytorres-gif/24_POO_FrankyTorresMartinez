package org.example.model;

public class Bibliotecario {
    private int id;
    private String nombre;
    private String turno;

    public Bibliotecario() {}
    public Bibliotecario(int id, String nombre, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.turno = turno;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}