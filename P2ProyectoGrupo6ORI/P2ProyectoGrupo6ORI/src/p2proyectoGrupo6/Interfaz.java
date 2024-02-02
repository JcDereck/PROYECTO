package p2proyectoGrupo6;

public class Interfaz {
    
    public interface Books{
        public String getGenero();
        public void setGenero(String genero);
        public String getAutor();
        public void setAutor(String autor);
        public String getTitulo();
        public void setTitulo(String titulo);
        public String getEditorial();
        public void setEditorial(String editorial);
        public String getId();
        public void setId(String id) ;
        public int getAnioPublicacion();
        public void setAnioPublicacion(int anioPublicacion);
        public String getEdicion();
        public void setEdicion(String edicion);
    }
    
    public interface user{
        public String getID();
        public void setID(String ID);
        public String getNombre();
        public void setNombre(String nombre);
        public String getApellido();
        public void setApellido(String apellido);
        public String getCedula();
        public void setCedula(String cedula);
        public String getCorrecion();
        public void setCorrecion(String correcion);
        public String getDireccion();
        public void setDireccion(String direccion);
        public String getPerfil();
        public void setPerfil(String perfil);
    }
    
    public interface archivoCSV{
        //CREAR EN EL ARCHVO CSV
        void createFile(Libro books);
        //LEER EL ARCHIVO CSV
        
    }
    
}
