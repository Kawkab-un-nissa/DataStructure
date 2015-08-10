/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;

/**
 *
 * @author Hashim
 */
public class Stack {
    private int top;
    private char[] storage;
    
    Stack(int cap){
        if(cap<=0){
            System.out.println("Stack Capacity must be positive");
        }else{
            storage = new char[cap];
            top = -1;
        } 
    }
    // insert element into the stack;
    public void push(char item){
        if(top==storage.length-1)
            System.out.println("Stack is Full. Overflow Occurs");
        else{
            top++;
            storage[top] = item;
        }
    }
    
    // this function  gives the top most item in the stack
    public char peek(){
        if(top==-1)
            return 'x';
        
        return storage[top];
    }
    
    // this function removes an element from the stack
    
    public char pop(){
        if(top==-1)
            return 'x';
        char value = storage[top];
        top--;
        return value;
    
    }
    
    // this function checks for the stack is empty or not
    public boolean isEmpty(){
        return top==-1;
    
    }
    
    // this function checks whether the stack is full or not
    public boolean isFull(){
        return top==storage.length-1;
    
    }
    
    // thsi function determines the size of the stack
    public void stackSize(){
        System.out.println("The total Space / Size of Stack is "+storage.length);
        System.out.println((top+1)+" Space Filled with values");
    
    }
    
    // this function clear the stack
    public void clearStack(){
        top = -1;
    }
    
}
