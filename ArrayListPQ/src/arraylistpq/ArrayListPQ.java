/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpq;

/**
 *
 * @author tolaotesanya
 */
public class ArrayListPQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ALInterface al = new AList();
        al.enqueue(4, "Sam West with a broken arm");
        al.enqueue(2, "West East with a palpitation");
        al.enqueue(1, "East Coast with a head injury");
        al.enqueue(3, "Coast North with a running nose");
        System.out.println("Size of the queue is: " + al.size());
        System.out.println("Is the queue empty " + al.isEmpty());
        System.out.println("Print all patients:");
        al.printPQueue();
        System.out.println("Removing a patient from the queue");
        al.dequeue();
        System.out.println("Size of the queue is: " + al.size());
        System.out.println("Print all patients:");
        al.printPQueue();
        
        
        
    }
    
}
