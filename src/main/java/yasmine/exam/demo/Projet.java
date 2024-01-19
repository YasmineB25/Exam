package yasmine.exam.demo;

import java.util.ArrayList;
import java.util.List;

public class Projet {

    private String nom;
    private GestionTaches gestionTaches;
    private List<Tache> taches;

    public Projet(String nom, GestionTaches gestionTaches) {
        this.nom = nom;
        this.gestionTaches = gestionTaches;
        this.taches = new ArrayList<>();
    }

    public void ajouterTache(String titre, String description, int duree) throws TacheInexistanteException {
        Tache nouvelleTache = new Tache(titre, description, duree);
        taches.add(nouvelleTache);
        gestionTaches.ajouterTache(titre, description, duree);
    }

    public List<Tache> getTaches() {
        return taches;
    }

}

