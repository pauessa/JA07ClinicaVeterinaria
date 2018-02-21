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
public class VacunaPerro {
    private Calendar fecha;
    private Vacuna vacuna;

    public VacunaPerro() {
    }

    public VacunaPerro(Calendar fecha, Vacuna vacuna) {
        this.fecha = fecha;
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "VacunaP{" + "fecha=" + fecha + ", vacuna=" + vacuna + '}';
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }
    
}
