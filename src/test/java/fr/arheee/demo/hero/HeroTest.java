package fr.arheee.demo.hero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HeroTest {

    private Hero hero;

    @BeforeEach
    public void setUp(){
        Identity indentityMock = mock(Identity.class);
        when(indentityMock.getIdentity()).thenReturn("Youn Mickael : Humoriste");

        Power powersMock = mock(Power.class);
        when(powersMock.toString()).thenReturn("Se frotter : aller en prison");

        List<Power> powers = new ArrayList<>();
        powers.add(powersMock);

        hero = new Hero(indentityMock, powers);
    }

    @Test
    public void testRetirerCostume(){
        String result = hero.removeCostume();

        assertEquals("Le héro retire son costume et redevient Youn Mickael : Humoriste", result);
    }

    @Test
    public void seBattre(){
        String result = hero.fight();

        assertEquals(" les hero utilise sont pouvoir : Se frotter : aller en prison", result);
    }

}