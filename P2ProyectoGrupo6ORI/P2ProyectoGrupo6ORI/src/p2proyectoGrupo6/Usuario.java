package p2proyectoGrupo6;

public class Usuario implements Interfaz.user{
    private String ID;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correcion;
    private String direccion;
    private String perfil;

    public Usuario(String ID, String nombre, String apellido, String cedula, String correcion, String direccion, String perfil) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correcion = correcion;
        this.direccion = direccion;
        this.perfil = perfil;
    }
    @Override
    public String getID() {
        return ID;
    }
    @Override
    public void setID(String ID) {
        this.ID = ID;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String getCedula() {
        return cedula;
    }
    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    @Override
    public String getCorrecion() {
        return correcion;
    }
    @Override
    public void setCorrecion(String correcion) {
        this.correcion = correcion;
    }
    @Override
    public String getDireccion() {
        return direccion;
    }
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String getPerfil() {
        return perfil;
    }
    @Override
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
