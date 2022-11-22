package modelos;

/**
 * @author Jose
 * @version 1.0
 * @created 22-nov.-2022 16:04:31
 */
public class Cliente {

    private String apellidos;
    private int codigo;
    private String direccion;
    private String email;
    private String nombres;
    private String telefono;

    public Cliente() {

    }

    public Cliente(String apellidos, int codigo, String direccion, String email, String nombres, String telefono) {
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.direccion = direccion;
        this.email = email;
        this.nombres = nombres;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
 
}//end Cliente
