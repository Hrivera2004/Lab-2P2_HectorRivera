
package lab.pkg2p2_hectorrivera;

    import javax.swing.JOptionPane;

/**
 *
 * @author Hector Rolando Rivera Varela
 */
public class Lab2P2_HectorRivera {

    public static void main(String[] args) {
        System.out.println("ADADASDADADAWDASDASDAWSd");
        int opc = 0;
        
        System.out.println("dsadasdad");
        while(opc!=4){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-\n2.-\n3.-\n4.-"));
            switch(opc){
                case 1:{
                    
                }break;
                case 2:{
                    
                }break;
                case 3:{
                    
                }break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
            }
        }
        
    }
    
}
