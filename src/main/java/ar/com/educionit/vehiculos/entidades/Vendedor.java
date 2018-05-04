package ar.com.educionit.vehiculos.entidades;

import ar.com.educionit.base.entidades.Persona;

public class Vendedor extends Persona {

  //atributos
  private int cantAutosVendidos;

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public Vendedor (String nombre, String apellido, String DNI, int _cantAutosVendidos){
        setNombre(nombre);
        setApellido(apellido);
        setNumeroDocumento(DNI);
        setCantAutosVendidos(_cantAutosVendidos);
    }

    public String toStrins(){return super.toString()+ " "+ getCantAutosVendidos();}

}
