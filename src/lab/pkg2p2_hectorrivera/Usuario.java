/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_hectorrivera;

import java.util.ArrayList;

/**
 *
 * @author hrolriverav
 */
public class Usuario {
    
    private String name;
    private String Contraseña;
    private String Tipo;
    
    public Usuario(){  
    }
    
    public Usuario(String name,String Contraseña,String Tipo) {
        this.name=name;
        this.Contraseña=Contraseña;
        this.Tipo=Tipo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", Contrase\u00f1a=" + Contraseña + ", Tipo=" + Tipo + '}';
    }
    
    public int verUser(ArrayList<Usuario> Lista, String UserSent){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getName().equalsIgnoreCase(UserSent)) {
                pos = i;
            }
        }
        return pos;
    }
    public boolean verContra(ArrayList<Usuario> Lista, String ContraSent){
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getContraseña()== ContraSent) {
                return true;
            }
        }
        return false;
    }
    
}
