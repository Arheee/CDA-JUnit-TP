package fr.arheee.demo.exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class IdentiteTest {

    private Identite identite;

    @Mock
    private Adresse adresseMock;
    @BeforeEach
    public void setUp(){
        identite = new Identite("Dupont","Jean", adresseMock);
    }


    @Test
    @DisplayName("Test paramétré de changement d'adresse ")
    void testChangementAdresse() {
        Adresse nouvelleAdresseMock = mock(Adresse.class);
        identite.setAdresse(nouvelleAdresseMock);
        assertEquals(nouvelleAdresseMock, identite.getAdresse());
    }

}