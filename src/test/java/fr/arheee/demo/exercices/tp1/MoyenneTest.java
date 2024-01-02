package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {

    private Moyenne moyenne;

    @BeforeEach
    public void setUp(){
        moyenne = new Moyenne();
    }

    /**@
     * Renvoie la moyenne des notes
     */
    @Test
    public void testVerifierMoyenne(){
        //Arrange
        int[] valeurs = {13, 20, 20};

        //Act
        int result = moyenne.moyenne(valeurs);

        //Assert
        assertEquals(17, result);
    }
}