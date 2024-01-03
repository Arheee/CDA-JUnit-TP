package fr.arheee.demo.exercices.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {

    /**
     * Attributs
     */
    private Moyenne moyenne;
   private  int[] plusQueTroisNotes = {13, 20, 12, 18};
   private int[] seulementDeuxNotes = {13, 20};
   private int[] noteInferieurZero = {-12, 12, 13};
   private int[] noteSuperieurVingt = {34, 12, 13};

    /**
     * Creer une instance moyenne avant chaque test
     */
    @BeforeEach
    public void setUp(){
        moyenne = new Moyenne();
    }

    /**
     * Calcule la moyenne des notes
     * @params int[] valeurs = tableau de notes
     * @Renvoie la moyenne des notes
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

    /**
     * Vérifie que le carnet de notes contient 3 notes
     * @Params int[] seulementDeuxNotes = tableau de deux notes
     * @Renvoie Message d'exception : Le carnet de notes doit contenir 3 notes
     */
    @DisplayName("Test Verification taille du tableau de notes")
    @Test
    public void testSeulementDeuxNotes(){
        IllegalArgumentException exception;
        exception = assertThrows(
                IllegalArgumentException.class ,
                () ->
                        moyenne.moyenne(seulementDeuxNotes));

        assertEquals("Le carnet de notes doit contenir 3 notes", exception.getMessage());

    }

    /**
     * Vérifie que le carnet de notes contiens 3 notes
     * @Params int[] plusQueTroisNotes = tableau de plus de trois notes
     * @Renvoie Message d'exception : Le carnet de notes doit contenir 3 notes
     */
    @DisplayName("Test Verification taille du tableau de notes")
    @Test
    public void testPlusQueTroisNotes(){
        assertThrows(IllegalArgumentException.class,
                () -> moyenne.moyenne(plusQueTroisNotes));
    }

    /**
     * Vérifie que les notes sont comprises entre 0 et 20
     * @Params int[] noteInferieurZero = Tableau de notes avec une notes en dessous de zéro
     * @Renvoie Les notes doivent être comprises entre 0 et 20
     */
    @DisplayName("Test Verification Si une note est en dessous de zéro")
    @Test
    public void testNoteInferieurZero(){
        assertThrows(IllegalArgumentException.class,
                () -> moyenne.moyenne(noteInferieurZero));
    }

    /**
     * Vérifie que les notes sont comprises entre 0 et 20
     * @Params int[] noteSuperieurVingt = Tableau de notes avec une notes au dessus de vingt
     * @Renvoie Les notes doivent être comprises entre 0 et 20
     */
    @DisplayName("Test Verification Si une note est au dessus de vingt")
    @Test
    public void testNoteSuperieurVingt(){
        assertThrows(IllegalArgumentException.class,
                () -> moyenne.moyenne(noteSuperieurVingt));
    }
}