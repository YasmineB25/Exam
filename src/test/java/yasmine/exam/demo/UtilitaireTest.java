package yasmine.exam.demo;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UtilitaireTest {

    @Test
    public void testCalculerDureeTotaleAvecListeVide() {
        List<Tache> taches = new ArrayList<>();
        int resultat = Utilitaire.calculerDureeTotale(taches);
        assertEquals(0, resultat);
    }

    @Test
    public void testCalculerDureeTotaleAvecTachesPositives(){
        List<Tache> taches = new ArrayList<>();
        taches.add(new Tache("Tâche 1", "Description", 5));
        taches.add(new Tache("Tâche 2", "Description", 8));
        taches.add(new Tache("Tâche 3", "Description", 3));

        int resultat = Utilitaire.calculerDureeTotale(taches);
        assertEquals(16, resultat);
    }

    @Test
    public void testCalculerDureeTotaleAvecTachesNegatives(){
        List<Tache> taches = new ArrayList<>();
        taches.add(new Tache("Tâche 1", "Description", -5));
        taches.add(new Tache("Tâche 2", "Description", 8));
        taches.add(new Tache("Tâche 3", "Description", 3));

        
        //la tache avec une duree négative doit étre ignorée
        int resultat = Utilitaire.calculerDureeTotale(taches);
        assertEquals(11, resultat);
    
    }

}
