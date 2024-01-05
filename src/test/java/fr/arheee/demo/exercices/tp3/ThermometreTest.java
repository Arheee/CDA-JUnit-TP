package fr.arheee.demo.exercices.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {
    @Test
    public void test_thermometre_return_0() {
        int result = Thermometre.findClosestTemperature(0);
        assertEquals(0, result);
    }

    @Test
    public void test_thermometre_return_1() {
        int[] temperatures = new int[]{1, 2, 3};
        int result = Thermometre.findClosestTemperature(1);
        assertEquals(1, result);
    }
}
