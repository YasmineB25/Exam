package yasmine.exam.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GestionTachesTest {

    private GestionTaches gestionTaches;

    @BeforeEach
    public void setUp() {
        gestionTaches = new GestionTaches();
    }

    @Test
    public void testAjouterTache() throws TacheInexistanteException {
        gestionTaches.ajouterTache("Tâche 1", "Description de la tâche 1", 5);
        gestionTaches.completerTache("Tâche 1"); 
        assertTrue(gestionTaches.verifierTache("Tâche 1"));
    }

    @Test
    public void testCompleterTacheExistante()throws TacheInexistanteException {
        gestionTaches.ajouterTache("Tâche 2", "Description de la tâche 2", 5);
        gestionTaches.completerTache("Tâche 2");
        assertTrue(gestionTaches.verifierTache("Tâche 2"));
    }

    @Test
    public void testCompleterTacheInexistante()throws TacheInexistanteException {
        assertThrows(TacheInexistanteException.class, () -> {
            gestionTaches.completerTache("Tâche Inexistante");
        });
    }

    @Test
    public void testVerifierTacheExistante()throws TacheInexistanteException {
        gestionTaches.ajouterTache("Tâche 3", "Description de la tâche 3", 20);
        assertFalse(gestionTaches.verifierTache("Tâche 3"));
    }

    @Test
    public void testVerifierTacheInexistante() {
        assertThrows(TacheInexistanteException.class, () -> {
            gestionTaches.verifierTache("Tâche Inexistante");
        });
    }
}
