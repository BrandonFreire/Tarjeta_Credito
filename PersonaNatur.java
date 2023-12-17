public class PersonaNatur extends Cliente {
    private String cedula;
    private String apellido;

    public PersonaNatur(String nombre, String apellido, String cedula, String direccion, String numTelefonico, String email) {
        super(nombre, direccion, numTelefonico, email);
        this.apellido = apellido;
        setCedula(cedula); 
    }

    // Getter y setter de cedula
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            System.out.println("No definido");
        } else if (cedula.matches("\\d{10}")) {
            this.cedula = cedula;
        } else {
            System.out.println("Cédula no válida.");
        }
    }

    // Getter y setter de apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            System.out.println("No definido");
        } else if (apellido.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜ\\s]+$")) {
            this.apellido = apellido;
        } else {
            System.out.println("Apellido no válido.");
        }
    }

    public void mostrarPersonaNatur() {
        System.out.println("Cédula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Número de Teléfono: " + getNumTelefonico());
        System.out.println("Correo Electrónico: " + getEmail());
    }

    public static void main(String[] args) {
        PersonaNatur persona = new PersonaNatur("Juan", "Pérez", "1234567890", "Calle 123", "0123456789", "juan@example.com");
        persona.mostrarPersonaNatur();
    }
}
