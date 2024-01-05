package fr.arheee.demo.exercices.tp3;

import fr.arheee.demo.exercices.tp1.Doublon;
import fr.arheee.demo.exercices.tp2.Adresse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;

public class ThermometreTest {

    @ParameterizedTest
    @MethodSource("streamTemperatureThermometre")
    public void test_stream_return_temperature_positive_if_negative_equal(int[] temperatures, int expected ) {
        int result = Thermometre.findClosestTemperature(temperatures);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> streamTemperatureThermometre() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{-2, -8, -4, 2}, 2),
                Arguments.of(new int[]{-2, -8, 4, 5}, -2)
        );
    }
}
