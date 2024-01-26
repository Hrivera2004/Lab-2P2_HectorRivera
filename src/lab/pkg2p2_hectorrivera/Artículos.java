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
public class Artículos {
    String title;
    String Autor;
    String tema;
    Date FechaP;
    Boolean Acceso;

    public Artículos() {
    }

    public Artículos(String title, String Autor, String tema, Date FechaP, Boolean Acceso) {
        this.title = title;
        this.Autor = Autor;
        this.tema = tema;
        this.FechaP = FechaP;
        this.Acceso = Acceso;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaP() {
        return FechaP;
    }

    public void setFechaP(Date FechaP) {
        this.FechaP = FechaP;
    }

    public Boolean getAcceso() {
        return Acceso;
    }

    public void setAcceso(Boolean Acceso) {
        this.Acceso = Acceso;
    }

    @Override
    public String toString() {
        String dis = "";
        if (Acceso==true) {
            dis="si";
        }else{
            dis="no";
        }
        return "Art\u00edculos{ " + "titulo:" + title + ", Autor:" + Autor + ", tema:" + tema + ", Fecha de publicacion:" + FechaP + ", Acceso: " + Acceso + '}';
    }

    
    
}
