package org.example.controller;

import org.example.model.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private List<Editorial> listaEditoriales = new ArrayList<>();
    private List<Categoria> listaCategorias = new ArrayList<>();
    private List<Revista> listaRevistas = new ArrayList<>();
    private List<Estudiante> listaEstudiantes = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();
    private List<Sede> listaSedes = new ArrayList<>();
    private List<GeneroLiterario> listaGeneros = new ArrayList<>();
    private List<Membresia> listaMembresias = new ArrayList<>();
    private List<Resena> listaResenas = new ArrayList<>();
    private List<Ejemplar> listaEjemplares = new ArrayList<>();

    // Métodos para Registrar
    public void registrarEditorial(Editorial e) { listaEditoriales.add(e); }
    public void registrarCategoria(Categoria c) { listaCategorias.add(c); }
    public void registrarRevista(Revista r) { listaRevistas.add(r); }
    public void registrarEstudiante(Estudiante e) { listaEstudiantes.add(e); }
    public void registrarBibliotecario(Bibliotecario b) { listaBibliotecarios.add(b); }
    public void registrarSede(Sede s) { listaSedes.add(s); }
    public void registrarGenero(GeneroLiterario g) { listaGeneros.add(g); }
    public void registrarMembresia(Membresia m) { listaMembresias.add(m); }
    public void registrarResena(Resena r) { listaResenas.add(r); }
    public void registrarEjemplar(Ejemplar ej) { listaEjemplares.add(ej); }

    // Métodos para Listar
    public List<Editorial> listarEditoriales() { return listaEditoriales; }
    public List<Categoria> listarCategorias() { return listaCategorias; }
    public List<Revista> listarRevistas() { return listaRevistas; }
    public List<Estudiante> listarEstudiantes() { return listaEstudiantes; }
    public List<Bibliotecario> listarBibliotecarios() { return listaBibliotecarios; }
    public List<Sede> listarSedes() { return listaSedes; }
    public List<GeneroLiterario> listarGeneros() { return listaGeneros; }
    public List<Membresia> listarMembresias() { return listaMembresias; }
    public List<Resena> listarResenas() { return listaResenas; }
    public List<Ejemplar> listarEjemplares() { return listaEjemplares; }
}