/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utleon.node.myspa.modelo;

/**
 *
 * @author Esau
 */
public class Horario
{
    private int idHorario;
    private String horaInicio;
    private String horaFin;

    public Horario()
    {
    }

    public int getIdHorario()
    {
        return idHorario;
    }

    public void setIdHorario(int idHorario)
    {
        this.idHorario = idHorario;
    }

    public String getHoraInicio()
    {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin()
    {
        return horaFin;
    }

    public void setHoraFin(String horaFin)
    {
        this.horaFin = horaFin;
    }
    
    
}
