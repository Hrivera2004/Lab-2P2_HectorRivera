
package lab.pkg2p2_hectorrivera;


import java.util.ArrayList;
import java.util.Date;
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
        StartItems();
        int opc = 0;
        while(opc == 0){
            String username = JOptionPane.showInputDialog("Ingrese su User");
            int found = User.verUser(UserList, username);
            System.out.println(found);
            if (found!=-1) {
                String contraseña = JOptionPane.showInputDialog("Ingrese su Contraseña");
                if (User.verContra(UserList, contraseña,found)==true) {
                    
                    if (UserList.get(found).getTipo()=="Estudiante") {
                        int opc1=0;
                        while(opc1!=5){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.-Listar\n2.-salir"));
                            switch(opc1){
                                case 1:{
                                    System.out.println("adasd");
                                    List();
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
                                    List();
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
                                    List();
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
           opc = JOptionPane.showConfirmDialog(null, "Desea continuar?");
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
    public static void StartItems(){
       Libros libro = new Libros("Harry potter","JK","12/12/1980",false);
       Artículos art = new Artículos("BBC","Jammmy","Economia","12/12/1980",true);
       CursosEnLínea CEL = new CursosEnLínea("BBC","Jammmy","Economia",20,"Youtube");
       ConferenciasVirtuales CV = new ConferenciasVirtuales("BBC","Jammmy","12/12/1980",20,"Youtube");
       ItemList.add(libro);
       ItemList.add(art);
       ItemList.add(CEL);
       ItemList.add(CV);
    }
    public static void List(){
        for (int i = 0; i < ItemList.size(); i++) {
            System.out.println("------------");
            System.out.println(ItemList.get(i));
        }
    }
    
    
}
