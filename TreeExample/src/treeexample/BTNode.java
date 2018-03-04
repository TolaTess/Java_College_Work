/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package treeexample;

public class BTNode {
    private int element;
    private BTNode leftChild;
    private BTNode rightChild;

    /** Creates a new instance of BTNode */
    public BTNode(int theValue) {
        element = theValue;
        leftChild = null;
        rightChild = null;
    }
    //will return if the node is an external node or not. if it has no children then it is and the node will be null.
    public boolean isLeaf() {
     	  return ((leftChild == null)&&(rightChild == null));
     }
    //getter method to return element
    public int getElement () {
        return element;
    }
    //setter method to set theNode as left node
    public void setLeft(BTNode theNode ){
       leftChild = theNode;
    }
    //setter method to set theNode as right node
    public void setRight(BTNode theNode) {
       rightChild = theNode;
    }
    //getter method to return left node
    public BTNode getLeft( ){
       return leftChild;
    }
    //getter method to return right node
    public BTNode getRight() {
       return rightChild;
    }
    //method to check if the node is internal (parent node with children)
    public boolean isInternal()
    {
        if((leftChild!=null) || (rightChild!=null)) //since internal node have children, the node should have value and not be null.
            return true;
        else
            return false;
    }
    //method to check if the node is external(child node with no children)
    public boolean isExternal()
    {
        if((leftChild==null) && (rightChild==null)) //since external nodes have no children, the node should have no value and should be null. 
            return true;
        else
            return false;
    }

}

