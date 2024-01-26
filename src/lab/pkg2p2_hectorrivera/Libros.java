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
public class Libros {
    String title;
    String Autor;
    String genero;
    String FechaP;
    Boolean Disponible;

    public Libros() {
    }
    
    public Libros(String title, String Autor, String FechaP, Boolean Disponible) {
        this.title = title;
        this.Autor = Autor;
        this.FechaP = FechaP;
        this.Disponible = Disponible;
    }

    public Libros(String title, String Autor, String genero, String FechaP, Boolean Disponible) {
        this.title = title;
        this.Autor = Autor;
        this.genero = genero;
        this.FechaP = FechaP;
        this.Disponible = Disponible;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getFechaP() {
        return FechaP;
    }

    public void setFechaP(String FechaP) {
        this.FechaP = FechaP;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean Disponible) {
        this.Disponible = Disponible;
    }

    @Override
    public String toString() {
        String dis = "";
        if (Disponible==true) {
            dis="si";
        }else{
            dis="no";
        }
        return "Libro{" + "title:" + title + ", Autor:" + Autor + "genero: "+ genero +" Fecha de Publicacion: " + FechaP + " Disponible: " + dis + '}';
    }
    
    
}
