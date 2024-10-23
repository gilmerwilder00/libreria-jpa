package com.egg;

import com.egg.entidades.Editorial;
import com.egg.servicios.EditorialServicio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    public static void main(String[] args) {

        // EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        // EntityManager em = emf.createEntityManager();

        EditorialServicio editorialServicio = new EditorialServicio();

        // editorialServicio.crearEditorial("Editorial pueba 1");
        // editorialServicio.crearEditorial("Editorial pueba 2");
        // editorialServicio.crearEditorial("Editorial pueba 3");

        // buscar editorial
        System.out.println();
        System.out.println();
        Editorial editorial = new Editorial();
        editorial = editorialServicio.buscarEditorialPorID(2);
        System.out.println(editorial);
        System.out.println();
        System.out.println();

        
    }
}

