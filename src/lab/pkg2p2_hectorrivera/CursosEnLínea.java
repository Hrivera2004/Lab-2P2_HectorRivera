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
public class CursosEnLínea {
    String title;
    String intructor;
    String genero;
    int Duracion;
    String plataforma;

    public CursosEnLínea() {
    }

    public CursosEnLínea(String title, String intructor, String genero, int Duracion, String plataforma) {
        this.title = title;
        this.intructor = intructor;
        this.genero = genero;
        this.Duracion = Duracion;
        this.plataforma = plataforma;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntructor() {
        return intructor;
    }

    public void setIntructor(String intructor) {
        this.intructor = intructor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "CursosEnL\u00ednea{" + "Titulo:" + title + ", intructor:" + intructor + ", genero:" + genero + ", Duracion(semanas):" + Duracion + ", plataforma:" + plataforma + '}';
    }
    
    
}
