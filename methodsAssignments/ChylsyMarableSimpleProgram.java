
package chylsymarablesimpleprogram;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableSimpleProgram - 
 * A program that takes the user's
 * (string) input and displays it 
 * in a message dialog box.
 * @author Chylsy Marable
 * @since 15-Mar-2023
*/
public class ChylsyMarableSimpleProgram
{

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String TITLE = "The Simple Program";

        start(TITLE);
        String input = userInput(TITLE);
        output("You entered: " + input, TITLE);
        end(TITLE);

    }

    /**
     * Displays the user welcome message.
     *
     * @param title - The title of the program (used in the message and title
     *  of the dialog box).
     */
    private static void start(String title) {

        JOptionPane.showMessageDialog(
                null,
                "Welcome to " + title + "!",
                title,
                JOptionPane.PLAIN_MESSAGE);

    }

    /**
     * This method displays the input dialog box.
     *
     * @param TITLE - The title of the program (used in the title of the dialog
     * box).
     * @return - Returns the user's input so we can use it in our output()
     * method.
     */
    private static String userInput(String TITLE) {

        return JOptionPane.showInputDialog(
                null,
                "Enter something",
                TITLE,
                JOptionPane.PLAIN_MESSAGE);

    }

    /**
     * The method that displays the dialog box with the user's input.
     *
     * @param message - The message of the dialog box (above)
     * @param title - The title of the program (used in the title of the dialog
     * box).
     */
    private static void output(String message, String title) {

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE);

    }

    /**
     * Displays the user thank you message.
     *
     * @param title - The title of the program (used in the message and title
     * of the dialog box).
     */
    private static void end(String title) {

        JOptionPane.showMessageDialog(
                null,
                "Thank you for using " + title + "!",
                title,
                JOptionPane.PLAIN_MESSAGE);

    }

}
