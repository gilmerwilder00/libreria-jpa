package com.egg.persistencias;

import com.egg.entidades.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AutorDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");

    private EntityManager em = emf.createEntityManager();

    // Persistir
    public void guardarEditorial(Autor autor){
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    // Buscar por id
    public Autor buscarEditorial(int id){
        return em.find(Autor.class, id);
    }

    // Actualizar
    public void actualizarEditorial(Autor autor){
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    // Eliminar
}
