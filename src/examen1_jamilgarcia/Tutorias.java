/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_jamilgarcia;

import java.util.Date;

/**
 *
 * @author JamilGarcía
 */
public class Tutorias {
    private int hora; 
    private int aula; 
    private Date fecha; 
    private String tema; 

    public Tutorias() {
    }

    public Tutorias(int hora, int aula, Date fecha, String tema) {
        this.hora = hora;
        this.aula = aula;
        this.fecha = fecha;
        this.tema = tema;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int clase) {
        this.aula = clase;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Tutorias{" + "hora=" + hora + ", clase=" + aula + ", fecha=" + fecha + ", tema=" + tema + '}';
    }
    
    
}
