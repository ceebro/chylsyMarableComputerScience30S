package chylsymarableislandadventure;

import java.util.Arrays;
import javax.swing.*;

/*
 * ChylsyMarableIslandAdventure -
 * A 'choose your own adventure' program that is powered by JOptionPanes.
 * 
 * @author Chylsy Marable
 * @since 3-Jun-2023
 */
public class ChylsyMarableIslandAdventure {

    public static final String TITLE = "Island Adventure";
    
//    private static String[] sentences;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        welcomeScreen();
        
        do{
        program();
        } while (playAgain() == true);
        
        endingScreen();
    }

    public static String[] welcomeScreen() {

        String message = "Welcome to ";
        output(message + TITLE + "!", TITLE, "island.gif");
        
        String[] language = new String[2];
        language[0] = "English / EN";
        language[1] = "Français / FR";
        
        ImageIcon icon = new ImageIcon("island.gif");
        
        String selectLanguage = "Please select the story language"
                + "\n Choisissez la langue";
      
        Object languageChoice;

        do{
        
        languageChoice = JOptionPane.showInputDialog(
                null,
                selectLanguage,
                TITLE, 
                JOptionPane.PLAIN_MESSAGE,
                icon, 
                language, 
                language[0]);
        
        } while (languageChoice == null);
        
        if(languageChoice == language[0]){
            
            return TextEN.textEN;
        }
        else{
            
            return TextFR.textFR;
        }    
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
        } else  {

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
        else{
            
            mauledByBear();
            //bear mauling ending
            //you can't outrun bears
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
    }
    
    public static void lostAtSea() {

        String message = TextEN.output(4);
        output(message, TITLE, "lostAtSea.jpg");
    }

    public static boolean fightBear() {

        String[] choices = new String[2];
        choices[0] = "Fight the bear";
        choices[1] = "Run away";

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

    public static void mauledByBear() {

        String message = TextEN.output(8);
        output(message, TITLE, "bearMauling.gif");
    }

    public static boolean inhabitCave() {

        String[] choices = new String[2];
        choices[0] = "Live in the cave";
        choices[1] = "Continue exploring";

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

    private static void caveEnding() {

        String message = TextEN.output(10);
        output(message, TITLE, "caveEnding.jpg");
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
    }

    public static void fatigue() {

        String message = TextEN.output(14);
        output(message, TITLE, "exhausted.gif");
    }
    
    public static boolean playAgain(){
        
        String message = TextEN.output(15) + "\n" + TextEN.output(16);
        
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
        
        } while(option == -1);
        
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

    public static int userOptions(int index, String[] choices, String fileName) {

        String message;
        
        if(welcomeScreen() == TextEN.textEN){
            
            message = TextEN.output(index);
        } else {
            
            message = TextFR.output(index);
        }

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

        } while(userChoice == null);
        
        
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