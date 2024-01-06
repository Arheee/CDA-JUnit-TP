package fr.arheee.demo.exercices.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }


    @Test
    public void test_push() {
        stack.push(5);
        int result = stack.push(5);
        assertEquals(5, result);
    }

    @Test
    public void test_pop() {
        stack.push(5);
        int result = stack.pop(4);
        assertEquals(4, result);
    }

    @Test
    public void test_peek() {
        stack.push(5);
        int result = stack.peek();
        assertEquals(5, result);
    }

    @Test
    public void test_is_empty() {
        boolean empty = stack.isEmpty();
        assertTrue(empty);
        stack.push(5);
        boolean notEmpty = stack.isEmpty();
        assertFalse(notEmpty);
    }

    @Test
    public void test_is_full() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        boolean isFull = stack.isFull();
        assertTrue(isFull);
    }


}
