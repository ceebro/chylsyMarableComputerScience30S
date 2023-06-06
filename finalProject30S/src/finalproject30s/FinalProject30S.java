package chylsymarableislandadventure;

import javax.swing.*;

/*
 * ChylsyMarableIslandAdventure
 * 
 * @author Chylsy Marable
 * @since 3-Jun-2023
 */
public class ChylsyMarableIslandAdventure {

    public static final String TITLE = "Island Adventure";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcomeScreen();
        
        do{
        program();
        } while (playAgain() == true);

    }

    public static void welcomeScreen() {

        String message = "Welcome to ";
        output(message + TITLE + "!", TITLE, "island.gif");
    }

    public static void program() {

        if (initialSituation() == true) {

            //runs beach option
            if (beachOption() == true) {

                beachBlock();
            } else {

                stayOnIsland();
                if (jungleOption() == true) {

                    jungleBlock();
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

    public static boolean initialSituation() {

        String[] choices = new String[2];
        choices[0] = "Explore the beach";
        choices[1] = "Explore the jungle";

        int userChoice = userOptions(
            0,
            TextEN.textEN,
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

            rescue();
            //rescue ending
        } else {

            lostAtSea();
            //lost at sea ending
        }
    }

    public static void jungleBlock() {

        if (fightBear() == true) {

            if (inhabitCave() == true) {

                caveEnding();
                //minecraft ending
            } else {

                keepExploring();
                villageBlock();
            }
        }
    }

    public static void villageBlock() {

        if (village() == true) {

            enterVillage();
            //village ending
        } else {

            fatigue();
            //dying of starvation
        }
    }

    public static boolean beachOption() {

        String[] choices = new String[2];
        choices[0] = "Deploy the life raft";
        choices[1] = "Stay on the island";

        int userChoice = userOptions(
            1,
            TextEN.textEN,
            choices,
            "crashedPlane.png"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static boolean jungleOption() {

        String[] choices = new String[2];
        choices[0] = "Enter the cave";
        choices[1] = "Continue walking";

        int userChoice = userOptions(
            6,
            TextEN.textEN,
            choices,
            "darkCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static boolean fishermen() {

        String[] choices = new String[2];
        choices[0] = "Board the fishing boat";
        choices[1] = "Reject their offer";

        int userChoice = userOptions(
            2,
            TextEN.textEN,
            choices,
            "fishermen.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static void stayOnIsland() {

        String message = TextEN.output(3);
        output(message, TITLE, "stayingOnIsland.gif");
    }

    public static void rescue() {

        String message = TextEN.output(5);
        output(message, TITLE, "rescue.gif");
        endingScreen();
        
        playAgain();
    }

    public static void lostAtSea() {

        String message = TextEN.output(4);
        output(message, TITLE, "lostAtSea.jpg");
        endingScreen();
        
        playAgain();

    }

    public static boolean fightBear() {

        String[] choices = new String[2];
        choices[0] = "Fight the bear";
        choices[1] = "Run away";

        int userChoice = userOptions(
            7,
            TextEN.textEN,
            choices,
            "caveBear.jpg"
        );

        if (userChoice == 0) {
            return true;
        }
        return false;
    }

    public static void mauledByBear() {

        String message = TextEN.output(8);
        output(message, TITLE, "bearMauling.");
        endingScreen();
    }

    public static boolean inhabitCave() {

        String[] choices = new String[2];
        choices[0] = "Live in the cave";
        choices[1] = "Continue exploring";

        int userChoice = userOptions(
            9,
            TextEN.textEN,
            choices,
            "lushCave.jpg"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    private static void caveEnding() {

        String message = TextEN.output(10);
        output(message, TITLE, "caveEnding.jpg");

        endingScreen();
        
        playAgain();
    }

    public static void keepExploring() {

        String message = TextEN.output(11);
        output(message, TITLE, "keepExploring.gif");

    }

    public static boolean village() {

        String[] choices = new String[2];
        choices[0] = "Enter the village";
        choices[1] = "Continue exploring";

        int userChoice = userOptions(
            12,
            TextEN.textEN,
            choices,
            "spottedVillage.gif"
        );

        if (userChoice == 0) {
            return true;
        }

        return false;
    }

    public static void enterVillage() {

        String message = TextEN.output(13);
        output(message, TITLE, "villageEnding.gif");

        endingScreen();
        playAgain();
    }

    public static void fatigue() {

        String message = TextEN.output(14);
        output(message, TITLE, "exhausted.gif");

        endingScreen();
        playAgain();
    }
    
    public static boolean playAgain(){
        
        //java.awt.Component parentComponent, java.lang.Object message,
        //java.lang.String title, int optionType, int messageType, Icon icon)
        String message = TextEN.output(15) + "\n" + TextEN.output(16);
        
        int option = JOptionPane.showConfirmDialog(
                null,
                message,
                TITLE,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                "island.jpg"
        );
        
        if(option == JOptionPane.YES_OPTION){
            
            return true;
        }    
        else{
            
            return false;
        }    
    }

    public static void endingScreen() {

        String ending = TextEN.output(15);

        output(ending, TITLE, "island.gif");
    }

    public static int userOptions(int index, String[] text, String[] choices, String fileName) {

        TextEN textEN = new TextEN();

        String message = textEN.output(index);

        ImageIcon icon = new ImageIcon(fileName);

        Object userChoice = JOptionPane.showInputDialog(
                null,
                message,
                TITLE,
                JOptionPane.PLAIN_MESSAGE,
                icon,
                choices,
                choices[0]
        );

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
