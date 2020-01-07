
package concesionaria;


public interface IVehiculos {

    
    public Vehiculo buscarProductoMasCaro();
    public Vehiculo buscarProductoMasBarato();
    public Vehiculo modeloContieneLetra(char s);
    public void OrdenarVehiculosPorPrecioMayorAMenor();
    public void MostrarVehiculos();
    public void MostrarVehiculosOrdenadosPorPrecioMayorAMenor();
    
    
}
