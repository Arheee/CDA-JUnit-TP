package fr.arheee.demo.exercices.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class StackTest {

    @Test
    public void test_push(){
        Stack stack = new Stack();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
