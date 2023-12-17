import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Cliente {
    private int ID_cliente;
    private String Nombre;
    private String Direccion;
    private String Contacto;

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int iD_cliente) {
        ID_cliente = iD_cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }

    public Cliente(int ID_cliente, String Nombre, String Direccion, String Contacto) {
        this.ID_cliente = ID_cliente;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Contacto = Contacto;
    }

    public void ObtenerInfo() {
        System.out.println("ID: " + this.getID_cliente());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Contacto: " + this.getContacto());
    }

    public void ActualizarInfo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nIntroduce el nuevo nombre del cliente (presione Enter para no cambiarlo): ");
            String nuevaNombre = sc.nextLine();
            if (!nuevaNombre.isEmpty()) {
                this.setNombre(nuevaNombre);
            }
            System.out.print("Introduce la nueva dirección del cliente: ");
            this.setDireccion(sc.nextLine());
            System.out.print("Introduce el nuevo contacto del cliente: ");
            this.setContacto(sc.nextLine());
        }
    }

public void MostrarInfo() {
    System.out.println("ID: " + this.getID_cliente());
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Dirección: " + this.getDireccion());
    System.out.println("Contacto: " + this.getContacto());
}

}

class Producto {
    private int ID_producto;
    private String Nombre;
    private String Descripcion;
    private double Precio;

    public Producto(int idp, String nombre, String descripcion, double precio) {
        this.ID_producto = idp;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int iD_producto) {
        ID_producto = iD_producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}

class Factura {
    private int Numero_factura;
    private String Fecha_emision;
    private Cliente cliente;
    private List<LineaFactura> lineasFactura;

    public Factura() {
        this.Numero_factura = 0;
        this.Fecha_emision = "";
        this.cliente = null;
        this.lineasFactura = new ArrayList<>();
    }

    // Métodos getter y setter (sin cambios)
public void AgregarProducto(int idp, String descripcion, double precio) {
    LineaFactura lf = new LineaFactura(new Producto(idp, descripcion, "", precio), 1);
    lineasFactura.add(lf);
}


    public int getNumero_factura() {
        return Numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        Numero_factura = numero_factura;
    }

    public String getFecha_emision() {
        return Fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        Fecha_emision = fecha_emision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LineaFactura> getLineasFactura() {
        return lineasFactura;
    }

    public void setLineasFactura(List<LineaFactura> lineasFactura) {
        this.lineasFactura = lineasFactura;
    }

    public void MostrarFactura() {
        System.out.println("Número de factura: " + Numero_factura);
        System.out.println("Fecha de emisión: " + Fecha_emision);
        System.out.println("Información del/los cliente/s:");
        cliente.MostrarInfo();
        System.out.println("\nDetalle de la compra: ");
        for (LineaFactura l : lineasFactura) {
            l.MostrarInfo();
            }
            double total = CalcularTotal();
            System.out.printf("Importe Total: $%.2f\n", total);
            }
    private double CalcularTotal() {
        double total = 0;
        for (LineaFactura linea : lineasFactura) {
            total += linea.CalcularSubtotal();
        }
        return total;
    }
    public void GenerarFactura() {
        System.out.println("Generando factura...");
        }
    public void EnviarFactura() {
    System.out.println("Enviando factura...");
        }
    }
    class LineaFactura {
    private Producto producto;
    private int Cantidad;
    public LineaFactura(Producto p, int cant) {
        this.producto = p;
        this.Cantidad = cant;
    }

public void MostrarInfo() {
    System.out.println("Línea de factura:");
    System.out.println("Producto: " + producto.getNombre());
    System.out.println("Cantidad: " + Cantidad);
    System.out.println("Subtotal: $" + CalcularSubtotal());
}
    public double CalcularSubtotal() {
        return Cantidad * producto.getPrecio();
    }
    public String MostrarInformacion() {
        DecimalFormat formatoMoneda = new DecimalFormat("###,###.00");
        return "\n" + producto.getID_producto() + "\t" + producto.getDescripcion() + "\t"
                + formatoMoneda.format(producto.getPrecio()) + "\t" + Cantidad;
    }
}
    public class FacturacionApp {
        public static void main(String[] args) {
        Factura miFactura = crearFactura();
        procesarFactura(miFactura);
    }
    public static void procesarFactura(Factura factura) {
        factura.MostrarFactura();
        factura.GenerarFactura();
        factura.EnviarFactura();
    }
    private static Factura crearFactura() {
        Cliente cliente = new Cliente(1, "Cliente Ejemplo", "Dirección de Ejemplo", "Contacto de Ejemplo");
        Factura miFactura = new Factura();
        miFactura.setNumero_factura(1);
        miFactura.setFecha_emision("2023-12-16");
        miFactura.setCliente(cliente);
        miFactura.AgregarProducto(1, "Producto 1", 20.0);
        return miFactura;
    }
}