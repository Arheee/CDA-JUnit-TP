package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumberTest {
    private RomanToNumber romanToNumber;

    @BeforeEach
    public void setUp(){romanToNumber = new RomanToNumber();}

    /**
     * Test du cas normal : un nombre romain correct
     * @param nombreRomain nombre romain
     * @param expected  équivalent en nombre arabe
     */
    @ParameterizedTest
    @DisplayName("Test pour plusieurs nombres romains corrects")
    @CsvSource({
            "I, 1",
            "CXL, 140",
            "CD, 400",
            "CM, 900",
            "MMXXIV, 2024"
    })
    public void EstUnNombreRomainCorrectAvecParam(String nombreRomain, int expected) {
        int result = romanToNumber.convertirNombreRomainEnNombreArabe(nombreRomain);
        assertEquals(expected, result);
    }




}