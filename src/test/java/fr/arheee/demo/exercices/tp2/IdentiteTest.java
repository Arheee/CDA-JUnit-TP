package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentiteTest {

    private Identite identite;
    private Adresse adresse;

    @BeforeEach
    public void setUp(){
        adresse = new Adresse("123"," rue jean du pont","75001","Paris","France");
        identite = new Identite("Dupont","Jean", adresse);
    }

    @Test
    void testChangementAdresse() {
        Adresse result = new Adresse("456", "rue jean du grand pont", "75001", "Paris", "France");
        identite.setAdresse(result);

        assertEquals(result, identite.getAdresse());
    }

}