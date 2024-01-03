package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {
    private Doublon doublon;
    @BeforeEach
    public void setUp(){doublon = new Doublon();}

    @Test
    @DisplayName("Test avec usage normal de la méthode : un tableau avec un doublon")
    public void testTableauAvecUnDoublon(){
        int[] nombres = {12, 3, 45, 12};
        boolean result = doublon.verifierSiDoublons(nombres);
        assertTrue(result);
    }

    /**
     * Vérifie si un tableau de nombres possède un doublon
     * @param nombres tableau de plusieurs nombres avec doublon en utilisant stream
     */

    @ParameterizedTest
    @MethodSource("streamTableauAvecDoublon")
    @DisplayName("Test paramétré : un tableau avec doublon")
    public void testStreamTableauAvecDoublon(int[] nombres) {
        boolean result = doublon.verifierSiDoublons(nombres);
        assertTrue(result);
    }

    private static Stream<Arguments> streamTableauAvecDoublon() {
        return Stream.of(
                Arguments.of(new int[]{12, 3, 45, 12}),
                Arguments.of(new int[]{10, 20, 30, 40, 50, 30})
        );
    }

    @Test
    @DisplayName("Test avec usage normal de la méthode : un tableau sans doublon")
    public void testTableauSansDoublon() {
        int[] nombres = {1, 2, 3, 4, 5};
        boolean result = doublon.verifierSiDoublons(nombres);
        assertFalse(result);
    }

    /**
     * Vérifie si un tableau ne poosède pas de doublon
     * @param nombres tableau de nombre sans doublon en utilisant Stream
     */
    @ParameterizedTest
    @MethodSource("streamTableauSansDoublon")
    @DisplayName("Test paramétré : un tableau sans doublon")
    public void testStreamTableauSansDoublon(int[] nombres) {
        boolean result = doublon.verifierSiDoublons(nombres);
        assertFalse(result);
    }

    private static Stream<Arguments> streamTableauSansDoublon() {
        return Stream.of(
                Arguments.of(new int[]{12, 3, 45, 17}),
                Arguments.of(new int[]{10, 20, 30, 40, 50, 60})
        );
    }
}

