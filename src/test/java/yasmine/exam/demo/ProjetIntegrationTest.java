package yasmine.exam.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProjetIntegrationTest {

    private Projet projet;
    private GestionTaches gestionTaches;

    @BeforeEach
    public void setUp() {
        gestionTaches = new GestionTaches();
        projet = new Projet("Projet Test", gestionTaches);
    }

    @Test
    public void testAjouterTacheAuProjet() throws TacheInexistanteException {
        projet.ajouterTache("Tâche 1", "Description de la tâche 1", 5);
        
        // verifier si la tache a été ajoutée dans le projet
        List<Tache> tachesProjet = projet.getTaches();
        assertEquals(1, tachesProjet.size());
        assertEquals("Tâche 1", tachesProjet.get(0).getTitre());

        // verifier si la tache a été ajoutée dans la classe GestionTaches
        List<Tache> tachesGestionTaches = gestionTaches.getListeTaches();
        assertEquals(1, tachesGestionTaches.size());
        assertEquals("Tâche 1", tachesGestionTaches.get(0).getTitre());
    }

   
}
