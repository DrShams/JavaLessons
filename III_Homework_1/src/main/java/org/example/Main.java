package org.example;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Size of the queue: " + queue.size());

        int element = queue.dequeue();
        System.out.println("Dequeued element: " + element);
        System.out.println("Size of the queue: " + queue.size());
    }
}