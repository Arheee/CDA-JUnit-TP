package fr.arheee.demo.exercices.tp3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class ThermometreTest {


    @ParameterizedTest
    @MethodSource("streamTemperatureThermometre")
    @DisplayName("Test thermomètre qui permet d'indiquer la température la plus proche de 0")
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

    @Test
    @DisplayName("Test plus de 10000 mesures, on lève une exception ")
    public void testTooManyMeasurements() {
        int[] temperatures = new int[10001];
        assertThrows(IllegalArgumentException.class, () -> Thermometre.findClosestTemperature(temperatures));
    }
}
