
package chylsymarableislandadventure;

/**
 *
 * @author c.marable
 */
public class TextFR {
    
    public static String[] textFR;
    
    public TextFR(){
        
        textFR = new String [17];
        
        //<editor-fold>
        
        textFR[0] = "   Après un accident de bateau, vous arrivez sur une île "
                + "\n mystérieuse. Vous avez besoin de collecter des ressources."
                + "\n Vous avez le choix d’explorer la plage ou la jungle. Lequel"
                + "\n choisissez-vous?";
        //sit initiale
        
        textFR[1] = "   Vous marchez à côté de la plage et vous trouvez un avion"
                + "\n détruit. Dedans, il y a des outils ainsi qu’un bateau de "
                + "\n sauvetage. Voulez-vous l’utiliser ou rester sur l’île?";
        
        textFR[2] = "   Vous quittez l’île en utilisant le bateau de sauvetage."
                + "\n Vous flottez dans l’océan et, un jour un bateau des pêcheurs"
                + "\n vous découvertes. Acceptez-vous leur offre de vous sauver?";
        
        textFR[3] = "   Vous choisissez de rester sur l’île, potentiellement pour"
                + "\n toujours. Au lieu d’explorer la plage, vous allez dans la "
                + "\n jungle pour l’explorer. ";
        textFR[4] = "";
        textFR[5] = "";
        textFR[6] = "";
        textFR[7] = "";
        textFR[8] = "";
        textFR[9] = "";
        textFR[10] = "";
        textFR[11] = "";
        textFR[12] = "";
        textFR[13] = "";
        textFR[14] = "";
        textFR[15] = "";
        textFR[16] = "";

        //</editor-fold>

    }
    
     public static String output(int index){
        
        return textFR[index];
    }

}