package chylsymarableminmaxgame;

import javax.swing.JOptionPane;

/*
 * ChylsyMarableMinMaxGame -
    This is a program that generates random integers
    between 1 and 99 and displays them along with the minimum
    and maximum values in the array.
 * 
 * @author Chylsy Marable
 * @since 24-Apr-2023
 */
public class ChylsyMarableMinMaxGame {

    static final String TITLE = "Min/Max Program";

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcome();

        /*
        This is a do while loop that will re execute the program if
        the user selects the 'yes' option in the confirm() method.
         */
        do {
            program();
        } while (confirm() == true);

        thanks();
    }

    /**
     * A method that displays the user welcome message. It uses the output()
     * method to create the JOptionPane.
     */
    private static void welcome() {

        output("Welcome to the " + TITLE + "!", TITLE);
    }

    /**
     * The method that executes the program. It uses the output() method to
     * create the JOptionPane.
     */
    private static void program() {

        int[] randoms = random(1, 99, 10);

        String text = "Here is your random array:"
                + "\n Index 0: " + randoms[0]
                + "\n Index 1: " + randoms[1]
                + "\n Index 2: " + randoms[2]
                + "\n Index 3: " + randoms[3]
                + "\n Index 4: " + randoms[4]
                + "\n Index 5: " + randoms[5]
                + "\n Index 6: " + randoms[6]
                + "\n Index 7: " + randoms[7]
                + "\n Index 8: " + randoms[8]
                + "\n Index 9: " + randoms[9]
                + "\n The minimum number in the array is: " + min(randoms)
                + "\n The maximum number in the array is:  " + max(randoms);

        output(text, TITLE);

    }

    /**
     * The method that fills the randoms array in the program. It calls the
     * random(int low, int high) method to generate the random integers.
     *
     * @param low - The minimum value for the random integers.
     * @param high - The maximum value for the random integers.
     * @param size - The size of the array storing the random integers.
     * @return - Returns a randomly generated integer until the array is filled.
     */
    private static int[] random(int low, int high, int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random(low, high);
        }
        return numbers;
    }

    /**
     * The method that generates the random integers.
     *
     * @param low - The minimum value for the integers.
     * @param high - The maximum value for the integers.
     * @return - Returns a randomly generated integer.
     */
    private static int random(int low, int high) {
        double seed = Math.random();
        double L = (double) low;
        double H = (double) high;
        double number = (H - L + 1) * seed + L;
        return (int) number;
    }

    /**
     * The method that scans the randoms[] array for its lowest value.
     *
     * @param array - The array that the method is going to search through.
     * @return - Returns the lowest value in the array.
     */
    private static int min(int array[]) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }

        return min;
    }

    /**
     * The method that scans the randoms[] array for its highest value.
     *
     * @param array - The array that the method is going to search through.
     * @return - Returns the highest value in the array.
     */
    private static int max(int array[]) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

        }

        return max;

    }

    /**
     * The method that displays the user 'thank you' message. It uses the
     * output() method to create the JOptionPane.
     */
    private static void thanks() {

        output("Thank you for using the " + TITLE + "!", TITLE);
    }

    /**
     * Asks the user if they want to play again.
     *
     * @return - Returns the user's 'yes' response.
     */
    private static boolean confirm() {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to play again?",
                TITLE,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        return confirm == JOptionPane.YES_OPTION;

    }

    /**
     * The method that creates the JOptionPane dialog boxes within the program.
     *
     * @param message - The message of the dialog box.
     * @param title - The title of the program.
     */
    private static void output(String message, String title) {

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE
        );

    }

}
