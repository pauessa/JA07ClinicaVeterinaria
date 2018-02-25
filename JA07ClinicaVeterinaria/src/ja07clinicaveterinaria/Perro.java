/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07clinicaveterinaria;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author pauessa
 */
public class Perro {
    private String nombre;
    private String raza;
    private Calendar fechaProx;
    private ArrayList<VacunaPerro> vacunap;

    public Perro() {
    }

    public Perro(String nombre, String raza, Calendar fechaProx) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaProx = fechaProx;
        vacunap=new ArrayList<VacunaPerro>();
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", fechaProx=" + fechaProx.getTime() + ", vacunap=" + vacunap + '}';
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
    public void addVacuna(VacunaPerro vp){
        vacunap.add(vp);
    }
    
    public boolean buscarVacunaPerro(VacunaPerro vp){
        
        for (VacunaPerro vacunaPerro : vacunap) {
            
            if((vp.getFecha().equals(vacunaPerro.getFecha())) && (vp.getVacuna().equals(vacunaPerro.getVacuna()))){
              
                return false;
            } 
        }
       
        return true;
        
        
    }
    public void mostrarVacunaPerro(){
        for (VacunaPerro vacunaPerro : vacunap) {
            System.out.println(vacunaPerro);
        }
    }
    
    public void ajustarFecha(){
        Calendar fechamax=Calendar.getInstance();
        fechamax.set(1000, 1,1);
        for (VacunaPerro vacunaPerro : vacunap) {
            if (vacunaPerro.getFecha().after(fechamax)) {
                fechamax=vacunaPerro.getFecha();
            }
        }
        fechamax.add(Calendar.YEAR, 1);
        setFechaProx(fechamax);
            
        }
    public Perro mostrarVacunaConcreta(Vacuna v){
      
        for (VacunaPerro vacunaPerro : vacunap) {
            if(vacunaPerro.getVacuna().equals(v)){
              return this;
            }
            
        }
        return null;
    }
    
}
