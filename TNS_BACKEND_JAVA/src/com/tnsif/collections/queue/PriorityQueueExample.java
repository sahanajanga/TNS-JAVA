package com.tnsif.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

       PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(40);

        System.out.println("PriorityQueue elements:");
        System.out.println(queue);

        System.out.println("Head element (Peek): " + queue.peek());

        System.out.println("Removing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}


