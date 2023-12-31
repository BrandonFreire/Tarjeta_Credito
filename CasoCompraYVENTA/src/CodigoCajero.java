public class CodigoCajero {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cajero
        Cajero cajero = new Cajero("STALIN", 1);
        // Llamar al método para mostrar la información
        cajero.mostrarInformacion();
    }

    public static class Cajero {
        String nombreUsuario;
        int numeroCajero;

        // Constructor de la clase Cajero
        public Cajero(String nombreUsuario, int numeroCajero) {
            this.nombreUsuario = nombreUsuario;
            this.numeroCajero = numeroCajero;
        }

        // Método para mostrar la información del usuario y del cajero
        public void mostrarInformacion() {
            System.out.println("NOMBRE DEL CAJERO: " + nombreUsuario);
            System.out.println("SE LE COBRO EN EL CAJERO: Nr." + numeroCajero +" SUPERMAXI");
        }
    }
}
