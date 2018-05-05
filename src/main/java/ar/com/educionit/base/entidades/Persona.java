package ar.com.educionit.base.entidades;

public abstract class Persona {

    public Persona() {

    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private String  numeroDocumento;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }



    public Persona (String nombre, String apellido, String numeroDocumento)
    {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNumeroDocumento(numeroDocumento);

    }


}
