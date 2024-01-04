package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    private Salaire salaire;

    @BeforeEach
    public void SetUp(){
        salaire = new Salaire(10);
    }


    /**
     * Test avec plusieurs salaires différent
     * @param heuresTravaillees les heures ... travaillées, eh oui incroyable
     * @param expectedSalaire LA TUUUNE
     */
    @ParameterizedTest
    @CsvSource({
            "40, 400.0",
            "160, 1620.7"
    })
    @DisplayName("Test de salaire avec différentes heures travaillées")
    void testPayer(int heuresTravaillees, double expectedSalaire) {
        double result = salaire.payer(heuresTravaillees);
        assertEquals(expectedSalaire, result, 0.300);
    }

}