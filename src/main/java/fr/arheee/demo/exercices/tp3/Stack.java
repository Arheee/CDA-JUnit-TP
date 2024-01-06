package fr.arheee.demo.exercices.tp3;

public class Stack {
    private int[] elements;
    private int size;

    public Stack() {
        this.elements = new int[10];
        this.size = 0;
    }

    public int push(int element) {

        if (size < 10)
            elements[size++] = element;
        return element;
    }
    public int pop(int element) {
        if (size > 0) {
            size--;
        }
        return element;
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }
}
