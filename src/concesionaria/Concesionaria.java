package concesionaria;

import java.text.DecimalFormat;



public class Concesionaria {
 
    public static void main(String[] args) {
        
        DecimalFormat formatter = new DecimalFormat("###,###.##");
        Vehiculos listaVehiculos = new Vehiculos();
        
        listaVehiculos.MostrarVehiculos();
        
        System.out.println("=============================");
        
        Vehiculo vehiculoMasCaro = listaVehiculos.buscarProductoMasCaro();
        System.out.println("Vehículo más caro: " + vehiculoMasCaro.getMarca()
                            + " " + vehiculoMasCaro.getModelo() );
        
        
        Vehiculo vehiculoMasBarato = listaVehiculos.buscarProductoMasBarato();
        System.out.println("Vehículo más caro: " + vehiculoMasBarato.getMarca()
                            + " " + vehiculoMasBarato.getModelo() );
        
        
        Vehiculo vehiculoConY = listaVehiculos.modeloContieneLetra('Y');
        if(vehiculoConY != null){
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+
                vehiculoConY.marca +" " + vehiculoConY.getModelo() + " $" + formatter.format(vehiculoConY.getPrecio()));
        }
        else
            System.out.println("Ningún vehículo conteine en el modelo la letra especifiacada");
        
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        listaVehiculos.OrdenarVehiculosPorPrecioMayorAMenor();
        
    }
}
