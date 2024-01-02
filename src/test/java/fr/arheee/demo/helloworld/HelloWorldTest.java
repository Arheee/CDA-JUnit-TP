package fr.arheee.demo.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        //creation d'une instance de la classe à tester
        HelloWorld helloWorld = new HelloWorld();

        //on appelle la méthode à tester et on enregistre le resultat dans une variable
        String resultat = helloWorld.sayHello();
        //on compare le résultat attendu avec le reusltat obtenu
        assertEquals("hello world ", resultat, "Le message doit etre identique");

        // + d'exemple
        assertNotEquals("trololo", resultat);
        assertTrue(resultat == "hello world");
        assertFalse(resultat == "hhhhhhhh");
    }
}