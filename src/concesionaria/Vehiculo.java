
package concesionaria;


public abstract class Vehiculo implements Comparable<Vehiculo>{
    
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public int compareTo(Vehiculo v) {
       if (this.precio < v.getPrecio()) {  
            return -1;      
        }        
        else if (this.precio > v.getPrecio()) {
            return 1;     
        }
       else
        return 0; 
    }
    
}
