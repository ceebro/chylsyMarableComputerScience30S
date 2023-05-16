package chylsymarablecomicstore;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableComicStore - 
    This is a program that allows a comic store to enter comic book titles
    as well as see its individual or collective inventory.
 * 
 * @author Chylsy Marable
 * @since 4-May-2023
 */
public class ChylsyMarableComicStore {

    /*
    These are static variables that will be used
    throughout the program. 
     */
    static final String TITLE = "Comic Book Store";
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

        String[] titles = new String[SIZE];

        titles = input(titles);

        String text = "What would you like to do?"
                + "\n \n 1 - See the entire database"
                + "\n 2 - See an index title"
                + "\n 3 - Change an index title"
                + "\n 4 - Quit the program ";

        int choice = 0;

        String userChoice = "";

        do {

            do {
                userChoice = input(text, TITLE);
            } while (userChoice.equals(""));

            choice = Integer.parseInt(userChoice);

            if (choice == 1) {

                output(titles, TITLE);
            } else if (choice == 2) {
                                
                int index = inputIndex("",0);
                
                if (index > 10) {

                    String errorMessage = " is outside of the database.";
                    output("Index " + index + errorMessage, TITLE);
                    index = inputIndex("", 0);
                }

                String message = "Index " + choice + " is set to: ";
                output(message + titles[index - 1], TITLE);

            } else if (choice == 3) {

                int index = 0;
                String indexChoice = "";

                do {
                    
                    do {
                        indexChoice = input("Enter the index to change:", TITLE);
                    } while (indexChoice.equals(""));

                    index = Integer.parseInt(indexChoice);
                } while (index > 10);

                String inputMessage = "Enter the new title for index " + index + ":";
                titles[index - 1] = input(inputMessage, TITLE);
                String outputMessage = "Index " + index + " is now set to: ";
                output(outputMessage + titles[index - 1], TITLE);
            }

        } while (choice < 4);

        output("Thank you for using the " + TITLE + "!", TITLE);
    }

    /**
     * This method outputs the entire contents of the array containing the comic
     * book titles.
     *
     * @param array - The array storing the comic book titles
     * @param title - The title of the program
     */
    private static void output(String[] array, String title) {

        String message = "The " + TITLE + ": \n \n";

        for (int i = 0; i < array.length; i++) {
            message = message + "Index " + (i + 1) + ": " + array[i] + "\n";
        }

        output(message, title);
    }

    private static int inputIndex(String indexChoice, int index){
   
        do {
            indexChoice = input("Enter the index title you want to see:", TITLE);
        } while (indexChoice.equals(""));

        index = Integer.parseInt(indexChoice);

        return index;
}
            
    /**
     * This method collects the titles of the comic books (the user's inputs).
     *
     * @param titles - The titles of the comic books
     * @return - Returns the titles of the comic books
     */
    private static String[] input(String[] titles) {

        for (int i = 0; i < titles.length; i++) {
            String text = "Enter the title for index " + (i + 1) + ":";
            titles[i] = input(text, TITLE);
        }

        return titles;
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
     * * This method displays the JOptionpane input dialog boxes within the
     * program.
     *
     * @param message - The message of the dialog box
     * @param title - The title of the dialog box
     * @return - Returns the user's inputs
     */
    private static String input(String message, String title) {

        return JOptionPane.showInputDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE);
    }
}
