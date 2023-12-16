public class PersonaNatur extends Cliente{
    private String cedula;
    private String apellido;

    //METODOS
    public PersonaNatur(String nombre, String apellido, String cedula, String direccion, String numTelefonico, String email){
        super(nombre, direccion, numTelefonico, email);
        this.apellido = apellido;
        this.cedula = cedula;
    }
    // getter/setter

}
