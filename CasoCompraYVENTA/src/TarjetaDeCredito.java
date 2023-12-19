import java.time.LocalDate;

public class TarjetaDeCredito {
    
    private String nombreBanco;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private LocalDate fechaInicio;
    private LocalDate fechaExpedicion;
    private String nombreUsuario;
    private String clave;
    private double monto;
    private String bandaDeSeguridad;
    private String cvv;
    private String promociones;

    //Constructor vacio 
    public TarjetaDeCredito() {
    }

    //Constructor con parametros
    public TarjetaDeCredito(String nombreBanco, String tipoTarjeta, String numeroTarjeta, LocalDate fechaInicio, LocalDate fechaExpedicion, String clave, double monto){}

    // getters y setters
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        if (nombreBanco == " BANCO PICHINCHA") {
            this.nombreBanco = nombreBanco;
        }
        else{
            System.out.println("\nERROR:" +nombreBanco+ " no es el banco asociado a esta tarjeta, o se a ingresado de manera incorrecta\n");
            System.exit(0);
        }
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }
    public void setTipoTarjeta(String tipoTarjeta) {
        if (tipoTarjeta == "VISA") {
            this.tipoTarjeta = tipoTarjeta;
        }
        else{
            System.out.println("\nERROR:" +tipoTarjeta + " no es el tipo de esta tarjeta, o se a ingresado de manera incorrecta\n");
            System.exit(0);
        }
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        if (numeroTarjeta == "9078 5065 2849 1368") {
            this.numeroTarjeta = numeroTarjeta;
        }
        else{
            System.out.println("\nERROR: El numero " +numeroTarjeta+ " no esta asociado a ninguna tarjeta, o se a ingresado de manera incorrecta\n");
            System.exit(0);
        }
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
       if (fechaInicio.isEqual(LocalDate.of(2023, 01, 10))) {
            this.fechaInicio = fechaInicio;
        }
        else{
            System.out.println("\nERROR: Ninguna tarjeta fue emitida el: " +fechaInicio+ ", o se a ingresado la fecha de manera incorrecta\n");
            System.exit(0);
        }
    }
    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }
    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        if (fechaExpedicion.isEqual(LocalDate.of(2030, 01, 10))) {
            this.fechaExpedicion = fechaExpedicion;
        }
        else{
            System.out.println("\nERROR: Ninguna tarjeta vence el: " +fechaExpedicion+ ", o se a ingresado la fecha de manera incorrecta\n");
            System.exit(0);
        }
        
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == "ALEXIS BAUTISTA") {
            this.nombreUsuario = nombreUsuario;
        }
        else{
            System.out.println("\nERROR: La persona " +nombreUsuario+ " no tiene una tarjeta, o se a ingresado el nombre de manera incorrecta\n");
            System.exit(0);
        }
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        if ("1234".equals(clave))
                this.clave = clave;
        else{
            if (clave.length() != 4) {
                System.out.println("\nERROR: La clave debe tener 4 numeros");
            }
            System.out.println("ERROR: La clave " +clave+ " es incorrecta\n");
            System.exit(0);
            
        }
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        if (monto == 23.98) {
            this.monto = monto;
        }
        else{
            System.out.println("\nERROR: El monto no coincide con el de la tarjeta\n");
            System.exit(0);
        }
    }    
    public String getBandaDeSeguridad() {
        return bandaDeSeguridad;
    }
    public void setBandaDeSeguridad(String bandaDeSeguridad) {
        this.bandaDeSeguridad = bandaDeSeguridad;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        if ("558".equals(cvv)) {
            this.cvv = cvv;
        }
        else{
            if (cvv.length() != 3) {
                System.out.println("\nERROR: El CVV debe tener 3 numeros");
            }
            System.out.println("\nERROR: EL CVV no coincide con el CVV de la tarjeta\n");
            System.exit(0);
        }
    }
    public String getPromociones() {
        return promociones;
    }
    public void setPromociones(String promociones) {
        if (promociones == "SANA SANA     MULTICINES     PRIMAX") {
            this.promociones = promociones;
        }
        else{
            System.out.println("\nERROR:" +promociones + " no son promociones de esta tarjeta, o se han ingresado de manera incorrecta\n");
            System.exit(0);
        }
    }

    public static void TarjetaCredito() {
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito();
        tarjetaDeCredito.setNombreBanco(" BANCO PICHINCHA");
        tarjetaDeCredito.setTipoTarjeta("VISA");
        tarjetaDeCredito.setNumeroTarjeta("9078 5065 2849 1368");
        tarjetaDeCredito.setFechaInicio(LocalDate.of(2023, 01, 10));
        tarjetaDeCredito.setFechaExpedicion(LocalDate.of(2030, 01, 10));
        tarjetaDeCredito.setNombreUsuario("ALEXIS BAUTISTA");
        tarjetaDeCredito.setClave("1234");
        tarjetaDeCredito.setMonto(23.98);
        tarjetaDeCredito.setBandaDeSeguridad("//////////////////////////////////");
        tarjetaDeCredito.setCvv("558");
        tarjetaDeCredito.setPromociones("SANA SANA     MULTICINES     PRIMAX");

        System.out.println("\nPARTE DELANTERA");
        System.out.println("--------------------------------------");
        System.out.print("|" + tarjetaDeCredito.getNombreBanco());
        System.out.println("                " + tarjetaDeCredito.getTipoTarjeta() +" |");
        System.out.println("|                                     |\n|                                     |\n|                                     |\n|                                     |\n|                                     |");
        System.out.println("|" +tarjetaDeCredito.getNumeroTarjeta()+"                  |");
        System.out.println("|" +tarjetaDeCredito.getFechaInicio()+"                           |");
        System.out.println("|VALIDO HASTA " +tarjetaDeCredito.getFechaExpedicion()+"              |");
        System.out.println("|" +tarjetaDeCredito.getNombreUsuario()+"                      |");
        System.out.println("--------------------------------------");
        System.out.println("\nPARTE TRASERA");
        System.out.println("--------------------------------------");
         System.out.println("|                                     |\n|                                     |\n|                                     |");
        System.out.print("|" +tarjetaDeCredito.getBandaDeSeguridad());
        System.out.println("" +tarjetaDeCredito.getCvv()+"|");
        System.out.println("|                                     |\n|                                     |\n|                                     |");
        System.out.println("|" +tarjetaDeCredito.getPromociones()+"  |");
        System.out.println("|                                     |\n|                                     |");
        System.out.println("--------------------------------------");
        System.out.println("\n LA TARJETA TIENE DE:");
        System.out.println("Clave:"+ tarjetaDeCredito.getClave());
        System.out.println("Monto" + tarjetaDeCredito.getMonto());
    }    

}
