import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Articulo {
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

class Factura {
    private String cajero;
    private int numeroFactura;
    private ArrayList<Articulo> articulos;
    private Date fechaEmision;

    public Factura(String cajero, int numeroFactura, ArrayList<Articulo> articulos) {
        this.cajero = cajero;
        this.numeroFactura = numeroFactura;
        this.articulos = articulos;
        this.fechaEmision = new Date(); // Fecha de emisión por defecto es la fecha actual
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double calcularTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.getPrecio();
        }
        return total;
    }

    public void mostrarFactura() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("**********************************************");
        System.out.println("*                  SUPERMAXI                 *");
        System.out.println("**********************************************");
        System.out.println("*               FACTURA DE COMPRA            *");
        System.out.println("**********************************************");
        System.out.println("*  Cajero: " + cajero);
        System.out.println("*  Número de Factura: " + numeroFactura);
        System.out.println("*  Fecha de Emisión: " + sdf.format(fechaEmision));
        System.out.println("**********************************************");
        System.out.println("*                   Artículos");

        for (Articulo articulo : articulos) {
            System.out.printf(" - %-20s $%.2f%n", articulo.getNombre(), articulo.getPrecio());
        }

        System.out.println("**********************************************");
        System.out.printf("Total: $%.2f%n", calcularTotal());
        System.out.println("**********************************************");
    }
}

public class FacturacionApp {
    public static void main(String[] args) {
        // Crear artículos
        Articulo articulo1 = new Articulo();
        articulo1.setNombre("Leche");
        articulo1.setPrecio(2.5);
        Articulo articulo2 = new Articulo();
        articulo2.setNombre("Pan");
        articulo2.setPrecio(1.0);
        Articulo articulo3 = new Articulo();
        articulo3.setNombre("Lavadora");
        articulo3.setPrecio(126.5);

        // Crear factura
        ArrayList<Articulo> listaArticulos = new ArrayList<>();
        listaArticulos.add(articulo1);
        listaArticulos.add(articulo2);
        listaArticulos.add(articulo3);

        Factura factura = new Factura("STALIN", 001, listaArticulos);

        // Cambiar la fecha de emisión (opcional)
        // Date nuevaFechaEmision = new Date(); // Puedes establecer la fecha que desees
        // factura.setFechaEmision(nuevaFechaEmision);

        // Mostrar factura
        factura.mostrarFactura();
    }
}
