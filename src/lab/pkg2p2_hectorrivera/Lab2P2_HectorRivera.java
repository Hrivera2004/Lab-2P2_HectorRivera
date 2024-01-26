/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2p2_hectorrivera;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hrolriverav
 */
public class Lab2P2_HectorRivera {

    static ArrayList<Usuario> UserList = new ArrayList<Usuario>();
    
    public static void main(String[] args) {
        Usuario User = new Usuario();
        StartUsers();
        int opc = 0;
        while(opc == 0){
            String username = JOptionPane.showInputDialog("Ingrese su User");
            int found = User.verUser(UserList, username);
            if (found!=-1) {
                String contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña");
                if (true) {
                    
                }else{
                    
                }
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro el usario");
            }

        }
    }
    public static void StartUsers(){
        Usuario User1 = new Usuario("Hector", "7821A","Estudiante");
        Usuario User2 = new Usuario("Jimenez","91p0", "profesor");
        Usuario User3 = new Usuario("Andrea","?12wa", "bibliotecario");
        UserList.add(User1);
        UserList.add(User2);
        UserList.add(User3); 
    }
}
