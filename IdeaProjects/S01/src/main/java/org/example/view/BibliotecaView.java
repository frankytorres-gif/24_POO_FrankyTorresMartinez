package org.example.view;

import org.example.controller.BibliotecaController;
import org.example.model.Editorial;
import java.util.Scanner;

public class BibliotecaView {
    private BibliotecaController controller;
    private Scanner scanner;

    public BibliotecaView() {
        this.controller = new BibliotecaController();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Registrar autor ");
            System.out.println("5. Listar autores ");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> registrarLibro();
                    case 2 -> listarLibros();
                    case 3 -> System.out.println("Función 'Buscar libro' en desarrollo...");
                    case 4 -> registrarAutor();
                    case 5 -> listarAutores();
                    case 6 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine();
            }
        } while (opcion != 6);
    }

    // Método de validación obligatorio (Regla de validación de la imagen)
    private String leerTextoValido(String mensaje) {
        String texto = "";
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("No puede estar vacío.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    private void registrarLibro() {
        System.out.println("\n--- Registrar Libro ---");
        String titulo = leerTextoValido("Título del Libro: ");
        System.out.println("¡Libro '" + titulo + "' registrado con éxito!");
    }

    private void listarLibros() {
        System.out.println("\n--- Lista de Libros ---");
        System.out.println("No hay libros registrados aún.");
    }

    private void registrarAutor() {
        System.out.println("\n--- Registrar Autor ---");
        String nombre = leerTextoValido("Nombre del Autor: ");
        System.out.println("¡Autor '" + nombre + "' registrado con éxito!");
    }

    private void listarAutores() {
        System.out.println("\n--- Lista de Autores ---");
        System.out.println("No hay autores registrados aún.");
    }
}