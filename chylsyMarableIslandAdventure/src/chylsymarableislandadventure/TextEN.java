
package chylsymarableislandadventure;

/*
 * TextEN - English text in 'Island Adventure'
 * 
 * @author Chylsy Marable
 * @since 3-Jun-2023
*/
public class TextEN {
    
    public static String[] textEN;
    
    /**
     * Fills the textEN[] array
     */
    public static void build() {
        
        textEN = new String[17];
        
        // <editor-fold>
        
        textEN[0] = "       After a boating accident, you are left stranded on a "
                + "\n tropical island in the middle of the ocean. You are on the"
                + "\n shore and in need of supplies to survive. Do you explore "
                + "\n more of the beach, or do you venture into the treacherous "
                + "\n jungle?";
        //initial situation
        
        textEN[1] = "       Walking along the shoreline has led you to an abandoned"
                + "\n airplane. Inside, you find supplies as well as an emergency"
                + "\n life raft. Do you deploy the raft out to sea, or do you stay"
                + "\n on the island and keep exploring?";
        textEN[2] = "   You set out to sea using the life raft. You spend days out at sea,"
                + "\n hungry and alone. One day, you encounter a fishing boat. "
                + "\n They are willing to take you on deck. Do you accept their "
                + "\n offer or stay on the raft?";
        
        textEN[3] = "       You choose to stay on the island, potentially forever. "
                + "\n You return to the beach, and you decide to explore the"
                + "\n jungle instead.";
        //program jumps to jungle option
        
        textEN[4] = "       You spend your final days drifting along the vast ocean. "
                + "\n You are hungry and alone. In the end, you die of starvation"
                + "\n on the open sea.";
        //ocean ending
        
        textEN[5] = "       You spend a few days with the fishermen. Your fatigue and "
                + "\n hunger are replenished and eventually, you return to "
                + "\n modern civilization.";
        //society ending
        
        textEN[6] = "       Walking through the lush jungle has led you to a large cave."
                + "\n It is damp and dark. Do you enter, or do you keep walking?";
        textEN[7] = "       In the cave, you find a single bear. It reacts violently "
                + "\n to your arrival. Do you try defending yourself or run away?";
        
        textEN[8] = "       The bear quickly catches up to you and you suffer a brutal "
                + "\n mauling. You die of your injuries.";
        //mauling ending
        
        textEN[9] = "       Miraculously, you scare the bear off. He abandons his "
                + "\n habitat in the cave. Do you seize it for yourself, "
                + "\n or do you keep exploring?";
        
        textEN[10] = "      You make your own habitat out of the abandoned cave. You "
                + "\n live off the land, farming and foraging. You eventually "
                + "\n die on the island, warm and secure.";
        //minecraft ending
        
        textEN[11] = "      You walk away from the cave and decide to keep exploring"
                + "\n the island.";
        //program jumps to village option
        
        textEN[12] = "      Exploring the jungle has led you to a settlement. Do you "
                + "\n enter this village, or do you walk away?";
        
        textEN[13] = "      You decide to enter the village. Initially, the inhabitants"
                + "\n are cautious of you, but soon come to accept your presence."
                + "\n You learn to speak their language and eventually fully "
                + "\n integrate into their society.";
        //minecraft village ending
        
        textEN[14] = "      You wander senselessly through the jungle for days. Your "
                + "\n body is exhausted, and you are starving. Eventually, you "
                + "\n die of malnourishment.";
        //starvation ending
        
        textEN[15] = "Thank you for playing Island Adventure!";
        
        textEN[16] = "Do you want to play again?";
        
        // </editor-fold>
        
    }
}
