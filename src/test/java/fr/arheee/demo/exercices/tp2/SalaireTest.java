package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    private Salaire salaire;

    @BeforeEach
    public void SetUp(){
        salaire = new Salaire(10);
    }

    @Test
    @DisplayName("Test de salaire avec des heures normales")
    void testPayerAvecHeuresNormales() {
        double result = salaire.payer(40);
        assertEquals(400.0, result);
    }
    @Test
    @DisplayName("Test pour partir aux maldives avec pleins de tune ")
    void testPayerAvecHeuresSupplementaires() {
        double resultat = salaire.payer(160);
        assertEquals(1620.7, resultat, 0.300);
    }

}