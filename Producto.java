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
            System.out.println("Error: El precio de venta no puede estar en blanco.");
        } else if (precioVenta.matches("[0-9]+(\\.[0-9]{1,2})?")) {
        
            double precio = Double.parseDouble(precioVenta);

        if (precio > 0) {
            this.precioVenta = precioVenta;
        } else {
            System.out.println("Error: El precio de venta debe ser mayor que 0.");
        }
        } else {
            System.out.println("Error: El formato del precio de venta no es válido.");
        }
    }

    public String getPrecioBeneficio() {
        return precioBeneficio;
    }

    public void setPrecioBeneficio(String precioBeneficio) {
        if (precioBeneficio.isBlank()) {
            System.out.println("Error: El precio de beneficio no puede estar en blanco.");
        } else if (precioBeneficio.matches("[0-9]+(\\.[0-9]{1,2})?")) {
            double precio = Double.parseDouble(precioBeneficio);

        if (precio > 0) {
            this.precioBeneficio = precioBeneficio;
        } else {
            System.out.println("Error: El precio de venta debe ser mayor que 0.");
        }
        } else {
            System.out.println("Error: El formato del precio de beneficio no es válido.");
        }
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        if (stock.isBlank()) {
            System.out.println("Error: El stock no puede estar en blanco.");
        } else if (stock.matches("[0-9]+(\\.[0-9]{1,2})?")) {
            this.stock = stock;
        } else {
            System.out.println("Error: El formato del stock no es válido.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    

    
    //  Constructores
    public Producto(){}
}
