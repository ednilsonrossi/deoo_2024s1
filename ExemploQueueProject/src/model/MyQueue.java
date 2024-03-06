package model;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private static MyQueue instance;

    private Queue<Client> clientQueue;

    private MyQueue(){
        clientQueue = new LinkedList<>();
    }

    public static MyQueue getInstance(){
        return instance == null ? new MyQueue() : instance;
    }

    public boolean enqueue(Client client){
        return clientQueue.offer(client);
    }

    public Client dequeue(){
        return clientQueue.poll();
    }

    public boolean isFull(){
        return false;
    }

    public boolean isEmpty(){
        return clientQueue.isEmpty();
    }

    public Client look(){
        return clientQueue.peek();
    }
}
