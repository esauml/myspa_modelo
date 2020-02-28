/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Esau
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private String numeroEmpleado;
    private String puesto;
    private int estatus;
    private String foto;
    private String rutaFOto;
    private Usuario usuario;

    @Override
    public String toString()
    {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", numeroEmpleado=" + numeroEmpleado + ", puesto=" + puesto + ", estatus=" + estatus + ", foto=" + foto + ", rutaFOto=" + rutaFOto + ", usuario=" + usuario + '}';
    }

    public Empleado() {
        // inicializa objeto
        usuario = new Usuario(); // defecto campos vacíos
    }

    public Empleado(int idPersona,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String genero,
            String domicilio,
            String telefono,
            String rfc) {
        super(idPersona,
                nombre,
                apellidoPaterno,
                apellidoMaterno,
                genero,
                domicilio,
                telefono,
                rfc);
    }

    public Empleado(int idEmpleado,
            String numeroEmpleado,
            String puesto,
            int estatus,
            String foto,
            String rutaFOto,
            Usuario usuario,
            int idPersona,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String genero,
            String domicilio,
            String telefono,
            String rfc) {
        super(idPersona,
                nombre,
                apellidoPaterno,
                apellidoMaterno,
                genero,
                domicilio,
                telefono,
                rfc);
        this.idEmpleado = idEmpleado;
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.estatus = estatus;
        this.foto = foto;
        this.rutaFOto = rutaFOto;
        this.usuario = usuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRutaFOto() {
        return rutaFOto;
    }

    public void setRutaFOto(String rutaFOto) {
        this.rutaFOto = rutaFOto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
