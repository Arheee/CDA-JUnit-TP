package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TtcTest {

    private Ttc htToTtc;

    /**
     * Creer une instance Ttc avant chaque test
     */
    @BeforeEach
    public void setUp(){
        htToTtc = new Ttc();
    }


    @Test
    @DisplayName("Test un usage normal de la méthode : un prix HT positif")
    public void testPrixHtToTtc() {
        //Arrange
        int prixHt = 40;

        //Act
        double result = htToTtc.HtToTtc(prixHt);

        // Assert
        assertEquals(48.0, result); // 40 * 1.20 = 48
    }

    /**
     * Test de la methode avec plusieurs prix HT
     * @param prixHt = les différents prix HT
     */
    @ParameterizedTest
    @ValueSource(ints = { 40, 50, 60 })
    public void testPrixHtToTtcAvecParametres(int prixHt) {
        // Act
        double result = htToTtc.HtToTtc(prixHt);

        // Calcul du prix TTC depuis le prixHt
        double CalculerAvecTva = prixHt * 1.20;

        // Assert
        assertEquals(CalculerAvecTva, result);
    }


    @Test
    @DisplayName("Est un prix HT négatif")
    public void testPrixHtNegatif() {
        // Arrange
        int prixHtNegatif = -10;

        // Assert
        assertThrows(IllegalArgumentException.class, () -> htToTtc.HtToTtc(prixHtNegatif));
    }


    @Test
    @DisplayName("Est un prix HT null")
    public void testPrixHtNul() {
        // Arrange
        int prixHtNul = 0;

        // Act
        double result = htToTtc.HtToTtc(prixHtNul);

        // Assert
        assertEquals(0, result);
    }


}