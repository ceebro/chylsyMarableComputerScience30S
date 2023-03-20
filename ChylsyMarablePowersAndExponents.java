
package chylsymarablepowersandexponents;

import javax.swing.JOptionPane;

/**
 *
 * @author chyls
 */
public class ChylsyMarablePowersAndExponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String TITLE = "Powers and Exponents";
        
        start("Welcome to " + TITLE + "!", TITLE);

        do {
            
        String input = userBase("Enter a base", TITLE);
        int base = Integer.parseInt(input);

        String input2 = userExponent("Enter an exponent", TITLE);
        int exponent = Integer.parseInt(input2);

        int power = (int) Math.pow(base, exponent);
            
        power(base, exponent, power, TITLE);
        
        }
        
        while (confirm("Do you want to play again?", TITLE) == true);
        
        finish("Thank you for using the " + TITLE + " program!", TITLE);
         
    }
    
    private static void start(String message, String title) {

        output(message, title);

    }

    private static String userBase(String message, String title) {

        return userInputs(message, title);

    }

    private static String userExponent(String message, String title) {

        return userInputs(message, title);

    }

    private static void power(int base, int exponent, int power, String title) {

        JOptionPane.showMessageDialog(null,
                "The base " + base + " to the exponent of " + exponent + " = " + power,
                title,
                JOptionPane.PLAIN_MESSAGE
        );

    }

    private static void finish(String message, String title) {

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

    private static String userInputs(String message, String title) {

        return JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );
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
   
