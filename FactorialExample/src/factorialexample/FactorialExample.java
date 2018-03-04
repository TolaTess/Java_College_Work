/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialexample;

/**
 *
 * @author tolaotesanya
 */
public class FactorialExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial = " + factT(5));
        System.out.println("Power of two = " + thePoweroftwo(4));
        System.out.println("Power = " + power(3,3));
        System.out.println("Is it a Palindrome: " + palindrome("noon"));
        System.out.println("Reverse string Tola: " + reverseString("Tola"));
    }
        
        public static int factT(int n){
      
            if((n == 1)){
            return 1;
            }
            else {
            return n * factT(n-1);
            }
        }
        
        //power of two 
        public static int thePoweroftwo(int x){
            if((x == 0)){
            return 1;
            }
            else {
            return 2 * thePoweroftwo(x -1);
            }
        }
        //power of 
        public static int power(int base, int exp){
            if((exp == 1)){
            return base;
            }
            else {
            return base * power(base, exp -1);
            }
        }
        //palindrome = if same word backward and forward
        public static boolean palindrome(String word){
            if(word.length() <= 1){ //checks the length of the word is not less than 1 before continuing
            return true;
            }
            else {
                if(word.charAt(0) != word.charAt(word.length() -1))// check if first and last letter is equal or not// if not equal not a palindrome
                return false;
                else
                return palindrome (word.substring(1, word.length() -1));//if equal, continue and make new substing without first and last char and start again.
                }
            }
           //reserse string = same word backward
        public static String reverseString(String string){
            if(string.length() <= 1){ //checks the length of the word is not less than 1 before continuing
            return string;
            }
            else {
                return reverseString(string.substring(1)) + string.charAt(0); //if longer than 1,  make new substing without first and add char index 0 to the new substring.
                   
                
            }
        }
}
    

