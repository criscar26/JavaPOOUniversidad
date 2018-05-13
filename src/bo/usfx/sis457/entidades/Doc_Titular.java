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
 * @author POWER PC
 */
public class Doc_Titular extends Docente{
    protected String Examen_Competencia;

    public Doc_Titular(String Examen_Competencia, int anioexp, String[] Asignaturas, String Titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(anioexp, Asignaturas, Titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.Examen_Competencia = Examen_Competencia;
    }

    public Doc_Titular(String Examen_Competencia, int anioexp, String[] Asignaturas, String Titulo) {

        super(anioexp, Asignaturas, Titulo);
        this.Examen_Competencia = Examen_Competencia;
    }

    public String getExamen_Competencia() {
        return Examen_Competencia;
    }

    public void setExamen_Competencia(String Examen_Competencia) {
        this.Examen_Competencia = Examen_Competencia;
    }

    @Override
    public String toString() {
                String Asig="";
        for (String Asignatura : this.Asignaturas) {
            Asig = Asig + Asignatura + ", ";
        }
        return "Doc_Titular{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de experiencia=" + this.anioexp 
                + ", Asignaturas=" + Asig 
                + ", Titulo=" + this.Titulo + '}'
                + ", Examen_Competencia=" + this.Examen_Competencia + '}';
    }
    
    
    
    
}
