package modelos;

/**
 * @author Jose
 * @version 1.0
 * @created 22-nov.-2022 16:04:33
 */
public class Producto {

    private int codigo;
    private int nombre;
    private int precio;

    public Producto() {

    }

    public Producto(int codigo, int nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
   
}//end Producto
