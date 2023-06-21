package chylsymarableislandadventure;

import javax.swing.*;

/*
 * ChylsyMarableIslandAdventure -
 * A 'choose your own adventure' program powered by JOptionPanes.
 * 
 * @author Chylsy Marable
 * @since 3-Jun-2023
 */
public class ChylsyMarableIslandAdventure {

    public static final String TITLE = "Island Adventure";
    public static String[] sentences;
    public static String[] choices = new String[2];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TextEN.build();
        TextFR.build();

        welcomeScreen();

        do {

            language();
            program();
        } while (playAgain() == true);

        endingScreen();
    }

    /**
     * Displays the welcome screen
     */
    public static void welcomeScreen() {

        String welcome = "Welcome to ";
        String welcomeFR = "Bienvenue à ";
        String welcomeMessage = welcome = welcome + TITLE + "! \n" + welcomeFR + TITLE + "!";

        output(welcomeMessage, "island.gif"
        );

    }

    /**
     * Asks users to set the story language
     *
     * @return - returns array of text (the TextEN and TextFR are instantiated
     * in the main method; they fill the sentences array0
     */
    public static String[] language() {

        String[] language = new String[2];
        language[0] = "English / EN";
        language[1] = "Français / FR";

        ImageIcon icon = new ImageIcon("island.gif");

        String selectLanguage = "Select the story language"
                + "\n Choisissez la langue";

        Object languageChoice;

        do {

            languageChoice = JOptionPane.showInputDialog(
                    null,
                    selectLanguage,
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    language,
                    language[0]);

        } while (languageChoice == null);

        String choice = languageChoice.toString();

        if (choice.equals(language[0])) {

            sentences = TextEN.textEN;
            return sentences;
        } else {

            sentences = TextFR.textFR;
            return sentences;
        }

    }

    /**
     * The story method Will proceed if the methods below equal true / the user
     * selected choices[0]
     */
    public static void program() {

        if (initialSituation() == true) {

            //runs beach option
            if (beachOption() == true) {

                beachBlock();
            } else {

                stayOnIsland();
                if (jungleOption() == true) {

                    jungleBlock();
                    //program jumps to jungle

                } else {

                    keepExploring();
                    villageBlock();
                }
            }
        } else {

            //runs jungle option
            if (jungleOption() == true) {

                jungleBlock();
            } else {

                keepExploring();
                villageBlock();
            }
        }
    }

    /**
     * Initial situation (the user starts on the island's shore)
     *
     * @return - returns true or false (true will run the beach options, false
     * will run jungle)
     */
    public static boolean initialSituation() {

        choices[0] = "Explore the beach";
        choices[1] = "Explore the jungle";

        if (sentences == TextFR.textFR) {

            choices[0] = "Explorer la plage";
            choices[1] = "Explorer la jungle";
        }

        int userChoice = userOptions(
                0,
                choices,
                "stranded.gif"
        );

        if (userChoice == 0) {
            return true;
        }
        return false;
    }

    /**
     * Potential endings for the beach block
     */
    public static void beachBlock() {

        if (fishermen() == true) {

            rescue();
            //rescue ending
        } else {

            lostAtSea();
            //lost at sea ending
        }
    }

    /**
     * Endings for jungle block except for when the user continues exploring
     * (will run village block)
     */
    public static void jungleBlock() {

        if (fightBear() == true) {

            if (inhabitCave() == true) {

                caveEnding();
                //minecraft ending (user lives in cave and plays minecraft 
                //in real life)
            } else {

                keepExploring();
                villageBlock();
                //program jumps to village
            }
        } else {

            mauledByBear();
            //bear mauling ending
            //you can't outrun bears
        }
    }

    /**
     * Endings for village block
     */
    public static void villageBlock() {

        if (village() == true) {

            enterVillage();
            //village ending
        } else {

            fatigue();
            //dying of starvation because the user kept exploring
        }
    }

    /**
     * Prompts the user to decide wether to stay on the island or deploy the
     * life raft
     *
     * @return - returns true or false
     */
    public static boolean beachOption() {

        choices[0] = "Deploy the life raft";
        choices[1] = "Stay on the island";

        if (sentences == TextFR.textFR) {

            choices[0] = "Utiliser le bateau de sauvetage";
            choices[1] = "Rester sur l'île";
        }

        int userChoice = userOptions(
                1,
                choices,
                "crashedPlane.png"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    /**
     * Prompts the user to decide between entering the cave or continue walking
     *
     * @return - returns true or false
     */
    public static boolean jungleOption() {

        choices[0] = "Enter the cave";
        choices[1] = "Continue walking";

        if (sentences == TextFR.textFR) {

            choices[0] = "Entrer la grotte";
            choices[1] = "Continuer de marcher";
        }

        int userChoice = userOptions(
                6,
                choices,
                "darkCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    /**
     * Prompts the user to decide between boarding the fishing boat or to keep
     * floating out at sea
     *
     * @return - returns true or false
     */
    public static boolean fishermen() {

        choices[0] = "Board the fishing boat";
        choices[1] = "Reject their offer";

        if (sentences == TextFR.textFR) {

            choices[0] = "Embarquer le bateau";
            choices[1] = "Refuser l'offre";
        }

        int userChoice = userOptions(
                2,
                choices,
                "fishermen.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    /**
     * Outputs a message dialog (confirms the user's choice to stay on the
     * island)
     */
    public static void stayOnIsland() {

        String message = sentences[3];
        output(message, "stayingOnIsland.gif");
        //program will jump to jungle option
    }

    /**
     * Outputs a message dialog (user returns to society)
     */
    public static void rescue() {

        //rescue ending
        String message = sentences[5];
        output(message, "rescue.gif");
    }

    /**
     * Outputs a message dialog (user is lost at sea)
     */
    public static void lostAtSea() {

        //lost at sea ending
        String message = sentences[4];
        output(message, "lostAtSea.jpg");
    }

    /**
     * Prompts the user to fight the bear or run away
     *
     * @return - returns true or false
     */
    public static boolean fightBear() {

        choices[0] = "Fight the bear";
        choices[1] = "Run away";

        if (sentences == TextFR.textFR) {

            choices[0] = "Combattre l'ours";
            choices[1] = "S'en fuir";
        }

        int userChoice = userOptions(
                7,
                choices,
                "caveBear.jpg"
        );

        if (userChoice == 0) {
            return true;
        }
        return false;
    }

    /**
     * Outputs a message dialog (user is mauled by bear)
     */
    public static void mauledByBear() {

        //bear mauling ending
        String message = sentences[8];
        output(message, "bearMauling.gif");
    }

    /**
     * Prompts the user to choose between occupying the cave or continue
     * exploring
     *
     * @return - returns true or false
     */
    public static boolean inhabitCave() {

        choices[0] = "Live in the cave";
        choices[1] = "Continue exploring";

        if (sentences == TextFR.textFR) {

            choices[0] = "Vivre dans la grotte";
            choices[1] = "Continuer d'explorer";
        }

        int userChoice = userOptions(
                9,
                choices,
                "lushCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    /**
     * Outputs a message dialog (user chooses to live in the cave)
     */
    private static void caveEnding() {

        //minecraft ending yayy
        String message = sentences[10];
        output(message, "caveEnding.jpg");
    }

    /**
     * Outputs a message dialog (confirms the user's choice to keep exploring)
     */
    public static void keepExploring() {

        String message = sentences[11];
        output(message, "keepExploring.gif");
        //program jumps to village option
    }

    /**
     * Prompts the user to choose between entering the village or walking away
     *
     * @return - returns true or false
     */
    public static boolean village() {

        choices[0] = "Enter the village";
        choices[1] = "Continue exploring";

        if (sentences == TextFR.textFR) {

            choices[0] = "Entrer le village";
            choices[1] = "Continuer d'explorer";
        }

        int userChoice = userOptions(
                12,
                choices,
                "spottedVillage.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    /**
     * Outputs a message dialog (the user becomes part of the village)
     */
    public static void enterVillage() {

        String message = sentences[13];
        output(message, "villageEnding.gif");
    }

    /**
     * Outputs a message dialog (the user dies of exhaustion)
     */
    public static void fatigue() {

        //fatigue ending
        String message = sentences[14];
        output(message, "exhausted.gif");
    }

    /**
     * Asks the user if they want to play again
     *
     * @return - returns true or false
     */
    public static boolean playAgain() {

        String message = sentences[15] + "\n" + sentences[16];

        ImageIcon icon = new ImageIcon("playAgain.gif");

        int option;

        do {

            option = JOptionPane.showConfirmDialog(
                    null,
                    message,
                    TITLE,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    icon
            );

        } while (option == -1);

        if (option == JOptionPane.YES_OPTION) {

            return true;
        } else {

            return false;
        }
    }

    /**
     *
     */
    public static void endingScreen() {

        String thanks = "Thank you for playing ";
        String thanksFR = "Merci pour avoir joué ";
        String endingMessage = thanks + TITLE + "!" + "\n" + thanksFR + TITLE + "!";

        output(endingMessage, "island.gif");
    }

    /**
     * This method displays the user choice dialog boxes (where the user is
     * prompted two options)
     *
     * @param index - the index of the array
     * @param choices - the user's choices (defined in the methods userOptions()
     * is called in)
     * @param fileName - the name of the image file
     * @return - returns an integer
     */
    public static int userOptions(int index, String[] choices, String fileName) {

        String message = sentences[index];

        ImageIcon icon = new ImageIcon(fileName);

        Object userChoice;

        do {

            userChoice = JOptionPane.showInputDialog(
                    null,
                    message,
                    TITLE,
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    choices,
                    choices[0]
            );

        } while (userChoice == null);

        if (userChoice == choices[0]) {
            return 0;
        }

        return 1;
    }

    /**
     * This method outputs the message dialog boxes in the program
     *
     * @param message - the message of the dialog box
     * @param fileName - the name of the image file
     */
    public static void output(String message, String fileName) {

        ImageIcon icon = new ImageIcon(fileName);

        JOptionPane.showMessageDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                icon
        );

    }

}
