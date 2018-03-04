/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

public class SingleLinkedListApp {

    /**
    *
    * @author TolaOtesanya
    */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
        LinearList li = new SLList();
        
        //add number of nodes
        li.add(1,"Meat");
        li.add(2,"Rice");
        li.add(3,"Tea");
        li.add(4,"Pie");
        li.add(2,"Bread");
        
        System.out.println("****Welcome to Linked List Demo****");
        //check and print if empty
        System.out.println("Is the linked list empty: " + li.isEmpty());
        //print the size of the list
        System.out.println("The linked list size is " + li.size());
        //print all elements
        System.out.println("Items in the linked list: ");
        li.printList();
        //remove an element from position 3
        System.out.println("Remove items in position 3 and 4");
        li.remove(3);
        li.remove(4);
        //list all element
        System.out.println("Updated linked list: ");
        li.printList();
       
    }
}
