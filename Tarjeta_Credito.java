import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.util.Calendar;

/**
 * diagrama caso de uso: (pasar al drawio) //Andree
 * 
 * diagrama de clases (drawio):
 * Cliente con Persona natural y Persona juridica //Matthew y  Sebastian 
 * Productos (lista de 5 productos)  //Ivonne 
 * Cajero (nombre, numerodecajero, supermaxi) //Freddy
 * Tarjeta de credito //Alexis 
 * Factura (mensaje:"Estoy facturando" + pasarle los datos del cliente para que los imprima + cajero + procutos + ) Leandro 
 * 
 * fecha de expiracion (controlar la fecha)
 * tipo de tarjeta (otro condicional para que reingrese los datos)
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
            if (banco.length()==9 && banco.toLowerCase().equals("pichincha")) {
                this.banco = banco;
                break;
            } else if(banco.isBlank()){
                System.out.println("Banco ingresado es incorrecto, por favor intente nuevamente:");
                banco = ingresoDat.nextLine();
                this.banco = banco;
            }else{
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
        tipoTC = tipoTC.toLowerCase();
        do {
            if (tipoTC.length()==4 && tipoTC.toLowerCase().equals("visa")) {
                this.tipoTC = tipoTC.toUpperCase();
                break;
            } else{ 
                System.out.println("El tipo de Tarjeta de Credito no es valido, solo se admiten VISA.");
                for (int i = 0; i < 50; i++) {
                    System.out.print(" ");
                    try {
                    Thread.sleep(100);} catch (InterruptedException ie) {
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
            if(nombreUsuario.isBlank()){
                this.nombreUsuario = "No definido";
            }else if (nombreUsuario.matches("[a-zA-Z]+"+" "+"[a-zA-Z]+")) {
                this.nombreUsuario = nombreUsuario;
                break;  
            } else {
                System.out.println("Error: El nombre debe contener solo letras.");
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

    // getter/stter de fecha de expedicion
    public String getFechaExpedicion() {
        return this.fechaExpedicion;
    }
    public void setFechaExpedicion(String fechaExpedicion) {
        Scanner ingresoDat = new Scanner(System.in);
        int enteroFecha = Integer.parseInt(fechaExpedicion);
        if (enteroFecha < 2010 || enteroFecha > 2023) {
            System.out.println(
                    "Ha ingresado incorrectamente el año de EXPEDICION de su tarjeta" + "\nIngrese nuevamente el año:");
            this.fechaExpedicion = ingresoDat.nextLine();
        } else {
            this.fechaExpedicion = fechaExpedicion;
        }
    }

    // getter/setter de fecha de expiracion
    public String getFechaExpiracion() {
        return this.fechaExpiracion.substring(3, 10);
    }

    /*public void setFechaExpiracion(String fechaExpiracion) {
        String mes, anio;
        Scanner ingreso = new Scanner(System.in);
            if (fechaExpiracion.matches("\\d{2}/\\d{4}")) {
                String[] fechaPartes = fechaExpiracion.split("/");
                if (fechaPartes.length == 2) {
                    int ingresoMes = Integer.parseInt(fechaPartes[0]);
                    int ingresoAnio = Integer.parseInt(fechaPartes[1]);
                    Calendar calendario = Calendar.getInstance();
                    int anioActual = calendario.get(Calendar.YEAR);
                    int mesActual = calendario.get(Calendar.MONTH) + 1;

                    if (ingresoAnio < anioActual) {
                        this.fechaExpiracion = "Su tarjeta ha expirado";
                    } else if (ingresoAnio == anioActual || ingresoMes < mesActual) {
                        this.fechaExpiracion = "Su tarjeta ha expirado";
                    } else {
                        this.fechaExpiracion = fechaExpiracion;
                        break;
                    }
                }
            } else{
                System.out.println("Error en la introduccion de la fecha de expiración."
                        + "\nIngrese nuevamente la fecha de expiracion");

                
            }
    }*/

    /*
     * else if ( fechaPartes.length==2 ) {
     * mes = fechaPartes[0];
     * anio = fechaPartes[1];
     * if (fechaPartes[1].equals("2023")) {
     * this.fechaExpiracion = "Su tarjeta ha expirado";
     * }else{
     * this.fechaExpiracion = fechaExpiracion;
     * }
     * }
     */

    // getter/setter de clave
    public String getClave() {
        return this.clave.replaceAll(".", "*");
    }

    public void setClave(String clave) {
        Scanner ingresarDat = new Scanner(System.in);
        if (clave.length() > 0 && clave.length() < 7) {
            /*
             * if (clave.equals("1234")) {
             * this.clave = clave;
             * }
             */
            this.clave = clave;
        } else {
            System.out.println("Ha excedido la cantidad maxima de caracteres para la clave" + "\nVuelva a ingresarla");
            this.clave = ingresarDat.nextLine();
        }
    }

    // getter/setter de CVV
    public String getCVV() {
        return this.CVV;
    }

    public void setCVV(String CVV) {
        Scanner ingresoDat = new Scanner(System.in);
        if (CVV.length() == 3) {
            this.CVV = CVV;
        } else {
            System.out.println("Codigo CVV incorrecto" + "\nVuelva a ingresarlo");
            this.CVV = ingresoDat.nextLine();
        }
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

        // ingresar la clave
        System.out.println("Ingrese su clave personal para la tarjeta");
        setClave(ingreso.nextLine());
        System.out.println(getClave());

        // ingresar fecha de expedicion
        System.out.println("Ingrese el año de expedicion de su tarjeta");
        setFechaExpedicion(ingreso.nextLine());
        System.out.println(getFechaExpedicion());

        // ingresar fecha de expiracion
        /*System.out.println("Ingrese la fecha de expiracion de su tarjeta en el siguiente formato (mm/aa)");
        setFechaExpiracion(ingreso.nextLine());
        System.out.println(getFechaExpiracion());*/

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
                .println("| " + getFechaExpedicion() + "                              " + /*getFechaExpiracion() + */"  |");
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
