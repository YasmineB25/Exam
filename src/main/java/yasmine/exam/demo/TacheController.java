package yasmine.exam.demo;


import java.util.List;

public class TacheController {

    private GestionTaches gestionTaches;

    public TacheController(GestionTaches gestionTaches) {
        this.gestionTaches = gestionTaches;
    }

    public List<Tache> getListeTaches() {
        return gestionTaches.getListeTaches();
    }

    public Tache getTacheParNom(String nomTache) throws TacheInexistanteException {
        return gestionTaches.getTacheParNom(nomTache);
    }
}
