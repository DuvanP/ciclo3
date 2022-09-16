
package beans;


public class Alimentos {

    private int id;
    private String nombre;
    private String marca;
    private String animal;
    private double peso;
    private boolean premium;
    private double costo;
    private String edad;
    private int stock;

    

    public Alimentos(int id, String nombre, String marca, String animal, double peso, boolean premium, double costo, String edad, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.animal = animal;
        this.peso = peso;
        this.premium = premium;
        this.costo = costo;
        this.edad = edad;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    
    @Override
    public String toString() {
return "Alimentos{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", animal=" + animal + ", peso=" + peso + ", premium=" + premium + ", costo=" + costo + ", edad=" + edad +", stock=" + stock +'}';    }
    
    
    
}
