
package concesionaria;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class Vehiculos implements IVehiculos{

    
    DecimalFormat formatter = new DecimalFormat("###,###.##");
    
    private ArrayList<Vehiculo> vehiculos ;
    
    public Vehiculos() {
        vehiculos = new ArrayList<>();
        Auto peugeot206  = new Auto("Peugeot", "206", 4, 200000.00); 
        Moto honda = new Moto("Honda", "Titan", 125, 60000.00);
        Auto peugeot208  = new Auto("Peugeot", "208", 5, 250000.00);
        Moto yamaha = new Moto("Yamaha", "YBR", 160, 80500.50);
        
        vehiculos.add(peugeot206);
        vehiculos.add(honda);
        vehiculos.add(peugeot208);
        vehiculos.add(yamaha);
    }
    
    @Override
    public Vehiculo buscarProductoMasCaro(){
        
        Vehiculo vehiculoCaro =  vehiculos.get(0);
        
       for (Vehiculo next : vehiculos) {
           if(next.compareTo(vehiculoCaro) > 0){
               vehiculoCaro = next;
           }
       }       
        return vehiculoCaro;
    }
    @Override
    public Vehiculo buscarProductoMasBarato(){
        
        Vehiculo vehiculoCaro =  vehiculos.get(0);
        
       for (Vehiculo next : vehiculos) {
           if(next.compareTo(vehiculoCaro) < 0){
               vehiculoCaro = next;
           }
       }       
        return vehiculoCaro;
    }
    
    @Override
    public Vehiculo modeloContieneLetra(char s){
        
        for (Vehiculo v : vehiculos) {
            char marca[] = v.getMarca().toCharArray();
            for(int i = 0; i < marca.length; i++){
                if(marca[i] == s)
                    return v;
            }
            
        }
        return null;
    }
    
    @Override
    public void OrdenarVehiculosPorPrecioMayorAMenor(){
        Comparator<Vehiculo> comparador = Collections.reverseOrder();
        Collections.sort(vehiculos, comparador); 
        MostrarVehiculosOrdenadosPorPrecioMayorAMenor();
    }    
    
    @Override
    public void MostrarVehiculos(){
        for (Iterator<Vehiculo> iterator = vehiculos.iterator(); iterator.hasNext();) {
            Vehiculo next = iterator.next();
            System.out.println(next.toString() +""+ formatter.format(next.getPrecio()));
            
        }
        
    }

    @Override
    public void MostrarVehiculosOrdenadosPorPrecioMayorAMenor() {
        for (Iterator<Vehiculo> iterator = vehiculos.iterator(); iterator.hasNext();) {
            Vehiculo next = iterator.next();
            System.out.println(next.getMarca() +" "+ next.getModelo());
            
        }
    }
}
