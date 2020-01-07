
package concesionaria;

import java.text.DecimalFormat;


public class Auto extends Vehiculo {

    private int puertas;
    
    DecimalFormat formateador = new DecimalFormat("###,###.##");

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca,modelo,precio);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas+ " // Precio: $" ;
    }
}
