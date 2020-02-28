/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esau
 */
public class Reservacion
{
    private int idReservacion;
    private String fechaHoraInicio;
    private String fechaHoraFin;
    private int estatus;
    private Cliente cliente;
    private Sala sala;

    public Reservacion()
    {
    }

    public int getIdReservacion()
    {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion)
    {
        this.idReservacion = idReservacion;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Sala getSala()
    {
        return sala;
    }

    public void setSala(Sala sala)
    {
        this.sala = sala;
    }

    public String getFechaHoraInicio()
    {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(String fechaHoraInicio)
    {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public String getFechaHoraFin()
    {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(String fechaHoraFin)
    {
        this.fechaHoraFin = fechaHoraFin;
    }
    
    
}
