/**
 * @author Ivonne
 *  Clase Producto
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String precioVenta;
    private String precioBeneficio;
    private String stock;

    public void setCodigo(String codigo) {
        this.codigo = codigo.isBlank() ? "Error: El codigo no puede estar en blanco." : codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.isBlank() ? "Error: El nombre no puede estar en blanco." : nombre;
    }

    public String getPrecioVenta() {
    return precioVenta;
    }
    

    public void setPrecioVenta(String precioVenta) {
        if (precioVenta.isBlank()) {
            //System.out.println("Error: El precio de venta no puede estar en blanco.");
             this.precioVenta = "Error:  El precio de venta no puede estar en blanco.";
        } else if (precioVenta.matches("[0-9]+(\\.[0-9]{1,2})?")) {
        
            double precio = Double.parseDouble(precioVenta);

        if (precio > 0) {
            this.precioVenta = precioVenta;
        } else {
            //System.out.println("Error: El precio de venta debe ser mayor que 0.");
            this.precioVenta = "Error: El precio de venta debe ser mayor que 0";
        }
        } else {
            //System.out.println("Error: El formato del precio de venta no es válido.");
            this.precioVenta = "Error: Formato no válido";
        }
    }

    public String getPrecioBeneficio() {
        return precioBeneficio;
    }

    public void setPrecioBeneficio(String precioBeneficio) {
        if (precioBeneficio.isBlank()) {
            //System.out.println("Error: El precio de beneficio no puede estar en blanco.");
             this.precioBeneficio = "Error:  El precio de beneficio no puede estar en blanco.";
        } else if (precioBeneficio.matches("[0-9]+(\\.[0-9]{1,2})?")) {
        
            double precio = Double.parseDouble(precioBeneficio);

        if (precio > 0) {
            this.precioBeneficio = precioBeneficio;
        } else {
            //System.out.println("Error: El precio de beneficio debe ser mayor que 0.");
            this.precioBeneficio = "Error: El precio de beneficio debe ser mayor que 0";
        }
        } else {
            //System.out.println("Error: El formato del precio de beneficio no es válido.");
            this.precioBeneficio = "Error: Formato no válido";
        }
    }
    

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        
        if (stock.isBlank()) {
            //System.out.println("Error: El stock no puede estar en blanco.");
             this.stock = "Error:  El stock no puede estar en blanco.";
        } else if (stock.matches("[0-9]")) {
            this.stock = stock;
        } else {
            //System.out.println("Error: El formato del stock no es válido.");
            this.stock = "Error: Formato no válido";
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarProducto() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio Venta: " + getPrecioVenta());
        System.out.println("Precio Beneficio: " + getPrecioBeneficio());
        System.out.println("Stock: " + getStock());
    }
    

    
    //  Constructores
    public Producto(){}
    public Producto(String codigo, String nombre, String precioVenta, String precioBeneficio, String stock) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecioVenta(precioVenta);
        setPrecioBeneficio(precioBeneficio);
        setStock(stock);
    }
    public static void main(String[] args) {

        Producto producto = new Producto("12345", "Lavadora", "136", "126.5", "100");
        producto.mostrarProducto();
    }
}
