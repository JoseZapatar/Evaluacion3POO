package modelos;

/**
 * @author Jose
 * @version 1.0
 * @created 22-nov.-2022 16:04:32
 */
public class Vendedor {

    private String apellidos;
    private int codigo;
    private String nombres;

    public Vendedor() {

    }

    public Vendedor(String apellidos, int codigo, String nombres) {
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.nombres = nombres;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
}//end Vendedor
