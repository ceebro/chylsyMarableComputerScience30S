
package finalproject30s;
import javax.swing.*;

/**
 *
 * @author chyls
 */
public class FinalProject30S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ImageIcon cat = new ImageIcon("nerd.gif");
       
        JOptionPane.showMessageDialog(null,
                "After a boating accident, you are left stranded on a "
                        + "\n tropical island in the middle of the ocean. You "
                        + "\n are on the shore and in need of supplies to "
                        + "\n survive. Do you explore more of the beach, or do "
                        + "\n you venture into the treacherous jungle?", 
                "Attempting Graphics", 
                JOptionPane.WARNING_MESSAGE, 
                cat
        );
  
    }
    
}
