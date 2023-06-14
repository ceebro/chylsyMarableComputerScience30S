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

    public static void welcomeScreen() {

        String message = "Welcome to ";
        String messageFR = "Bienvenue à ";
        output(message + TITLE + "! \n" + messageFR + TITLE + "!",
                TITLE,
                "island.gif"
        );

    }

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

    public static void program() {

        if (initialSituation() == true) {

            //runs beach option
            if (beachOption() == true) {

                beachBlock();
            } else {

                stayOnIsland(sentences);
                if (jungleOption() == true) {

                    jungleBlock();
                } else {

                    keepExploring(sentences);
                    villageBlock();
                }
            }
        } else {

            //runs jungle option
            if (jungleOption() == true) {

                jungleBlock();
            } else {

                keepExploring(sentences);
                villageBlock();
            }
        }
    }

    public static boolean initialSituation() {

        choices[0] = "Explore the beach";
        choices[1] = "Explore the jungle";

        if (sentences == TextFR.textFR) {

            choices[0] = "Explorer la plage";
            choices[1] = "Explorer la jungle";
        }

        int userChoice = userOptions(
                0,
                sentences,
                choices,
                "stranded.gif"
        );

        if (userChoice == 0) {
            return true;
        }
        return false;
    }

    public static void beachBlock() {

        if (fishermen() == true) {

            rescue(sentences);
            //rescue ending
        } else {

            lostAtSea(sentences);
            //lost at sea ending
        }
    }

    public static void jungleBlock() {

        if (fightBear() == true) {

            if (inhabitCave() == true) {

                caveEnding(sentences);
                //minecraft ending
            } else {

                keepExploring(sentences);
                villageBlock();
            }
        } else {

            mauledByBear(sentences);
            //bear mauling ending
            //you can't outrun bears
        }
    }

    public static void villageBlock() {

        if (village() == true) {

            enterVillage(sentences);
            //village ending
        } else {

            fatigue(sentences);
            //dying of starvation
        }
    }

    public static boolean beachOption() {

        choices[0] = "Deploy the life raft";
        choices[1] = "Stay on the island";

        if (sentences == TextFR.textFR) {

            choices[0] = "Utiliser le bateau de sauvetage";
            choices[1] = "Rester sur l'île";
        }

        int userChoice = userOptions(
                1,
                sentences,
                choices,
                "crashedPlane.png"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static boolean jungleOption() {

        choices[0] = "Enter the cave";
        choices[1] = "Continue walking";

        if (sentences == TextFR.textFR) {

            choices[0] = "Entrer la grotte";
            choices[1] = "Continuer de marcher";
        }

        int userChoice = userOptions(
                6,
                sentences,
                choices,
                "darkCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static boolean fishermen() {

        choices[0] = "Board the fishing boat";
        choices[1] = "Reject their offer";

        if (sentences == TextFR.textFR) {

            choices[0] = "Embarquer le bateau";
            choices[1] = "Refuser l'offre";
        }

        int userChoice = userOptions(
                2,
                sentences,
                choices,
                "fishermen.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static void stayOnIsland(String[] text) {

        text = sentences;
        String message = text[3];
        output(message, TITLE, "stayingOnIsland.gif");
    }

    public static void rescue(String[] text) {

        text = sentences;
        String message = text[5];
        output(message, TITLE, "rescue.gif");
    }

    public static void lostAtSea(String[] text) {

        text = sentences;
        String message = text[4];
        output(message, TITLE, "lostAtSea.jpg");
    }

    public static boolean fightBear() {

        choices[0] = "Fight the bear";
        choices[1] = "Run away";

        if (sentences == TextFR.textFR) {

            choices[0] = "Combattre l;ours";
            choices[1] = "S'en fuir";
        }

        int userChoice = userOptions(
                7,
                sentences,
                choices,
                "caveBear.jpg"
        );

        if (userChoice == 0) {
            return true;
        }
        return false;
    }

    public static void mauledByBear(String[] text) {

        String message = sentences[8];
        output(message, TITLE, "bearMauling.gif");
    }

    public static boolean inhabitCave() {

        choices[0] = "Live in the cave";
        choices[1] = "Continue exploring";

        if (sentences == TextFR.textFR) {

            choices[0] = "Vivre dans la grotte";
            choices[1] = "Continuer d'explorer";
        }

        int userChoice = userOptions(
                9,
                sentences,
                choices,
                "lushCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    private static void caveEnding(String[] text) {

        text = sentences;
        String message = text[10];
        output(message, TITLE, "caveEnding.jpg");
    }

    public static void keepExploring(String[] text) {

        text = sentences;
        String message = text[11];
        output(message, TITLE, "keepExploring.gif");

    }

    public static boolean village() {

        choices[0] = "Enter the village";
        choices[1] = "Continue exploring";

        if (sentences == TextFR.textFR) {

            choices[0] = "Entrer le village";
            choices[1] = "Continuer d'explorer";
        }

        int userChoice = userOptions(
                12,
                sentences,
                choices,
                "spottedVillage.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static void enterVillage(String[] text) {

        text = sentences;
        String message = text[13];
        output(message, TITLE, "villageEnding.gif");
    }

    public static void fatigue(String[] text) {

        text = sentences;
        String message = text[14];
        output(message, TITLE, "exhausted.gif");
    }

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

    public static void endingScreen() {

        String ending = sentences[15];

        output(ending, TITLE, "island.gif");
    }

    public static int userOptions(int index, String[] text, String[] choices, String fileName) {

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

    public static void output(String message, String title, String fileName) {

        ImageIcon icon = new ImageIcon(fileName);

        JOptionPane.showMessageDialog(
                null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE,
                icon
        );

    }

}
