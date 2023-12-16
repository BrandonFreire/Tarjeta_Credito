public class Cliente {
    private String nombre;
    private String direccion;
    private String numTelefonico;
    private String email;

    public Cliente(String nombre, String direccion, String numTelefonico, String email){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numTelefonico = numTelefonico;
        this.email = email;
    }

    // getter/setter de nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        if (nombre.isBlank()){
            this.nombre = "No definido";
        }else{
            this.nombre = nombre;
        }
    }

    // getter/setter de direccion
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        
    }
}
