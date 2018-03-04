/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

/**
 *
 * @author tolaotesanya
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueInterface qi = new MyQueue();
        
        System.out.println("Is the Queue Empty: " + qi.isEmpty());
        qi.enqueue("you");
        qi.enqueue("love");
        qi.enqueue("We");
        System.out.println("Is the Queue Empty: " + qi.isEmpty() + "\n" +qi.displayQueue());
 
        qi.dequeue();
     
        System.out.println("Size of the Queue is " + qi.size());
       
        
        System.out.println("Top element in Queue : " + qi.front());
        qi.enqueue("I");
        
        System.out.println("All element in Queue: \n" + qi.displayQueue());
        
       
       
        
    }
    
}
