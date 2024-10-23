package com.egg.persistencias;

import com.egg.entidades.Editorial;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EditorialDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");

    private EntityManager em = emf.createEntityManager();

    // Persistir
    public void guardarEditorial(Editorial editorial){
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    // Buscar por id
    public Editorial buscarEditorial(int id){
        return em.find(Editorial.class, id);
    }

    // Actualizar
    public void actualizarEditorial(Editorial editorial){
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    // Eliminar


}
