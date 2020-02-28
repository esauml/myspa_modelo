package edu.utleon.node.myspa.modelo;



public class Sucursal {

    private int idSucursal;
    private String nombre;
    private String domicilio;
    private double latitud;
    private double longitud;
    private int estatus;

    public Sucursal() {

    }

    public Sucursal(int idSucursal, String nombre, String domicilio, double latitud, double longitud, int estatus) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estatus = estatus;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString()
    {
        return "Sucursal{" + "idSucursal=" + idSucursal + ", nombre=" + nombre + ", domicilio=" + domicilio + ", latitud=" + latitud + ", longitud=" + longitud + ", estatus=" + estatus + '}';
    }
    
    

}
