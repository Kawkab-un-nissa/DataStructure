/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;

/**
 *
 * @author Hashim
 * @param <Listable>
 */
public class Stack<Listable> {
    
    protected class StackElement{
        protected char info;
        protected StackElement next;
    
    }
    
    public Stack(){
        top = null;
        numofElements=0;
    }
    protected StackElement top;
    int numofElements=0;
    public boolean isEmpty(){
        return top==null;
            
    }
    public char stacktop(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        
        return top.info;
        
        
    }
    
    public void push(char info){
        
            StackElement l = new StackElement();
            l.info = info;
            l.next = top;
            top = l;
            numofElements++;
       
       
    
    }
    
    public char pop(){
       if(!isEmpty()){
           char temp = top.info;
            top = top.next; 
            numofElements--;
            return temp;
       }
      
           System.out.println("Stack is Empty"); 
    
       return 'x';
    }
    
    public void checkParanthesis(String s){
        boolean valid = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                    this.push(s.charAt(i));
                    
            }
            if(s.charAt(i)==']' || s.charAt(i)=='}' || s.charAt(i)==')'){
                if(this.isEmpty()){
                    valid=false;
                    break;
                    
                }else{
                    char tmp = this.stacktop();
                    
                    if((tmp=='(' && s.charAt(i)== ')')||(tmp=='[' && s.charAt(i)== ']')||(tmp=='{' && s.charAt(i)== '}')){
                        valid=true;
                        this.pop();
                    }else{
                        valid=false;
                        break;
                    }
                        
                }
            
            }
                
        
        }
        if(valid && this.isEmpty())
            System.out.println("Paranthesis are Valid");
        else
            System.out.println("Paranthesis are not Valid");
    
    }
    
    
    
    
    
}
