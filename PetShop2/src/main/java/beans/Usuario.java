

package beans;

public class Usuario {
   private String username;
   private String nombre;
   private String apellidos;
   private String email;
   private double saldo ;
   private String telefono;
   private String contrasena;
   private String direccion;
   
   
   
   private boolean premium;

    public Usuario(String username, String nombre, String apellidos, String email, double saldo,String telefono,String contrasena,String direccion) {
        this.username = username;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.saldo = saldo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email  = email;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
        public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
        public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
        public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username +  ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", saldo=" + saldo + ", telefono=" + telefono + ", contrasena=" + contrasena + ", direccion=" + direccion + '}';
    }
   
   
           
}
