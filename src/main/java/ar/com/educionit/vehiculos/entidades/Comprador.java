package ar.com.educionit.vehiculos.entidades;

import ar.com.educionit.base.entidades.Persona;

public class Comprador extends Persona {

    public Comprador() {

    }

    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public  Comprador( String nombre, String apellido, String DNI, double presupuesto ){
       super(nombre,apellido,DNI); //modifico el constructor heredado de vehículo.
        setNombre(nombre);
        setApellido(apellido);
        setNumeroDocumento(DNI);
        setPresupuesto(presupuesto);
    }

    public String toString(){ return  super.toString() + "Presupuesto: "+ getPresupuesto() ;  }
}
