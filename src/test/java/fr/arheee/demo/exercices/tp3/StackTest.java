package fr.arheee.demo.exercices.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp(){stack = new Stack();}
    @Test
    public void test_push(){
        stack.push(1);
        boolean result = stack.isEmpty();
        assertFalse(result);
    }

    @Test
    public void test_pop() {
        stack.push(1);
        stack.pop();
        boolean result = stack.isEmpty();
        assertTrue(result);
    }

    @Test
    public void test_peek() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int result = stack.peek();
        assertEquals(3, result);
        assertFalse(stack.isEmpty());
    }
}
