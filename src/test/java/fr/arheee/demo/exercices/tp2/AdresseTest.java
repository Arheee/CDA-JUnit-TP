package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AdresseTest {
    private Adresse adresse;

    @BeforeEach
    public void setUp() {
        adresse = new Adresse("123", "Rue jean du pont", "75001", "Paris", "France");
    }

    @ParameterizedTest
    @DisplayName("Test de la création d'adresses")
    @CsvSource({
            "123, Rue jean du pont, 75001, Paris, France",
            "456, Avenue des duponts, 75008, Paris, France"
    })
    public void testCreationAdresse(String voie, String rue, String cp, String ville, String pays) {
        adresse.setVoie(voie);
        adresse.setRue(rue);
        adresse.setCp(cp);
        adresse.setVille(ville);
        adresse.setPays(pays);

        assertEquals(voie, adresse.getVoie());
        assertEquals(rue, adresse.getRue());
        assertEquals(cp, adresse.getCp());
        assertEquals(ville, adresse.getVille());
        assertEquals(pays, adresse.getPays());
    }



}