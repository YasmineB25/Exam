package yasmine.exam.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TacheControllerTest {

    private GestionTaches gestionTaches;
    private TacheController tacheController;

    @BeforeEach
    public void setUp() {
        gestionTaches = new GestionTaches();
        tacheController = new TacheController(gestionTaches);
    }

    @Test
    public void testGetListeTaches() {
        List<Tache> result = tacheController.getListeTaches();
        assertEquals(0, result.size());
    }

    @Test
    public void testGetTacheParNomExistante() throws TacheInexistanteException {
        gestionTaches.ajouterTache("Tâche 1", "Description", 5);
        Tache result = tacheController.getTacheParNom("Tâche 1");
        assertEquals("Tâche 1", result.getTitre());
    }

    @Test
    public void testGetTacheParNomInexistante() {
        assertThrows(TacheInexistanteException.class, () -> {
            tacheController.getTacheParNom("Tâche Inexistante");
        });
    }
}
