/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07clinicaveterinaria;

import java.util.Calendar;

/**
 *
 * @author pauessa
 */
public class Perro {
    private String nombre;
    private String raza;
    private Calendar fechaProx;

    public Perro() {
    }

    public Perro(String nombre, String raza, Calendar fechaProx) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaProx = fechaProx;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Calendar getFechaProx() {
        return fechaProx;
    }

    public void setFechaProx(Calendar fechaProx) {
        this.fechaProx = fechaProx;
    }
    
}
