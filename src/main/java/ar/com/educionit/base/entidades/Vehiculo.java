package ar.com.educionit.base.entidades;

public abstract class Vehiculo {

    private int alto;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    private int ancho;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    private int largo;

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Vehiculo(){}

    public  Vehiculo(int alto, int ancho, int largo)
    {
        this.setAlto(alto);
        this.setAncho(ancho);
        this.setLargo(largo);
    }


}
