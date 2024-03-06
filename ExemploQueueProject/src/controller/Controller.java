package controller;

import model.Client;
import model.MyQueue;
import view.View;

public class Controller {

    private View view;
    private MyQueue queue;

    public Controller(View v){
        view = v;
        queue = MyQueue.getInstance();
    }

    public void run(){
        loadInitialQueue();
        callClient();
        insertClient("James");
        insertClient("Joyce");
        do{
            callClient();
        }while (!queue.isEmpty());
    }

    private void callClient(){
        view.showMessage("Atendendo cliente: " + queue.dequeue().getName());
    }

    private void insertClient(String name){
        if(queue.enqueue(new Client(name)))
            view.showMessage("Cliente " + name + " inserido na fila");
        else
            view.showMessage("Erro ao inserir cliente na fila");
    }

    private void loadInitialQueue(){
        insertClient("Alice");
        insertClient("Bob");
        insertClient("Carol");
        insertClient("David");
        insertClient("Eva");
    }
}
