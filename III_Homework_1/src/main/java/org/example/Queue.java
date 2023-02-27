package org.example;

public class Queue<T> {
    private T[] elements;
    private int head;
    private int tail;

    public Queue(int capacity) {
        elements = (T[]) new Object[capacity];
        head = 0;
        tail = 0;
    }

    public void enqueue(T element) {
        if (tail == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[tail] = element;
        tail++;
    }

    public T dequeue() {
        if (head == tail) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = elements[head];
        head++;
        return element;
    }

    public int size() {
        return tail - head;
    }
}