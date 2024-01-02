package fr.arheee.demo.calculatrice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    private Calculatrice calculatrice;
    private  float premierNombre;
    private float secondNombre;

    // creer une instance calculatrice avant chaque test
    @BeforeEach
    public void setUp(){
        calculatrice = new Calculatrice();
    }

    @AfterEach
    public void tearDown(){
        premierNombre = 0;
        secondNombre = 0;
    }


    // Exemple avec un CSV source
    //On peut ajouter les valeurs au nom du test (optionnel)
    @ParameterizedTest(name = "Test {index} : {0} + {1} = {2}")
    //csv est un excel dans un bloc note
    @CsvSource({
            "1,1,2",
            "2,3,5",
            "100,1000,1100"
    })
    @DisplayName("Test des additions")
    // il faut les passer dans l'ordre en parametre de la methode de test
    public void testAddition(float premierNombre,
                             float secondNombre,
                             float expected
    ){
        //act
        float result = calculatrice.additionner(premierNombre, secondNombre);

        //assert
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "Test {index} = {0} = 0")
    @ValueSource(ints ={1,2,3,4})
    @DisplayName("Test des soustraction")
    public void testSoustraction(int nombre){

        //Act
        float result = calculatrice.soustraction(nombre,nombre);

        //Assert
        // NB :  tous les reusltat doivent etre les memes !
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test des divisions")
    public void testDiviser(){

        //Arrange
        premierNombre = 10;
        secondNombre = 2;

        //Act
        float result = calculatrice.diviser(premierNombre,secondNombre);

        //Assert
        assertEquals(5, result);
    }

    @DisplayName("Division par Zero")
    @ParameterizedTest(name = "Test {index} : {0} / 0")
    @ValueSource(floats = {1,50,100,1000})
    public void testDivisionParZero(float premierNombre){
        IllegalArgumentException exception;
        exception = assertThrows(
                IllegalArgumentException.class ,
                () ->
                calculatrice.diviser(premierNombre, 0));

        assertEquals("La division par zero est impossible!", exception.getMessage());

        assertEquals(IllegalArgumentException.class, exception.getClass());

        // lambda = () -> fonction anonyme
        assertThrows(IllegalArgumentException.class,
                () -> calculatrice.diviser(premierNombre, 0));

    }

}