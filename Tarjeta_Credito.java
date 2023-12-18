import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * diagrama caso de uso: (pasar al drawio) //Andree
 * 
 * diagrama de clases (drawio):
 * Cliente con Persona natural y Persona juridica //Matthew y Sebastian
 * Productos (lista de 5 productos) //Ivonne
 * Cajero (nombre, numerodecajero, supermaxi) //Freddy
 * Tarjeta de credito //Alexis
 * Factura (mensaje:"Estoy facturando" + pasarle los datos del cliente para que
 * los imprima + cajero + procutos + ) Leandro
 * 
 * fecha de expiracion (controlar la fecha) //Ismael
 * tipo de tarjeta (otro condicional para que reingrese los datos) --> Ismael
 * (corregido)
 * fecha de expedicion --> Ismael (corregido)
 * corregir los espacios TC //Andree
 */
public class Tarjeta_Credito {
    // Atributos de la clase tarjeta credito.
    private String nombreUsuario;
    private String numeroTarjeta;
    private String fechaExpedicion;
    private String fechaExpiracion;
    private String banco;
    private String tipoTC;
    private String CVV;
    private String clave;

    // METODOS

    // getter/setter de banco
    public String getBanco() {
        return this.banco.toUpperCase();
    }

    public void setBanco(String banco) {
        Scanner ingresoDat = new Scanner(System.in);
        do {
            if (banco.length() == 9 && banco.toLowerCase().equals("pichincha")) {
                this.banco = banco;
                break;
            } else if (banco.isBlank()) {
                System.out.println("Banco ingresado es incorrecto, por favor intente nuevamente:");
                banco = ingresoDat.nextLine();
                this.banco = banco;
            } else {
                System.out.println("Banco ingresado es incorrecto, por favor intente nuevamente:");
                banco = ingresoDat.nextLine();
                this.banco = banco;
            }
        } while (true);

    }

    // getter/setter de TIPO de tarjeta de credito
    public String getTipoTC() {
        return this.tipoTC;
    }

