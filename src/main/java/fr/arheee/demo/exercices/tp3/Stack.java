package fr.arheee.demo.exercices.tp3;

public class Stack {
    private int[] elements;
    private int size;

    public Stack() {
        this.elements = new int[10];
        this.size = 0;
    }

    public void push(int element) {
        elements[size++] = element;
    }

    public void pop(){
        size --;
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
