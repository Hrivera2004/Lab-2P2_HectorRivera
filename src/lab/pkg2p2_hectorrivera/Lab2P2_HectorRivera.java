
package lab.pkg2p2_hectorrivera;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Hector Rolando Rivera Varela
 */
public class Lab2P2_HectorRivera {
    static ArrayList<Usuario> UserList = new ArrayList<Usuario>();
    static ArrayList ItemList = new ArrayList();
    public static void main(String[] args) {
        Usuario User = new Usuario();
        StartUsers();
        int opc = 0;
        while(opc == 0){
            String username = JOptionPane.showInputDialog("Ingrese su User");
            int found = User.verUser(UserList, username);
            
            if (found!=-1) {
                String contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña");
                
                if (User.verContra(UserList, contraseña)==true) {
                    
                    if (UserList.get(found).getTipo()=="Estudiante") {
                        int opc1=0;
                        while(opc1!=5){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.-Listar\n2.-salir"));
                            switch(opc1){
                                case 1:{
                                    
                                }break;
                                case 2:{}
                                default:
                                    JOptionPane.showMessageDialog(null, "Valor no valido");
                            }
                        }
                        
                    }else if(UserList.get(found).getTipo()=="profesor"){
                        int opc1=0;
                        while(opc1!=5){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.-\n2.-\n3.-\n4.-\n5.-salir"));
                            switch(opc1){
                                case 1:{
                                    
                                }break;
                                case 2:{
                                    
                                }break;
                                case 3:{}break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Valor no valido");
                            }
                        }
                        
                    }else if(UserList.get(found).getTipo()=="bibliotecario"){
                        int opc1=0;
                        while(opc1!=5){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.-\n2.-\n3.-\n4.-\n5.-salir"));
                            switch(opc1){
                                case 1:{
                                    
                                }break;
                                case 2:{
                                    
                                }break;
                                case 3:{
                                    
                                }break;
                                case 4:{
                                    
                                }break;
                                case 5:{}
                                default:
                                    JOptionPane.showMessageDialog(null, "Valor no valido");
                            }
                        }
                    }
                    
                }else{
                JOptionPane.showMessageDialog(null, "No contraseña incorrecta");
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
    public static void List(){
        for (int i = 0; i < ItemList.size(); i++) {
            System.out.println(ItemList.get(i));
        }
    }
    
    
}
