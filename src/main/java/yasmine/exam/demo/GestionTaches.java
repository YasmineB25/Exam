package yasmine.exam.demo;

import java.util.ArrayList;
import java.util.List;

public class GestionTaches {

    private List<Tache> listeTaches;

    public GestionTaches() {
        this.listeTaches = new ArrayList<>();
    }

    public void ajouterTache(String titre, String description, int duree) {
        Tache nouvelleTache = new Tache(titre, description, duree);
        listeTaches.add(nouvelleTache);
    }

    public void completerTache(String titre) throws TacheInexistanteException {
        Tache tache = trouverTacheParTitre(titre);
        tache.setComplete(true);
    }

    public boolean verifierTache(String titre) throws TacheInexistanteException {
        Tache tache = trouverTacheParTitre(titre);
        return tache.isComplete();
    }

    public List<Tache> getListeTaches() {
        return listeTaches;
    }

    public Tache getTacheParNom(String nomTache) throws TacheInexistanteException {
        for (Tache tache : listeTaches) {
            if (tache.getTitre().equals(nomTache)) {
                return tache;
            }
        }
        throw new TacheInexistanteException("La tâche avec le nom '" + nomTache + "' n'existe pas.");
    }
    private Tache trouverTacheParTitre(String titre) throws TacheInexistanteException {
        for (Tache tache : listeTaches) {
            if (tache.getTitre().equals(titre)) {
                return tache;
            }
        }
        throw new TacheInexistanteException("La tâche avec le titre '" + titre + "' n'existe pas.");
    }
}

