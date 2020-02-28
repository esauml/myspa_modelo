

/**
 *
 * @author Víctor Alejandro Santillán Martínez
 */
public class Producto_Sucursal {
    
    private Sucursal sucursal;
    private Producto producto;
    private int stock;
    
    public Producto_Sucursal(){
    }

    public Producto_Sucursal(Sucursal sucursal, Producto producto, int stock) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.stock = stock;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }        
}
