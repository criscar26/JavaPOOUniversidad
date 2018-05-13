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
public class Doc_Contrato extends Docente {
    protected String Nro_Contrato;

    public Doc_Contrato(String Nro_Contrato, int anioexp, String[] Asignaturas, String Titulo, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(anioexp, Asignaturas, Titulo, carnetIdentidad, nombre, fechaNacimiento);
        this.Nro_Contrato = Nro_Contrato;
    }

    public Doc_Contrato(String Nro_Contrato, int anioexp, String[] Asignaturas, String Titulo) {
        super(anioexp, Asignaturas, Titulo);
        this.Nro_Contrato = Nro_Contrato;
    }

    public String getNro_Contrato() {
        return Nro_Contrato;
    }

    public void setNro_Contrato(String Nro_Contrato) {
        this.Nro_Contrato = Nro_Contrato;
    }

    @Override
    public String toString() {
                String Asig="";
        for (String Asignatura : this.Asignaturas) {
            Asig = Asig + Asignatura + ", ";
        }
        return "Doc_Contrato{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Años de experiencia=" + this.anioexp 
                + ", Asignaturas=" + Asig 
                + ", Titulo=" + this.Titulo + '}'
                + ", Nro_Contrato=" + this.Nro_Contrato + '}';
    }
    
    
}
