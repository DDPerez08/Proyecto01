package ar.com.educionit.vehiculos.pruebas;

import ar.com.educionit.vehiculos.entidades.Auto;
import ar.com.educionit.vehiculos.entidades.Comprador;
import ar.com.educionit.vehiculos.entidades.Vendedor;

/*import ar.com.educionit.base.entidades.Persona;
import ar.com.educionit.base.entidades.Vehiculo;
*/
public class Programa {

    public Programa(){}

    public static void main(String[] args)
    {
       /* Vehiculo oVehiculo = new Vehiculo(1,2,3);
        System.out.println("Valores del Vehículo ");
        System.out.println("Alto del Vehículo: "+oVehiculo.getAlto());
        System.out.println("Ancho del Vehículo: "+ oVehiculo.getAlto());
        System.out.println("Largo del Vehículo: "+ oVehiculo.getLargo());

        Persona oPersona = new Persona("Pedro", "Peña","33444555");
        System.out.println("Nombre: "+ oPersona.getNombre());
        System.out.println("Apellido: "+ oPersona.getApellido());
        System.out.println("Nº DNI: "+ oPersona.getNumeroDocumento());*/

       //cargo e imprimo auto
       System.out.println("Auto: ");
       Auto oAuto = new Auto("Renault","9 GLX","Gris",142,141,397);
       System.out.println("\n"+ oAuto);
       System.out.println("\n");

       //cargo e imprimo vendedor
        System.out.println("\n Vendedor: ");
        Vendedor oVendedor = new Vendedor("Fulano","Mente", "33.333.333",4);

        System.out.println("\n"+oVendedor);
        System.out.println("\n");

        //Comprador
        System.out.println("\n Comprador: ");
        Comprador oComprador = new Comprador("Mengano","Gomez","33.444.555", 35555.5);
        System.out.println("\n"+oComprador);
    }

}
