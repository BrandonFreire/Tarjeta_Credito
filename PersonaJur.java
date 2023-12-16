public class PersonaJur extends Cliente{
    private String ruc;
    
    //METODOS
    public PersonaJur(String nombre, String ruc, String direccion, String numTelefonico, String email){
        super(nombre,direccion,numTelefonico,email);
        this.ruc = ruc;
    }
}
