package p2proyectoGrupo6;

import p2proyectoGrupo6.Interfaz.Books;

public class Libro implements Books{
    private String genero; 
    private String autor;
    private String titulo;
    private String editorial;
    private String id;
    private int anioPublicacion;
    private String edicion;

    public Libro(String genero, String autor, String titulo, String editorial, String id, int anioPublicacion, String edicion) {
        this.genero = genero;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.id = id;
        this.anioPublicacion = anioPublicacion;
        this.edicion = edicion;
    }
    @Override
    public String getGenero() {
        return genero;
    }
    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String getAutor() {
        return autor;
    }
    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String getTitulo() {
        return titulo;
    }
    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String getEditorial() {
        return editorial;
    }
    @Override
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    @Override
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    @Override
    public String getEdicion() {
        return edicion;
    }
    @Override
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
