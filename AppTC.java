import java.util.Scanner;
public class AppTC {
    public static void main(String[] args) {
        Tarjeta_Credito tarjeta = new Tarjeta_Credito();
        Scanner ingreso = new Scanner(System.in);
        int opcion=0;
        System.out.println("\n Tarjeta de credito");
            do {
                System.out.println("\n1. Crear una tarjeta.");
                System.out.println("2. Mostrar tarjeta.");
                System.out.println("3. Crear cliente");  
                System.out.println("4. Mostrar cliente");
                System.out.println("5. Salir"); 
                System.out.print("Ingrese la opción: ");
                if (ingreso.hasNextInt()) {     
                opcion = ingreso.nextInt();           
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
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción fuera de rango." + "\nSeleccione nuevamente una opcion:");
                        break;
                }
                } else {
                    System.out.println("No has ingresado un número.");
                    ingreso.next();
                }        
            } while (opcion != 3);
        ingreso.close();
    }
}


        /*Tarjeta_Credito tarjetaCredito = new Tarjeta_Credito();
        Scanner sc = new Scanner(System.in);
        //Nombre usuario
        tarjetaCredito.setNombreUsuario("Ismael Freire");
        System.out.println(tarjetaCredito.getNombreUsuario());
        //Numero de tarjeta
        tarjetaCredito.setNumeroTarjeta("0123456789123478");
        System.out.println(tarjetaCredito.getNumeroTarjeta());
        //Fecha*/

