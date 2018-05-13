/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;

/**
 *
 * @author Marcelo
 */
public class Administrativo  extends Persona{
    protected String Cargo;
    protected String LugarTrabajo;
    protected Calendar FechaIngreso; 

    public Administrativo(String Cargo, String LugarTrabajo, Calendar FechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = Cargo;
        this.LugarTrabajo = LugarTrabajo;
        this.FechaIngreso = FechaIngreso;
    }

    public Administrativo(String Cargo, String LugarTrabajo, Calendar FechaIngreso) {
        super();
        this.Cargo = Cargo;
        this.LugarTrabajo = LugarTrabajo;
        this.FechaIngreso = FechaIngreso;
    }

    public String getCargo() {
        return Cargo;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }

    public void setFechaIngreso(Calendar FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.Cargo 
                + ", LugarTrabajo=" + this.LugarTrabajo 
                + ", FechaIngreso=" + this.FechaIngreso + '}';
    }
 
    
    
    
    
    
}
