package chylsymarablerinkydooflingycompany;

import javax.swing.JOptionPane;

/*
 * ChylsyMarableRinkyDooflingyCompany - 
    An application that allows the user to enter the 
    amount of Dooflingies sold in that size for each city 
    (Winnipeg, Calgary), and display those amounts. The user
    can also enter the values themselves and add the total of
    each sizes per index.
 * 
 * @author Chylsy Marable
 * @since 19-Apr-2023
 */
public class ChylsyMarableRinkyDooflingyCompany {

    /*
    These are constant variables (static variables) that will be used throughout
    the program. 
     */
    static final String TITLE = "Rinky Dooflingy Company";
    static final int SIZE = 10;

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
    }

    /**
     * This method displays the user welcome message.
     */
    private static void welcome() {

        output("Welcome to the " + TITLE + "!", TITLE);
    }

    /**
     * This method executes the program. A do while loop dictates when the
     * program is executed and the if statements run certain parts depending on
     * the user's input. At the end, the program displays the thank you message.
     */
    private static void program() {

        String text = "What would you like to do?"
                + "\n 1 - See the sales for Winnipeg"
                + "\n 2 - See the sales for Calgary"
                + "\n 3 - Enter the sales for Winnipeg"
                + "\n 4 - Enter the sales for Calgary"
                + "\n 5 - See the total sales of the company"
                + "\n 6 - Quit the program";

        int[] winnipeg = new int[SIZE];

        int[] calgary = new int[SIZE];

        int choice = 0;

         do {
            
            do{
                userChoice = input(text, TITLE);
            } while (userChoice.equals(""));
            
            choice = Integer.parseInt(userChoice);

            if (choice == 1) {
                output(winnipeg, TITLE, "Winnipeg");
            } else if (choice == 2) {
                output(calgary, TITLE, "Calgary");
            } else if (choice == 3) {
                winnipeg = input("Winnipeg", 10);
            } else if (choice == 4) {
                calgary = input("Calgary", 10);
            } else if (choice == 5) {
                total(winnipeg, calgary);
            }

        } while (choice < 6);

        output("Thank you for using the " + TITLE + "!", TITLE);
        System.exit(0);
    }

    /**
     * This method displays the contents of the city arrays (the sales in the
     * city).
     *
     * @param array - the array of the city
     * @param title - the title of the program
     * @param city - the name of the city
     */
    private static void output(int[] array, String title, String city) {
        String text = city + " Sales\n\n";
        for (int i = 0; i < array.length; i++) {
            text = text + "Size " + (i + 1) + ": " + array[i] + "\n";
        }
        output(text, title);
    }

    /**
     * This method stores the city's sales.
     *
     * @param city - the array of the city
     * @param size - the size of the array (its index)
     * @return - returns the values of the city's dooflingy sales
     */
    private static int[] input(String city, int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {

            String text = "Enter sales for " + city + " size: " + (i + 1);
            String value = "";
            do {
                value = input(text, TITLE);
            } while (value.equals(""));
            int sale = Integer.parseInt(value);
            array[i] = sale;
        }

        return array;
    }

    /**
     * This method adds the sales of Winnipeg and Calgary at the same index (the
     * same sizes).
     *
     * @param winnipeg - The sales of Winnipeg
     * @param calgary - The sales of Calgary
     */
    private static void total(int[] winnipeg, int[] calgary) {
        String text = "Total company sales: \n \n";

        int[] total = new int[SIZE];
        for (int i = 0; i < total.length; i++) {

            total[i] = winnipeg[i] + calgary[i];

            text = text + "Size " + (i + 1) + ": " + total[i] + "\n";

        }

        output(text, TITLE);
    }

    /**
     * This method displays the JOptionpane message dialog boxes within the
     * program.
     *
     * @param message - The message of the dialog box
     * @param title - The title of the dialog box
     */
    private static void output(String message, String title) {

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * This method displays the JOptionpane input dialogs boxes within the 
     * program.
     *
     * @param message - The message of the dialog box
     * @param title - The title of the dialog box
     * @return - Returns the user's inputs as Strings
     */
    private static String input(String message, String title) {

        return JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE);
    }
}
