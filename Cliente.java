public class Cliente {
    private String nombre;
    private String direccion;
    private String numTelefonico;
    private String email;

    public Cliente(String nombre, String direccion, String numTelefonico, String email) {
        setNombre(nombre);
        setDireccion(direccion);
        setNumTelefonico(numTelefonico);
        setEmail(email);
    }

    // Getter y setter de nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "No definido";
        } else if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜ\\s]+$")) {
            // Verificar que el nombre solo contenga letras y espacios
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido, debe contener solo letras y espacios.");
        }
    }

    // Getter y setter de direccion
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            this.direccion = "No definida";
        } else {
            this.direccion = direccion;
        }
    }

    // Getter y setter de numTelefonico
    public String getNumTelefonico() {
        return this.numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        if (numTelefonico == null || numTelefonico.trim().isEmpty()) {
            this.numTelefonico = "No definido";
        } else if (numTelefonico.matches("^0\\d{9}$")) {
            // Verificar que el número de teléfono tenga 10 dígitos y empiece con 0
            this.numTelefonico = numTelefonico;
        } else {
            System.out.println("Número de teléfono no válido, debe tener 10 dígitos y empezar con 0.");
        }
    }

    // Getter y setter de email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            this.email = "No definido";
        } else if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            // Verificar que el email tenga el formato adecuado con el símbolo "@"
            this.email = email;
        } else {
            System.out.println("Correo electrónico no válido, debe tener un formato válido.");
        }
    }

    
    public void mostrarCliente() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Número Telefónico: " + getNumTelefonico());
        System.out.println("Email: " + getEmail());
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan Peréz", "Calle 123", "0123456789", "juan@example.com");

        cliente.mostrarCliente();
    }
}

