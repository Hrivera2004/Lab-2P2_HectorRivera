/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_hectorrivera;

import java.util.Date;

/**
 *
 * @author hrolriverav
 */
public class ConferenciasVirtuales {
    String title;
    String Conferencista;
    String fecha;
    String Duracion;
    String Enlace;

    public ConferenciasVirtuales() {
    }

    public ConferenciasVirtuales(String title, String Conferencista, String fecha, String Duracion, String Enlace) {
        this.title = title;
        this.Conferencista = Conferencista;
        this.fecha = fecha;
        this.Duracion = Duracion;
        this.Enlace = Enlace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConferencista() {
        return Conferencista;
    }

    public void setConferencista(String Conferencista) {
        this.Conferencista = Conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getEnlace() {
        return Enlace;
    }

    public void setEnlace(String Enlace) {
        this.Enlace = Enlace;
    }

    @Override
    public String toString() {
        return "ConferenciasVirtuales{" + "Titulo: " + title + ", Conferencista: " + Conferencista + ", fecha:" + fecha + ", Duracion(minutos):" + Duracion + ", Enlace=" + Enlace + '}';
    }
    
}
