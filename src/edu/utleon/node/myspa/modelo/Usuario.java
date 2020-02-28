package edu.utleon.node.myspa.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author marco
 */
public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private String rol;
    private String token;

    public Usuario()
    {
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasenia, String rol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken() {
        String usuario = this.nombreUsuario;
        String password = this.contrasenia;
        String key = new Date().toString();

        String token = (DigestUtils.sha256Hex(usuario + ";" + password + ";" + key));
        
        this.token = token;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString()
    {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", rol=" + rol + ", token=" + token + '}';
    }

    
}
