

package chylsymarablevolumecalculator;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableVolumeCalculator - 
 * A program that calcaulates the volume of a cylinder upon the entry of
 * the user's radius and cylinder height.
 * 
 * @author Chylsy Marable
 * @since 21-Mar-2023
*/
public class ChylsyMarableVolumeCalculator
{

    // Class variable (we did not learn this yet) - it is a variable that is
    // able to be shared between methods.
    static final String TITLE = "Volume Calculator";

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        start("Welcome to the " + TITLE, TITLE);

        program();

        end("Thank you for playing the " + TITLE, TITLE);

    }

    /**
     * The method that displays the welcome message.
     * @param message - The welcome message (above)
     * @param title - The title of the program
     */
    private static void start(String message, String title) {

        output(message, title);
    }

    /**
     * The method that executes the program. The loop is there to replay the
     * program as per the user wishes (while the user presses the confirm 
     * option)
     */
    private static void program() {

        do {

            String input = userRadius("Enter the radius of the circle: ", TITLE);
            double radius = Double.parseDouble(input);

            String input2 = userHeight("Enter the height of the circle: ", TITLE);
            double height = Double.parseDouble(input2);

            double volume = (Math.PI * (radius * radius) * height);

            volume("The volume of the cylinder is: " + volume, TITLE);

        } while (confirm("Do you want to play again?", TITLE) == true);

    }

    /**
     * The method that returns the user's radius.
     * @param message - The message instructing the user to enter their radius.
     * @param title - The title of the program.
     * @return - Returns the user's radius value. Above ^^
     */
    private static String userRadius(String message, String title) {

        return userInputs(message, title);

    }
    /**
     * The method that returns the user's height.
     * @param message - The message instructing the user to enter their height.
     * @param title - The title of the program.
     * @return - Returns the user's height value above.
     */
    private static String userHeight(String message, String title) {

        return userInputs(message, title);
    }

    /**
     * The method that displays the volume of their cylinder. This value is 
     * calculated above in the program() method.
     * @param message - The message displaying the user's volume.
     * @param title - The title of the program.
     */
    private static void volume(String message, String title) {

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );

    }

    /**
     * The method that displays the user 'thank you' message.
     * @param message - The 'thank you' message for the user.
     * @param title - The title of the program.
     */
    private static void end(String message, String title) {
        
        output(message, title);
    }

    /**
     * A method that writes the message dialog boxes in the program. Used in the 
     * start() method and the end() method.
     * @param message - The message that the program displays (defined 
     * above)
     * @param title - The title of the dialog box.
     */
    private static void output(String message, String title) {

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );

    }
    
    /**
     * The method that 'takes in' the user's inputs. A loop is put into
     * place if the user enters an incorrect value (the box will replay itself
     * until a proper value is inputted)
     * @param message - The message instructing the user to enter their values.
     * @param title - The title of the program.
     * @return - Returns the number into a string (will be parsed above)
     */
    private static String userInputs(String message, String title) {
        
        String input;

        do {
        input = JOptionPane.showInputDialog(
                    null,
                    message,
                    title,
                    JOptionPane.PLAIN_MESSAGE);

        } while (input.equals("") || input == null);

        return input;
    }
    /**
     * The method that asks if the user wants to use the program again.
     * @param message - The message of the dialog box (defined above)
     * @param title - The title of the program.
     * @return - Returns the user's response.
     */
    private static boolean confirm(String message, String title) {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (confirm == JOptionPane.NO_OPTION) {
            
            System.exit(0); 
        }
            
        else if (confirm == JOptionPane.YES_OPTION) {

            return confirm == 0;
        }

        return true;
    }

}
