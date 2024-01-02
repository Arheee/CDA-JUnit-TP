package fr.arheee.demo.exercices.tp1;

import jdk.internal.vm.annotation.DontInline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {

    private Moyenne moyenne;

    /**@
     * creer une instance moyenne avant chaque test
     */
    @BeforeEach
    public void setUp(){
        moyenne = new Moyenne();
    }

    /**@
     * Renvoie la moyenne des notes
     * @params int[] valeurs = tableau de notes
     * Result la moyenne des notes
     */
    @Test
    @DisplayName("Vérification du calcul de la moyenne")
    public void testVerifierMoyenne(){
        //Arrange
        int[] valeurs = {13, 20, 20};

        //Act
        int result = moyenne.moyenne(valeurs);

        //Assert
        assertEquals(17, result);
    }

//    @DisplayName("Test Verification taille du tableau de notes")
//    @Test
//    public void testverifierTaille(int[] notes){
//        IllegalArgumentException exception;
//        assertThrows(IllegalArgumentException.class,
//                () -> moyenne.moyenne(notes != 3));
    }
}