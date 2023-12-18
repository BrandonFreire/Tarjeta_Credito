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
        this.nombreBanco = nombreBanco;
    }
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }
    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
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
        this.cvv = cvv;
    }
    public String getPromociones() {
        return promociones;
    }
    public void setPromociones(String promociones) {
        this.promociones = promociones;
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
