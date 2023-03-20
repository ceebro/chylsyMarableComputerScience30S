
package chylsymarablepowersandexponents;

import javax.swing.JOptionPane;


/*
 * ChylsyMarablePowersAndExponents - description
 * 
 * @author Your Name
 * @since 20-Mar-2023
*/
public class ChylsyMarablePowersAndExponents
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String TITLE = "Powers and Exponents";

        start("Welcome to " + TITLE + "!", TITLE);

        do {

            String input = userBase("Enter a base", TITLE);
            int base = Integer.parseInt(input);
            /* Input dialog boxes can only store string values, so the user's
            input is stored into a string. We cannot use this for the Math.pow ( )
            method, so we must parse it into an integer.
            */

            String input2 = userExponent("Enter an exponent", TITLE);
            int exponent = Integer.parseInt(input2);
            /* Parsing the exponent string variable into an integer so we can
            use it in the Math.pow ( ) method. Explained above.
            */

            int power = (int) Math.pow(base, exponent);

            power(base, exponent, power, TITLE);

        } while (confirm("Do you want to play again?", TITLE) == true);
        /* A do while loop is put into place so that the program will repeat 
        only if the confirm( ) method equals true. This means the program will
        only repeat if the confirm( ) method equals to 0.
        
        */

        finish("Thank you for using the " + TITLE + " program!", TITLE);

    }

    /**
     * Displays the user welcome message.
     * @param message - The message of the dialog box.
     * @param title - The title of the program (used in the title of the 
     * dialog box).
     */
    private static void start(String message, String title) {

        output(message, title);

    }

    /**
     * The dialog box that the user uses to enter the base of their choice.
     * @param message - The message of the dialog box.
     * @param title - The title of the program (used in the title of the 
     * dialog box).
     * @return - Returns a string variable (the base the user entered to 
     * use the program).
     */
    private static String userBase(String message, String title) {

        return userInputs(message, title);

    }

    /**
     * The dialog box that the user inputs the exponent they are raising their
     * base to.
     * @param message - The message of the dialog box.
     * @param title - The title of the program (used in the title of the dialog
     * box).
     * @return - Returns a string variable (the exponent the user entered to use
     * the program).
     */
    private static String userExponent(String message, String title) {

        return userInputs(message, title);

    }

    /**
     * The message dialog box that displays the user's answer (being the power
     * they are solving for) as well as the data they entered earlier.
     * @param base - The base the user entered earlier.
     * @param exponent - The exponent the user entered earlier.
     * @param power - The power / answer the user is solving for.
     * @param title - The title of the program (used in the title of the dialog
     * box).
     */
    private static void power(int base, int exponent, int power, String title) {

        JOptionPane.showMessageDialog(null,
                "The base " + base + " to the exponent of " + exponent + " = " + power,
                title,
                JOptionPane.PLAIN_MESSAGE
        );

    }

    /**
     * Displays the user goodbye message (thanking them for using the program).
     * @param message - The message of the dialog box.
     * @param title - The title of the program (used in the title of the dialog
     * box).
     */ 
    private static void finish(String message, String title) {

        output(message, title);

    }

    /**
     * A method used to write the message dialog boxes within the program.
     * @param message - The message of the dialog boxes.
     * @param title - The title of the dialog boxes.
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
     * A method used to write the input dialog boxes within the program (when
     * the user enters the base and the exponents).
     * @param message - The message of the dialog boxes.
     * @param title - The title of the dialog boxes.
     * @return - Returns the user's data.
     */
    private static String userInputs(String message, String title) {

        return JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );
    }

    /**
     * The method that displays the option for the user to play again or to 
     * terminate the program. Using a Boolean variable to store the result 
     * allows us to replay the program only when the user presses 'Yes' (0).
     * A confirm dialog stores integers; 'Yes' is stored into the number 0
     * and 'No' is stored into the number 1.
     * @param message - The message of the dialog box.
     * @param title - The title of the program (used in the title of the dialog
     * box).
     * @return - Returns the result 'Yes'. This method is ignored if the user
     * selects 'No' (1).
     */
    private static boolean confirm(String message, String title) {

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
