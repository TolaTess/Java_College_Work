/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.*;

/**
 *
 * @author tolaotesanya
 */
public class MyQueue implements QueueInterface{
    
    public ArrayList<String> TQueue;
    
    public MyQueue(){
        TQueue = new ArrayList<String>();
    }
    
    public Object dequeue(){
        if(!(TQueue.isEmpty())){
            return TQueue.remove(0);
        }
        else 
            return null;
    }
    
    public void enqueue(Object newItem){
        TQueue.add(0, (String)newItem);
    }
    
    public int size(){
        return TQueue.size();
    }
    
    public boolean isEmpty(){
        return TQueue.isEmpty();
    }
    
    
    public String displayQueue(){
        return TQueue.toString();
    }
    
    public Object front(){
        return TQueue.get(0);
    }
}
