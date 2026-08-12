package org.example.controller;

import org.example.model.Contacto;
import java.util.ArrayList;
import java.util.List;

public class AgendaController {
    private List<Contacto> contactos;

    public AgendaController() {
        this.contactos = new ArrayList<>();
        cargarContactosPrueba();
    }

    private void cargarContactosPrueba() {
        contactos.add(new Contacto("Carlos", "987654321", "carlos@gmail.com"));
        contactos.add(new Contacto("Ana", "912345678", "ana@gmail.com"));
        contactos.add(new Contacto("Luis", "955112233", "luis@gmail.com"));
        contactos.add(new Contacto("María", "944556677", "maria@gmail.com"));
        contactos.add(new Contacto("Juan", "933221100", "juan@gmail.com"));
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public List<Contacto> obtenerContactos() {
        return contactos;
    }

    public Contacto buscarContactoPorNombre(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarContacto(String nombre) {
        Contacto contacto = buscarContactoPorNombre(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
            return true;
        }
        return false;
    }
}