import java.util.Scanner;

public class AppTC {
    public static void main(String[] args) {
        TarjetaDeCredito.TarjetaCredito(); // Llamar tarjeta de credito
        Tarjeta_Credito tarjeta = new Tarjeta_Credito();
        Scanner ingreso = new Scanner(System.in);
        int opcion = 0;
        String opciontxt="";
        System.out.println("\n Tarjeta de credito");


        do {
            System.out.println("\n1. Crear una tarjeta.");
            System.out.println("2. Mostrar tarjeta.");
            System.out.println("3. Crear cliente");
            System.out.println("4. Mostrar cliente");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");
            opciontxt = ingreso.nextLine();
            if (opciontxt.matches("[1-9]")) {
                opcion = Integer.parseInt(opciontxt);
                switch (opcion) {
                    case 1:
                        System.out.println("Seleccionaste crear una tarjeta.");
                        tarjeta.crearTC();
                        break;
                    case 2:
                        System.out.println("Seleccionaste mostrar tarjeta.");
                        tarjeta.mostrarTC();
                        break;
                    case 3:
                        System.out.println("Seleccionaste crear cliente");
                        break;
                    case 4:
                        System.out.println("Seleccionaste crear cliente");
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción fuera de rango.");
                        break;
                }
            } else if (opciontxt.isEmpty() || !opciontxt.matches("[1-9]")) {
                System.out.println("No has ingresado nada o has ingresado caracteres");
            }
        } while (opciontxt.matches(".*[^0-9].*") || opciontxt.matches("[1-9]+") || opciontxt.isEmpty());
        ingreso.close();
    }
}
