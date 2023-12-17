public class PersonaJur extends Cliente {
    private String ruc;

    // Constructor
    public PersonaJur(String nombre, String ruc, String direccion, String numTelefonico, String email) {
        super(nombre, direccion, numTelefonico, email);
        setRuc(ruc); 
    }

    // Getter y setter de RUC
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        if (ruc == null || ruc.trim().isEmpty()) {
            System.out.println("No definido");
        } else if (ruc.matches("\\d{10}001")) {
            this.ruc = ruc;
        } else {
            System.out.println("RUC no válido.");
        }
    }

    public void mostrarPersonaJur() {
        System.out.println("RUC: " + getRuc());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Número de Teléfono: " + getNumTelefonico());
        System.out.println("Correo Electrónico: " + getEmail());
    }

    // Método main de ejemplo
    public static void main(String[] args) {
        PersonaJur personaJuridica = new PersonaJur("Empresa", "1234567895001", "Avenida Principal", "0123456789", "empresa@ejemplo.com");
        personaJuridica.mostrarPersonaJur();
    }
}
