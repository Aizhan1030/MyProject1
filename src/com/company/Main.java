package com.company;
import java.util.Collection;
import java.util.PriorityQueue;
public class Main {

    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("alma");
        queue1.offer("banan");
        queue1.offer("zhuzim");
        queue1.offer("persik");
        System.out.println("Priority queue using Comparable:");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
    }
}
