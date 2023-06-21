
package chylsymarableislandadventure;

/*
 * TextFR - French text in 'Island Adventure'
 * 
 * @author Chylsy Marable
 * @since 3-Jun-2023
*/
public class TextFR {
    
    public static String[] textFR;
    
    /**
     * Fills the textFR[] array
     */
    public static void build(){
        
        textFR = new String [17];
        
        //<editor-fold>
        
        textFR[0] = "   Après un accident de bateau, vous arrivez sur une île "
                + "\n mystérieuse. Vous avez besoin de collecter des ressources."
                + "\n Vous avez le choix d’explorer la plage ou la jungle. Lequel"
                + "\n explorez-vous?";
        //initial situation
        
        textFR[1] = "   Vous marchez à côté de la plage et vous trouvez un avion"
                + "\n détruit. Dedans, il y a des outils ainsi qu’un bateau de "
                + "\n sauvetage. Voulez-vous l’utiliser ou rester sur l’île?";
        
        textFR[2] = "   Vous quittez l’île en utilisant le bateau de sauvetage."
                + "\n Vous flottez dans l’océan et, un jour un bateau des pêcheurs"
                + "\n vous trouvez. Acceptez-vous leur offre de vous sauver?";
        
        textFR[3] = "   Vous choisissez de rester sur l’île, potentiellement pour"
                + "\n toujours. Au lieu d’explorer la plage, vous allez dans la "
                + "\n jungle pour l’explorer. ";
        //program jumps to jungle option

        textFR[4] = "   Vous dépensez vos jours en flottant sur la mer. Vous avez"
                + "\n faim et fatigué. Éventuellement, vouz mourez dans l'océan.";
        //ocean ending
        
        textFR[5] = "   Les pêcheurs vous donnent de la nourriture et de la protection."
                + "\n Éventuellement, vous retournez à la société.";
        //society ending
        
        textFR[6] = "   Pendant que vous marchez dans la jungle, vous trouvez une"
                + "\n grotte. Il est sombre et mouillé. Voulez-vous l'explorer?";
        
        textFR[7] = "   Il y a un ours dans la grotte! Il se sent fâché à votre arrivé. "
                + "\n Vous pouvez le combattre ou s'en fuir. Lequel choisissez-vous?";
        
        textFR[8] = "   L'ours vous attrapez. Il vous attaque et vous mourez de vos blessures.";
        //mauling ending

        textFR[9] = "   Par miracle, l'ours s'en fuit de la grotte. Vous pouvez"
                + "\n maintenant s'habiter dans la grotte ou continuer votre"
                + "\n voyage.";
        //minecraft ending

        textFR[10] = "  Vous creez votre propre habitat dans la grotte. Vous"
                + "\n continuez le restant de votre vie  dans la grotte. Éventuellement,"
                + "\n vous mourez sur l'île, heureux et en sécurité.";
        
        textFR[11] = "  Vous continuez votre voyage en explorant l'île plus fortement.";
        //program jumps to village option

        textFR[12] = "  En explorant la jungle, vous trouvez un village. Voulez-vous"
                + "\n l'entrer ou continuer la voyage?";
        
        textFR[13] = "  Vous décidez d'entrer le village. Au début, les habitants"
                + "\n du village s'inquietent de vous. Mais avec du temps, vous"
                + "\n intégrez avec leur communauté comme un autre villageois.";
        //minecraft village ending

        textFR[14] = "  Votre voyage en marchant insensément arrête avec votre décès."
                + "\n Vous mourez sur l'île avec un corps épuisé et affamé.";
        //starvation ending

        textFR[15] = "Merci pour avoir joué Island Adventure!";
        
        textFR[16] = "Voulez-vous jouer encore?";

        //</editor-fold>
        
    }
}
