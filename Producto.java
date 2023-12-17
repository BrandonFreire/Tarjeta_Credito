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
            this.precioVenta = precioVenta;
        }
    
        public String getPrecioBeneficio() {
            return precioBeneficio;
        }
    
        public void setPrecioBeneficio(String precioBeneficio) {
            this.precioBeneficio = precioBeneficio;
        }
    
        public String getStock() {
            return stock;
        }
    
        public void setStock(String stock) {
            this.stock = stock;
        }
    
        public String getCodigo() {
            return codigo;
        }
    
        
    
        
        public Producto(){}
}
