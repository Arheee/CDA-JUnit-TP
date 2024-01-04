package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IdentiteTest {

    private Identite identite;
    private Adresse adresse;

    @BeforeEach
    public void setUp(){
        adresse = new Adresse("123"," rue jean du pont","75001","Paris","France");
        identite = new Identite("Dupont","Jean", adresse);
    }


    /**
     * Test paramétrés pour changer d'adresse
     * @param voie le numéro
     * @param rue le pays .. non j'rigole cest la rue
     * @param cp le code postal
     * @param ville la ville
     * @param pays le pays
     */
    @ParameterizedTest
    @DisplayName("Test paramétré de changement d'adresse ")
    @CsvSource({
            "456, rue jean du grand pont, 75001, Paris, France",
            "789, avenue des duponts, 75008, Paris, France"
    })
    void testChangementAdresse(String voie, String rue, String cp, String ville, String pays) {
        Adresse result = new Adresse(voie, rue, cp, ville, pays);
        identite.setAdresse(result);

        assertEquals(result, identite.getAdresse());
    }

}