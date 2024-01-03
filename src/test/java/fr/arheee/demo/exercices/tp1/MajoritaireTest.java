package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajoritaireTest {

    private Majoritaire majoritaire;

    @BeforeEach
    public void setUp(){majoritaire = new Majoritaire();}

    @Test
    @DisplayName("Test un usage normal de la méthode : un tableau avec un nombre majoritaire")
    public void testTableauAvecUnNombreMajoritaire(){
        int[] nombres = {1, 2, 4, 3, 2, 2, 2, 2};
        int result = majoritaire.hashMap(nombres);
        assertEquals(2, result);
    }
    @Test
    @DisplayName("Test un usage normal de la méthode : un tableau sans nombre majoritaire")
    public void testTableauSansUnNombreMajoritaire(){
        int[] nombres = {1, 2, 4, 3, 2};
        int result = majoritaire.hashMap(nombres);
        assertEquals(0, result);
    }
}