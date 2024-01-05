package fr.arheee.demo.exercices.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {
    @Test
    public void test_thermometre_return_0() {
        int[] temperature = new int[]{};
        int result = Thermometre.findClosestTemperature(temperature);
        assertEquals(0, result);
    }

    @Test
    public void test_thermometre_return_1() {
        int[] temperature = new int[]{1, 2, 3};
        int result = Thermometre.findClosestTemperature(temperature);
        assertEquals(1, result);
    }

    @Test
    public void test_thermometre_return_positive_temperature_if_negative_temperature_equal(){
        int[] temperature = new int[]{-2, -8, -4, 2};
        int result = Thermometre.findClosestTemperature(temperature);
        assertEquals(2, result);
    }
}
