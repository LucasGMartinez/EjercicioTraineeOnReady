
package concesionaria;


public class Moto extends Vehiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas, double precio) {
        super(marca,modelo,precio);
        this.cilindradas = cilindradas;
    }     

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindradas: " + cilindradas+ "c // Precio: $" ;
    }
}
