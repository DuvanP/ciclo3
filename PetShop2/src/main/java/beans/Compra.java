
package beans;

import java.sql.Date;


public class Compra {
   
    private int id;
    private String username;
    private int cantidad;
    private double costo_domicilio;
    private String direccion;

    public Compra(int id, String username, int cantidad, double costo_domicilio, String direccion) {
        this.id = id;
        this.username = username;
        this.cantidad = cantidad;
        this.costo_domicilio = costo_domicilio;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto_domicilio() {
        return costo_domicilio;
    }

    public void setCosto_domicilio(double costo_domicilio) {
        this.costo_domicilio = costo_domicilio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", username=" + username + ", cantidad=" + cantidad + ", costo_domicilio=" + costo_domicilio + ", direccion=" + direccion + '}';    
    
    }
    
    
}
