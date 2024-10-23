package com.egg.servicios;

import com.egg.entidades.Editorial;
import com.egg.persistencias.EditorialDAO;

public class EditorialServicio {
    private EditorialDAO daoEditorial;

    public EditorialServicio(){
        daoEditorial = new EditorialDAO();
    }

    public void crearEditorial(String nombre){
        Editorial nuevaEditorial = new Editorial();
        nuevaEditorial.setNombre(nombre);
        daoEditorial.guardarEditorial(nuevaEditorial);
    }

    public Editorial buscarEditorialPorID(int id){
        Editorial editorial = new Editorial();
        try {
            editorial = daoEditorial.buscarEditorial(id);
            if(editorial == null){
                System.out.println("No se encontro un editorial con el id proporcionado");
                System.out.println();                
            }
        } catch (Exception e) {
            System.out.println(e.toString() + "Error al buscar editorail.");
        }

        return editorial;
    }

}