    public void setTipoTc(String tipoTC) {
        // tipoTC = tipoTC.toLowerCase();
        Scanner ingreso = new Scanner(System.in);
        do {
            if (tipoTC.length() == 4 && tipoTC.toLowerCase().equals("visa")) {
                this.tipoTC = tipoTC.toUpperCase();
                break;
            } else if (tipoTC.isEmpty() || !tipoTC.matches("[a-zA-Z]+")) {
                System.out.println("Error: Ha ingresado numeros o ha ingresado un espacio vacio.");
                System.out.println("Ingrese nuevamente el tipo de tarjeta:");
                tipoTC = ingreso.nextLine();
                this.tipoTC = tipoTC;
            } else {
                System.out.println("El tipo de Tarjeta de Credito no es valido, solo se admiten VISA.");
                for (int i = 0; i < 50; i++) {
                    System.out.print(" ");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) {
                    }
                }
                System.out.println("Lo sentimos...");
                System.exit(0);
            }
        } while (true);
    }

    // getter/setter de NombreUsuario
    public String getNombreUsuario() {
        return this.nombreUsuario.toUpperCase();
    }

    public void setNombreUsuario(String nombreUsuario) {
        Scanner ingreso = new Scanner(System.in);
        do {
            /*
             * if(){
             * this.nombreUsuario = "No definido";
             * }else
             */if (nombreUsuario.matches("[a-zA-Z]+" + " " + "[a-zA-Z]+")) {
                this.nombreUsuario = nombreUsuario;
                break;
            } else if (nombreUsuario.isEmpty() || !nombreUsuario.matches("[a-zA-Z]+" + " " + "[a-zA-Z]+")) {
                System.out.println("Error: El nombre debe contener solo letras o ha ingresado un espacio vacío.");
                System.out.println("Ingrese nuevamente el nombre:");
                nombreUsuario = ingreso.nextLine();
                this.nombreUsuario = nombreUsuario;
            }
        } while (true);
    }

    // getter/setter de numero de tarjeta
    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        Scanner ingresoDat = new Scanner(System.in);
        do {
            if (numeroTarjeta.length() == 16) {
                String part1 = numeroTarjeta.substring(0, 4);
                String part2 = numeroTarjeta.substring(4, 8);
                String part3 = numeroTarjeta.substring(8, 12);
                String part4 = numeroTarjeta.substring(12, 16);
                this.numeroTarjeta = (part1 + "-" + part2 + "-" + part3 + "-" + part4);
                break;
            } else {
                System.out.println("Numero de tarjeta incorrecto" + "\nIngrese nuevamente el numero de tarjeta");
                numeroTarjeta = ingresoDat.nextLine();
                this.numeroTarjeta = numeroTarjeta;
            }
        } while (true);

    }

    // getter/setter de fecha de expedicion
    public String getFechaExpedicion() {
        return this.fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        Scanner ingresoDat = new Scanner(System.in);
        do {
            try {
                LocalDate fecha = LocalDate.parse(fechaExpedicion + "-01-01");

                // Verificar si el año está en el rango de 2010 a 2023
                if (fecha.getYear() >= 2010 && fecha.getYear() <= 2023) {
                    this.fechaExpedicion = fechaExpedicion;
                    break;
                } else if ((fechaExpedicion.isEmpty()) || (!fechaExpedicion.matches("[a-zA-Z]+"))
                        || (fechaExpedicion.length() != 4)) {
                    System.out.println("Ha ingresado incorrectamente el año de EXPEDICION de su tarjeta" +
                            "\nIngrese nuevamente el año:");
                    fechaExpedicion = ingresoDat.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Error al parsear la fecha. Ingrese nuevamente el año:");
                fechaExpedicion = ingresoDat.nextLine();
            }
        } while (true);
    }
    /*
     * do {
     * if (enteroFecha > 2010 && enteroFecha < 2023) {
     * this.fechaExpedicion = fechaExpedicion;
     * break;
     * } else {
     * System.out.
     * println("Ha ingresado incorrectamente el año de EXPEDICION de su tarjeta" +
     * "\nIngrese nuevamente el año:");
     * this.fechaExpedicion = ingresoDat.nextLine();
     * this.fechaExpedicion = fechaExpedicion;
     * }
     * } while (true);
     * }
     */

    // getter/setter de fecha de expiracion
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        Scanner ingreso = new Scanner(System.in);

        do {
            if (fechaExpiracion.matches("\\d{2}/\\d{4}")) {
                String[] fechaPartes = fechaExpiracion.split("/");
                if (fechaPartes.length == 2) {
                    int ingresoMes = Integer.parseInt(fechaPartes[0]);
                    int ingresoAnio = Integer.parseInt(fechaPartes[1]);

                    LocalDate fechaActual = LocalDate.now();
                    int anioActual = fechaActual.getYear();
                    int mesActual = fechaActual.getMonthValue();

                    if (ingresoAnio < anioActual || (ingresoMes < mesActual && ingresoAnio == anioActual)) {
                        //this.fechaExpiracion = "Su tarjeta ha expirado";
                        System.out.println("¡Su tarjeta ha expirado!");
                        for (int i = 0; i < 50; i++) {
                            System.out.print(" ");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ie) {
                            }
                        }
                        System.out.println("Lo sentimos...");
                        System.exit(0);
                    } else {
                        this.fechaExpiracion = fechaExpiracion;
                        break;
                    }
                }
            } else {
                System.out.println("Error en la introducción de la fecha de expiración."
                        + "\nIngrese nuevamente la fecha de expiración");
                fechaExpiracion = ingreso.nextLine();
                this.fechaExpiracion = fechaExpiracion;
            }
        } while (true);
    }

    /*
     * public void setFechaExpiracion(String fechaExpiracion) {
     * String mes, anio;
     * Scanner ingreso = new Scanner(System.in);
     * do {
     * if (fechaExpiracion.matches("\\d{2}/\\d{4}")) {
     * String[] fechaPartes = fechaExpiracion.split("/");
     * if (fechaPartes.length == 2) {
     * int ingresoMes = Integer.parseInt(fechaPartes[0]);
     * int ingresoAnio = Integer.parseInt(fechaPartes[1]);
     * Calendar calendario = Calendar.getInstance();
     * int anioActual = calendario.get(Calendar.YEAR);
     * int mesActual = calendario.get(Calendar.MONTH) + 1;
     * if (ingresoAnio < anioActual) {
     * fechaExpiracion = "Su tarjeta ha expirado";
     * this.fechaExpiracion=fechaExpiracion;
     * } else if ((ingresoMes < mesActual) && (ingresoAnio == anioActual)) {
     * fechaExpiracion = "Su tarjeta ha expirado";
     * this.fechaExpiracion=fechaExpiracion;
     * } else {
     * this.fechaExpiracion = fechaExpiracion;
     * break;
     * }
     * }
     * } else {
     * System.out.println("Error en la introduccion de la fecha de expiración."
     * + "\nIngrese nuevamente la fecha de expiracion");
     * fechaExpiracion = ingreso.nextLine();
     * this.fechaExpiracion = fechaExpiracion;
     * }
     * } while (true);
     * }
     */

    // getter/setter de clave
    public String getClave() {
        return this.clave.replaceAll(".", "*");
    }

    public void setClave(String clave) {
        Scanner ingresarDat = new Scanner(System.in);
        do {

            if ((esCadenaNumerica(clave)) && (clave.length() == 6)) {
                this.clave = clave;
                break;
            } else if ((clave.isEmpty()) || (clave.length() != 6) || (!esCadenaNumerica(clave))) {
                System.out.println(
                        "Ha excedido los caracteres, ha ingresado menos de los requeridos (max:6) o ha ingresado letras en lugar de numeros"
                                + "\nVuelva a ingresarla");
                clave = ingresarDat.nextLine();
                this.clave = clave;
            }
        } while (true);
    }

    /**
     * Funcion que comprueba que todos lo ingresado por consola sea numerico
     * 
     * @param cadena
     * @return
     */
    private static boolean esCadenaNumerica(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        return true;
    }

    // getter/setter de CVV
    public String getCVV() {
        return this.CVV;
    }

    public void setCVV(String CVV) {
        Scanner ingresoDat = new Scanner(System.in);
        do {
            if ((esCadenaNumerica(CVV)) && (CVV.length() == 3)) {
                this.CVV = CVV;
                break;
            } else if ((CVV.isEmpty()) || (CVV.length() != 3) || (!esCadenaNumerica(CVV))) {
                System.out.println("Codigo CVV incorrecto" + "\nVuelva a ingresarlo");
                CVV = ingresoDat.nextLine();
                this.CVV = CVV;
            }
        } while (true);

    }

    public void crearTC() {
        Scanner ingreso = new Scanner(System.in);

        // ingresar banco
        System.out.println("Ingrese el nombre de su banco");
        setBanco(ingreso.nextLine());
        System.out.println(getBanco());

        // ingresar tipo de tarjeta
        System.out.println("Ingrese el tipo de tarjeta");
        setTipoTc(ingreso.nextLine());
        System.out.println(getTipoTC());

        // ingresar nombre
        System.out.println("Ingrese el nombre del titular de la tarjeta");
        setNombreUsuario(ingreso.nextLine());
        System.out.println(getNombreUsuario());

        // ingresar numero de tarjeta
        System.out.println("Ingrese el numero de su tarjeta");
        setNumeroTarjeta(ingreso.nextLine());
        System.out.println(getNumeroTarjeta());

        // ingresar fecha de expedicion
        System.out.println("Ingrese el año de expedicion de su tarjeta");
        setFechaExpedicion(ingreso.nextLine());
        System.out.println(getFechaExpedicion());

        // ingresar la clave
        System.out.println("Ingrese su clave personal para la tarjeta");
        setClave(ingreso.nextLine());
        System.out.println(getClave());

        // ingresar fecha de expiracion
        System.out.println("Ingrese la fecha de expiracion de su tarjeta en el siguiente formato (mm/aa)");
        setFechaExpiracion(ingreso.nextLine());
        System.out.println(getFechaExpiracion());

        // ingreso codigo CVV
        System.out.println("Ingrese el codigo cvv de la tarjeta:");
        setCVV(ingreso.nextLine());
        System.out.println(getCVV());

        System.out.println("\nCreando TarjetaCredito...");
        for (int i = 0; i < 50; i++) {
            System.out.print(" ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println("¡La Tarjeta de Credito fue creada con exito!");
    }

    public void mostrarTC() {
        System.out.println("frente");
        System.out.println("----------------------------------------------");
        System.out.println("| " + getBanco() + "                            " + getTipoTC() + "  |");
        System.out.println("|                                            |");
        System.out.println("| " + getNombreUsuario() + "                              |");
        System.out
                .println("| " + getFechaExpedicion() + "                              "
                        + getFechaExpiracion() + "  |");
        System.out.println("|                                            |");
        System.out.println("|             " + getNumeroTarjeta() + "            |");
        System.out.println("----------------------------------------------");
        System.out.println("\nreverso");
        System.out.println("----------------------------------------------");
        System.out.println("|                                            |");
        System.out.println("|////////////////////////////////////////////|");
        System.out.println("|  *                                         |");
        System.out.println("|  * *                                       |");
        System.out.println("|  * * *                               " + getCVV() + "   |");
        System.out.println("|        SanaSana             Multicines     |");
        System.out.println("----------------------------------------------");
    }
}
