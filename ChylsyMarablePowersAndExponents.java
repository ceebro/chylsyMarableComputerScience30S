
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
