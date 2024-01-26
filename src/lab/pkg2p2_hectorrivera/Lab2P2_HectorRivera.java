
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
                        while(opc1!=3){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.listar\n2.crear\n3.-salir"));
                            switch(opc1){
                                case 1:{
                                    List();
                                }break;
                                case 2:{
                                    crear();
                                }break;
                                case 3:{}break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Valor no valido");
                            }
                        }
                        
                    }else if(UserList.get(found).getTipo()=="bibliotecario"){
                        int opc1=0;
                        while(opc1!=5){
                            opc1=Integer.parseInt(JOptionPane.showInputDialog("1.-Listar\n2.-Crear\n3.-Delete\n4.-modificar\n5.-salir"));
                            switch(opc1){
                                case 1:{
                                    List();
                                }break;
                                case 2:{
                                    crear();
                                }break;
                                case 3:{
                                    delete();
                                }break;
                                case 4:{
                                    modificar();
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
       CursosEnLínea CEL = new CursosEnLínea("BBC","Jammmy","Economia","1 hora","Youtube");
       ConferenciasVirtuales CV = new ConferenciasVirtuales("BBC","Jammmy","12/12/1980","2 horas","Youtube");
       ItemList.add(libro);
       ItemList.add(art);
       ItemList.add(CEL);
       ItemList.add(CV);
    }
    public static void List(){
        for (int i = 0; i < ItemList.size(); i++) {
            System.out.println("");
            System.out.println(ItemList.get(i));
        }
    }
    public static void crear(){
        int editOption = Integer.parseInt(JOptionPane.showInputDialog("1.- Crear Libro \n2.-Crear Articulo\n3.-Crear Curso en Linea\n4.-Conferencia Virtual"));
        switch(editOption){
            case 1:{
                boolean disponible = true;
                if (JOptionPane.showInputDialog("disponible:").equalsIgnoreCase("si")) {
                    disponible= true;
                }else{
                    disponible = false;
                }
                Libros newBook = new Libros( 
                        JOptionPane.showInputDialog("Nombre:"),
                        JOptionPane.showInputDialog("Autor:"),
                        JOptionPane.showInputDialog("fecha:"),
                        disponible
                );
            }break;
            case 2:{
                boolean disponible = true;
                if (JOptionPane.showInputDialog("disponible(si/no):").equalsIgnoreCase("si")) {
                    disponible= true;
                }else{
                    disponible = false;
                }
                Artículos newBook = new Artículos( 
                        JOptionPane.showInputDialog("Nombre:"),
                        JOptionPane.showInputDialog("Autor:"),
                        JOptionPane.showInputDialog("Tema:"),
                        JOptionPane.showInputDialog("fecha:"),
                        disponible
                );
            }break;
            case 3:{
                CursosEnLínea newBook = new CursosEnLínea( 
                        JOptionPane.showInputDialog("Titulo:"),
                        JOptionPane.showInputDialog("Instructor:"),
                        JOptionPane.showInputDialog("genero:"),
                        JOptionPane.showInputDialog("duracion:"),
                        JOptionPane.showInputDialog("plataforma:")
                );
            }break;
            case 4:{
                ConferenciasVirtuales newBook = new ConferenciasVirtuales( 
                        JOptionPane.showInputDialog("Titulo:"),
                        JOptionPane.showInputDialog("Conferencista:"),
                        JOptionPane.showInputDialog("fecha:"),
                        JOptionPane.showInputDialog("duracion:"),
                        JOptionPane.showInputDialog("enlace:")
                );
            }
        }
    }
    
    public static void delete(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de cual desea eliminar"));
        ItemList.remove(posicion);
    }
    public static void modificar(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de cual desea modificar"));
        if (ItemList.get(posicion) instanceof Libros) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(  "1.- title\n" +
                                                                        "2.- Autor\n" +
                                                                        "3.- tema\n" +
                                                                        "4.- FechaP\n" +
                                                                        "5.- Acceso"));
            switch(option){
                case 1:{
                    ((Libros)ItemList.get(option)).setTitle(JOptionPane.showInputDialog("Ingrese nuevo Titulo") );
                }break;
                case 2:{
                    ((Libros)ItemList.get(option)).setAutor( JOptionPane.showInputDialog("Ingrese nuevo autor") );
                }break;
                case 3:{
                    ((Libros)ItemList.get(option)).setGenero(JOptionPane.showInputDialog("Ingrese nuevo autor") );
                }break;
                case 4:{
                    ((Libros)ItemList.get(option)).setFechaP(JOptionPane.showInputDialog("Ingrese nueva fecha") );
                }break;
                case 5:{
                    boolean disponible = true;
                if (JOptionPane.showInputDialog("disponible:").equalsIgnoreCase("si")) {
                    disponible= true;
                }else{
                    disponible = false;
                }
                    ((Libros)ItemList.get(option)).setDisponible(disponible);
                }break;
            }
        }else if(ItemList.get(posicion) instanceof Artículos){
            int option = Integer.parseInt(JOptionPane.showInputDialog(  "1. title;\n" +
            "    2. Autor;\n" +
            "    3. tema;\n" +
            "    4. FechaP;\n" +
            "    5. Acceso;"));
            switch(option){
                case 1:{
                    ((Artículos)ItemList.get(option)).setTitle(JOptionPane.showInputDialog("Ingrese nuevo Titulo") );
                }break;
                case 2:{
                    ((Artículos)ItemList.get(option)).setAutor( JOptionPane.showInputDialog("Ingrese nuevo autor") );
                }break;
                case 3:{
                    ((Artículos)ItemList.get(option)).setTema(JOptionPane.showInputDialog("Ingrese nuevo tema") );
                }break;
                case 4:{
                    ((Artículos)ItemList.get(option)).setFechaP(JOptionPane.showInputDialog("Ingrese nueva fecha") );
                }break;
                case 5:{
                    boolean disponible = true;
                if (JOptionPane.showInputDialog("disponible:").equalsIgnoreCase("si")) {
                    disponible= true;
                }else{
                    disponible = false;
                }
                    ((Artículos)ItemList.get(option)).setAcceso(disponible);
                }break;
            }
        }else if(ItemList.get(posicion) instanceof CursosEnLínea){
            int option = Integer.parseInt(JOptionPane.showInputDialog(  "1. title;\n" +
"    2. intructor;\n" +
"    3. genero;\n" +
"    4. Duracion;\n" +
"    5. plataforma;"));
            switch(option){
                case 1:{
                    
                    ((CursosEnLínea)ItemList.get(option)).setTitle(JOptionPane.showInputDialog("Ingrese nuevo Titulo") );
                }break;
                case 2:{
                    ((CursosEnLínea)ItemList.get(option)).setIntructor(JOptionPane.showInputDialog("Ingrese nuevo intructor") );
                }break;
                case 3:{
                    ((CursosEnLínea)ItemList.get(option)).setGenero(JOptionPane.showInputDialog("Ingrese nuevo genero") );
                }break;
                case 4:{
                    ((CursosEnLínea)ItemList.get(option)).setDuracion(JOptionPane.showInputDialog("Ingrese nueva duracion") );
                }break;
                case 5:{
                    ((CursosEnLínea)ItemList.get(option)).setPlataforma(JOptionPane.showInputDialog("Ingrese nueva plataforma"));
                }break;
            }
        }else if(ItemList.get(posicion) instanceof ConferenciasVirtuales){
            int option = Integer.parseInt(JOptionPane.showInputDialog(  "1.- title;\n" +
"    2.- Conferencista;\n" +
"    3.- fecha;\n" +
"    4.- Duracion;\n" +
"    5.- Enlace;"));
            switch(option){
                case 1:{
                    ((ConferenciasVirtuales)ItemList.get(option)).setTitle(JOptionPane.showInputDialog("Ingrese nuevo Titulo") );
                }break;
                case 2:{
                    ((ConferenciasVirtuales)ItemList.get(option)).setConferencista(JOptionPane.showInputDialog("Ingrese nuevo conferencista") );
                }break;
                case 3:{
                    ((ConferenciasVirtuales)ItemList.get(option)).setFecha(JOptionPane.showInputDialog("Ingrese nuevo fecha") );
                }break;
                case 4:{
                    ((ConferenciasVirtuales)ItemList.get(option)).setDuracion(JOptionPane.showInputDialog("Ingrese nueva duracion") );
                }break;
                case 5:{
                    ((ConferenciasVirtuales)ItemList.get(option)).setEnlace(JOptionPane.showInputDialog("Ingrese nueva enlace"));
                }break;
            }
        }
    }
}
