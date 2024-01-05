package fr.arheee.demo.fizbuzz;

import fr.arheee.demo.fizzBuzz.Fizzbuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    private Fizzbuzz fizzBuzz;
    @BeforeEach
    public void setUp(){
        fizzBuzz = new Fizzbuzz();
    }
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2"
    })
    public void should_return_string_if_no_multiple_of_3_or_5_or_both(int givenNumber, String expected){
        String result = fizzBuzz.say(givenNumber);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void should_return_fizz_when_multiple_of_3(int number){
        String result = fizzBuzz.say(number);

        assertEquals("Fizz", result);
    }

    @Test
    public void should_return_buzz_when_5(){
        String result = fizzBuzz.say(5);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints={5, 10, 20})
    public void should_return_buzz_when_10(int numbers){
        String result = fizzBuzz.say(numbers);
        assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints={15, 30, 45})
    public void should_return_FizzBuzz_when_15(int numbers){
        String result = fizzBuzz.say(numbers);
        assertEquals("FizzBuzz", result);
    }

}
