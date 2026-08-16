package org.example.model;

public class Ejemplar {
    private int id;
    private String codigo;
    private String estado;

    public Ejemplar() {}
    public Ejemplar(int id, String codigo, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}