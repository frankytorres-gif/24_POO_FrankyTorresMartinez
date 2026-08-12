package org.example.view;

import org.example.controller.AgendaController;
import org.example.model.Contacto;

import java.util.List;
import java.util.Scanner;

public class AgendaView {
    private AgendaController controller;
    private Scanner scanner;

    public AgendaView() {
        this.controller = new AgendaController();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            procesarOpcion(opcion);
            System.out.println();
        } while (opcion != 5);
    }

    private void mostrarMenu() {
        System.out.println("====== AGENDA DE CONTACTOS ======");
        System.out.println("1. Registrar contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarContacto();
                break;
            case 2:
                listarContactos();
                break;
            case 3:
                buscarContacto();
                break;
            case 4:
                eliminarContacto();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    private void registrarContacto() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contacto nuevo = new Contacto(nombre, telefono, email);
        controller.agregarContacto(nuevo);
        System.out.println("¡Contacto registrado exitosamente!");
    }

    private void listarContactos() {
        List<Contacto> lista = controller.obtenerContactos();
        if (lista.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("\n--- LISTA DE CONTACTOS ---");
            for (Contacto c : lista) {
                System.out.println(c);
            }
        }
    }

    private void buscarContacto() {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombre = scanner.nextLine();
        Contacto c = controller.buscarContactoPorNombre(nombre);
        if (c != null) {
            System.out.println("Contacto encontrado: " + c);
        } else {
            System.out.println("No se encontró ningún contacto con ese nombre.");
        }
    }

    private void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        if (controller.eliminarContacto(nombre)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto para eliminar.");
        }
    }
}