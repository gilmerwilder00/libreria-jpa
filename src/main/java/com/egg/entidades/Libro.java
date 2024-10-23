package com.egg.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Libro")
public class Libro {

    @Id
    @Column(name = "isbn")
    private long isbn;

    @Column(name = "titulo", length = 255)
    private String titulo;

    @Column(name = "anio")
    private int anio;

    @Column(name = "ejemplares")
    private int ejemplares;

    @Column(name = "alta")
    private boolean alta = true;

    @ManyToOne
    @JoinColumn(name = "autor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "editorial")
    private Editorial editorial;

    public Libro() {
        this.alta=true;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", ejemplares=" + ejemplares +
                ", alta=" + alta +
                ", autor=" + (autor != null ? autor.getNombre() : "null") +
                ", editorial=" + (editorial != null ? editorial.getNombre() : "null") +
                '}';
    }

}
