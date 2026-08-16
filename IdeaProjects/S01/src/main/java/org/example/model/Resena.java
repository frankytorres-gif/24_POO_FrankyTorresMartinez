package org.example.model;

public class Resena {
    private int id;
    private String titulo;
    private String comentario;
    private int calificacion;

    public Resena() {}
    public Resena(int id, String titulo, String comentario, int calificacion) {
        this.id = id;
        this.titulo = titulo;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    public int getCalificacion() { return calificacion; }
    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }
}