package org.example;

public class Main {
    public static void main(String[] args) {
        final int MAXSIZE = 500;
        Queue<Integer> queue = new Queue<>(MAXSIZE);

        /*partially fill the queue*/
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Size of the queue: " + queue.size());//3

        int element = queue.dequeue();//-1
        System.out.println("Dequeued element: " + element);
        System.out.println("Size of the queue: " + queue.size());//2

        element = queue.dequeue();//-1
        System.out.println("Dequeued element: " + element);
        System.out.println("Size of the queue: " + queue.size());//1

        element = queue.dequeue();//-1
        System.out.println("Dequeued element: " + element);
        System.out.println("Size of the queue: " + queue.size());//0

        /*completely subtract everything from the queue*/
        //element = queue.dequeue();//-> throws IllegalStateException (Queue is empty)


        for (int x = 4; x <= MAXSIZE; x ++) {
            queue.enqueue(x);
        }
        System.out.println("Size of the queue: " + queue.size());

        /*top up queue*/
        //queue.enqueue(MAXSIZE);//-> throws IllegalStateException (Queue is full)

    }
}