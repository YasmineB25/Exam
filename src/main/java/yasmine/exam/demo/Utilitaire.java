package yasmine.exam.demo;

import java.util.List;

public class Utilitaire {

    public static int calculerDureeTotale(List<Tache> taches) {
        int dureeTotale = 0;

        for (Tache tache : taches) {
            // Ignorer les tâches avec des durées négatives
            if (tache.getDuree() >= 0) {
                dureeTotale += tache.getDuree();
            }
        }

        return dureeTotale;
    }

    

}
