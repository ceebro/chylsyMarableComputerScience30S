
package chylsymarablevolumecalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author chyls
 */
public class ChylsyMarableVolumeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String TITLE = "Volume Calculator";
        
        start("Welcome to the " + TITLE, TITLE);

        do {
            
            String input = userRadius("Enter the radius of the circle: ", TITLE);
            double radius = Double.parseDouble(input);
            
            String input2 = userHeight("Enter the height of the circle: ", TITLE);
            double height = Double.parseDouble(input2);
            
            double volume = (Math.PI * Math.pow(radius, 2) * height);
            
            volume ("The volume of the cylinder is: " + volume, TITLE);
            
            
        }
        
        while (confirm("Do you want to play again?", TITLE) == true);
        
        end("Thank you for playing the " + TITLE, TITLE);
        
    }
    

    private static void start(String message, String title) {
        
        output(message, title);
        
     }
    
    private static String userRadius (String message, String title) {
    
       return userInputs(message, title);
    
}

    private static String userHeight (String message, String title){
        
        return userInputs(message, title);
    }
    
    private static void volume(String message, String title){
        
        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );
        
    }
    
    private static void end(String message, String title){
        
        output(message, title);
    }
            
    private static void output(String message, String title) {
        
        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        
        );
                
        
    }
    
     private static String userInputs (String message, String title){
        
        String input;

        do{
            input = JOptionPane.showInputDialog(
                    null, 
                    message,
                    title, 
                    JOptionPane.PLAIN_MESSAGE);
            
        } while(input.equals("") || input == null);

        return input;
    } 

    private static boolean confirm(String message, String title){
        
        int confirm = JOptionPane.showConfirmDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE
                );
                
        return confirm == 0;
        
    }
}
