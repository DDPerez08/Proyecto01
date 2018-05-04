package ar.com.educionit.vehiculos.entidades;

import ar.com.educionit.base.entidades.Vehiculo;



public class Auto extends Vehiculo {

    public Auto() {
        super();
    }

    public Auto(String marca, String modelo, String color, int ancho, int altura, int largo ){
        super (ancho, largo, altura); //modifico el constructor heredado de vehículo.
        setMarca(marca);
        setModelo(modelo);
        setColor(color);

    }

    // propiedades o atributos
    private String marca;
    private String modelo;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String toString(){return  marca+" "+modelo+" "+color+" | "+super.toString();}
    //super.toString, devolvera de la clase base

}
