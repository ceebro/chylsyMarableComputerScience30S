package chylsymarablecomicstore;

import javax.swing.JOptionPane;


/*
 * ChylsyMarableComicStore - 
    This is a program that allows a comic store to enter comic book titles
    as well as see and change its individual inventory. It can display the 
    entire inventory or a single title upon the user's wishes.
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
    static final String errorMessage = " is outside of the database.";
    
    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();
        program();
        thanks();
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
     * the user's input.
     */
    private static void program() {

        String[] titles = new String[SIZE];

        titles = input(titles);

        int choice = 0; 
        
        do {
            
            String userChoice = "What would you like to do?"
                + "\n \n 1 - See the entire database"
                + "\n 2 - See an index title"
                + "\n 3 - Change an index title"
                + "\n 4 - Quit the program ";
                        
            do {

                choice = inputOption(userChoice);
            } while (choice > 4);

            if (choice == 1) {

                output(titles, TITLE);
            } else if (choice == 2) {

                String inputIndex = "Enter the index title you want to see:";

                int index = inputOption(inputIndex);

                if (index > SIZE) {

                    output("Index " + index + errorMessage, TITLE);
                    index = inputOption(inputIndex);
                }

                String outputTitle = "Index " + index + " is set to: ";
                output(outputTitle + titles[index - 1], TITLE);
            } else if (choice == 3) {

                int index = 0;

                String newIndex = "Enter the index to change:";
                index = inputOption(newIndex);
                
                if (index > SIZE){
                    
                    output("Index " + index + errorMessage, TITLE);
                    
                    index = inputOption(newIndex);
                }

                String inputMessage = "Enter the new title for index " + index + ":";
                titles[index - 1] = input(inputMessage, TITLE);
                
                String outputNewTitle = "Index " + index + " is now set to: ";
                output(outputNewTitle + titles[index - 1], TITLE);
            }

        } while (choice < 4);

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

    /**
     * This method collects the user's input (user's choice for what to do
     * within the program, user's index input) and replays if the user does not
     * enter anything.
     *
     * @param message - The message of the dialog box
     * @return - Returns the user's index input as an integer
     */
    private static int inputOption(String message) {

        String indexChoice = "";
        
        do {
            indexChoice = input(message, TITLE);
        } while (indexChoice.equals(""));
        
        int index = Integer.parseInt(indexChoice);

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
     * This method displays the user 'thank you' message.
     */
    private static void thanks() {

        output("Thank you for using the " + TITLE + "!", TITLE);
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
