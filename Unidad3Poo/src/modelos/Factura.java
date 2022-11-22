package Evaluacion3;


/**
 * @author Jose
 * @version 1.0
 * @created 22-nov.-2022 16:04:29
 */
public class Factura {

	private int codigo;
	private int fecha;
	public Cliente m_Cliente;
	public Producto m_Producto;
	public Vendedor m_Vendedor;

	public Factura(){

	}

    public Factura(int codigo, int fecha, Cliente m_Cliente, Producto m_Producto, Vendedor m_Vendedor, double , double , double ) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.m_Cliente = m_Cliente;
        this.m_Producto = m_Producto;
        this.m_Vendedor = m_Vendedor;
        this.<error> = <error>;
        this.<error> = <error>;
        this.<error> = <error>;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Cliente getM_Cliente() {
        return m_Cliente;
    }

    public void setM_Cliente(Cliente m_Cliente) {
        this.m_Cliente = m_Cliente;
    }

    public Producto getM_Producto() {
        return m_Producto;
    }

    public void setM_Producto(Producto m_Producto) {
        this.m_Producto = m_Producto;
    }

    public Vendedor getM_Vendedor() {
        return m_Vendedor;
    }

    public void setM_Vendedor(Vendedor m_Vendedor) {
        this.m_Vendedor = m_Vendedor;
    }

    

	/**
	 * 
	 * @param Producto
	 */
	public void agregarProducto(Producto Producto){

	}

	/**
	 * 
	 * @param IVA
	 */
	public double aplicarIVA(double, double IVA){
		return 0;
	}

	/**
	 * 
	 * @param double, double
	 */
	public double calcMonto(double, double double, double){
		return 0;
	}

	/**
	 * 
	 * @param List<Producto>
	 */
	public double calcTotal(List<Producto> List<Producto>){
		return 0;
	}
}//end Factura