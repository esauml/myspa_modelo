/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utleon.node.myspa.modelo;

import java.util.List;

/**
 *
 * @author Esau
 */
public class Servicio
{
    private int idServicio;
    private String fecha;
    private Reservacion reservacion;
    private Empleado empleado;
    private List<Tratamiento> tratamientos;

    @Override
    public String toString()
    {
        return "Servicio{" + "idServicio=" + idServicio + ", fecha=" + fecha + ", reservacion=" + reservacion + ", empleado=" + empleado + ", tratamientos=" + tratamientos + '}';
    }

    public Servicio()
    {
    }

    public int getIdServicio()
    {
        return idServicio;
    }

    public void setIdServicio(int idServicio)
    {
        this.idServicio = idServicio;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public Reservacion getReservacion()
    {
        return reservacion;
    }

    public void setReservacion(
            Reservacion reservacion)
    {
        this.reservacion = reservacion;
    }

    public Empleado getEmpleado()
    {
        return empleado;
    }

    public void setEmpleado(Empleado empleado)
    {
        this.empleado = empleado;
    }

    public List<Tratamiento> getTratamientos()
    {
        return tratamientos;
    }

    public void setTratamientos(
            List<Tratamiento> tratamientos)
    {
        this.tratamientos = tratamientos;
    }
    
}
