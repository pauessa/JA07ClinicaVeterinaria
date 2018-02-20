/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja07clinicaveterinaria;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author pauessa
 */
public class Clinica {
    private String nombre;
    private ArrayList<Perro> perros;
    private Vector<Vacuna> vacunas;

    public Clinica() {
    }

    public Clinica(String nombre) {
        this.nombre = nombre;
        perros=new ArrayList<Perro>();
        vacunas=new Vector<Vacuna>(50);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Perro buscarPerro(String nombre){
        for (Perro perro : perros) {
            if(perro.getNombre().equals(nombre)){
                return perro;
            }
            
        }
        return null;
    }
    
    public void addPerro(Perro p){
        perros.add(p);
    }
    public void addVacuna(Vacuna v){
        vacunas.add(v);
    }
    public void mostrarVacunas(){
        for (int i = 0; i < vacunas.size(); i++) {
            System.out.println(vacunas.get(i));
            
        }
    }
    public Vacuna obtenerVacuna(int id){
         for (int i = 0; i < vacunas.size(); i++) {
            if(vacunas.get(i).getId()==id){
                return vacunas.get(i);
            }
            
        }
         return null;
    }
    
    
}
