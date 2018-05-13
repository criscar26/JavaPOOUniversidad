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
public class Docente extends Persona {
    protected int anioexp;
    protected String Asignaturas[];
    protected String Titulo;

    public Docente(int anioexp, String[] Asignaturas, String Titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.anioexp = anioexp;
        this.Asignaturas = Asignaturas;
        this.Titulo = Titulo;
    }

    public Docente(int anioexp, String[] Asignaturas, String Titulo) {
        super();
        this.anioexp = anioexp;
        this.Asignaturas = Asignaturas;
        this.Titulo = Titulo;
    }

    public int getAnioexp() {
        return anioexp;
    }

    public String[] getAsignaturas() {
        return Asignaturas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAnioexp(int anioexp) {
        this.anioexp = anioexp;
    }

    public void setAsignaturas(String[] Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        String Asig="";
        for (String Asignatura : this.Asignaturas) {
            Asig = Asig + Asignatura + ", ";
        }
        return "Profesor{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de experiencia=" + this.anioexp 
                + ", Asignaturas=" + Asig 
                + ", Titulo=" + this.Titulo + '}';
    }
 

    
}
