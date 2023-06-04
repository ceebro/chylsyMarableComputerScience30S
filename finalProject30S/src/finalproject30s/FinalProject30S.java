
package finalproject30s;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author chyls
 */
public class FinalProject30S {

    public static final String TITLE = "Island Adventure";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        welcome();
        program();
  
    }
    
    public static void welcome(){
        
        String message = "Welcome to the ";
        output(message + TITLE, TITLE);
    }
    
    public static void program(){
        
        if(initialSituation(TextEN.textEN) == true){
            
           beachOption(TextEN.textEN);
        }
        else{
            
            jungleOption(TextEN.textEN);
        }
        
        
    }
   
    public static boolean initialSituation(String[] text){
        
        String[] choices = new String[2];
        choices[0]= "Explore the beach";
        choices [1] = "Explore the jungle";
        
        int userChoice = userOptions(0, TextEN.textEN, choices, "island.gif");
        
        if (userChoice == 0){
            return true;
        }
        
        return false;
    }  
    
    public static boolean beachOption(String[] text){
        
        String[] choices = new String[2];
        choices[0]= "Deploy the life raft";
        choices [1] = "Stay on the island";
        
        int userChoice = userOptions(1, TextEN.textEN, choices, "crashedPlane.png");

        if (userChoice == 0){
            return true;
        }
        
        return false;
    }
    
     public static boolean jungleOption(String[] text){
        
        String[] choices = new String[2];
        choices[0]= "Enter the cave";
        choices [1] = "Continue walking";
        
        int userChoice = userOptions(6, TextEN.textEN, choices, "darkCave.jpg");

        if (userChoice == 0){
            return true;
        }
        
        return false;
    }
    
    public static int userOptions(int index, String[] text, String[] choices, String fileName){
        
        TextEN textEN = new TextEN();
        
        String message = textEN.output(index);
    
        ImageIcon icon = new ImageIcon(fileName);
        
        Object userChoice = JOptionPane.showInputDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                icon,
                choices,
                choices[0]
        );        
        
        if (userChoice == choices[0]){
            return 0;
        }
        return 1;
    }    
                
    public static void output(String message, String title){
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                TITLE, 
                JOptionPane.PLAIN_MESSAGE
        );
    }



}
