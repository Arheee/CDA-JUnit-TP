package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp(){palindrome = new Palindrome();}

    //Commencez par tester un usage "normal" de la méthode : un nombre palindrome
    @Test
    @DisplayName("Test normal de la méthode : un nombre palindrome")
    public void testEstUnPalindrome(){
        //Arrange
        long nombre = 121;
        //Act
        Boolean result = palindrome.estUnPalindrome(nombre);
        //Assert
        assertTrue(result);
    }

    /**
     * Vérifie si un nombre est un palindrome
     * @param nombres  liste de nombres
     */
    @ParameterizedTest
    @ValueSource(ints = {121, 202, 333})
    @DisplayName("Test paramétré pour tester plusieurs nombres de la méthode : un nombre palindrome")
    public void testEstUnPalindromeAvecParametre(long nombres){
        Boolean result = palindrome.estUnPalindrome(nombres);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {345, 456, 897})
    @DisplayName("Test du cas ou le nombre n'est pas un palindrome")
    public void testPasUnPalindrome(long nombres){
        Boolean result = palindrome.estUnPalindrome(nombres);
        assertFalse(result);
    }

    @Test
    @DisplayName("Test du cas limite : nombre inférieur à 10")
    public void testVerifierNombre(){
        long nombreEnDessousDeDix = 5;
        // Assert
        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(nombreEnDessousDeDix));
    }

}