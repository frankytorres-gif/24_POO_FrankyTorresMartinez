package org.example.model;

public class Revista {
    private int id;
    private String titulo;
    private String editor;
    private int anio;

    public Revista() {}
    public Revista(int id, String titulo, String editor, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.editor = editor;
        this.anio = anio;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getEditor() { return editor; }
    public void setEditor(String editor) { this.editor = editor; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
}