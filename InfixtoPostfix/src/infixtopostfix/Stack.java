/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfix;

/**
 *
 * @author Hashim
 */
public class Stack {
    protected class StackElement{
        protected String info;
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
    public String stacktop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return top.info;
        
        
    }
    
    public void push(String info){
        
            StackElement l = new StackElement();
            l.info = info;
            l.next = top;
            top = l;
            numofElements++;
       
       
    
    }
    
    public String pop(){
       if(!isEmpty()){
           String temp = top.info;
            top = top.next; 
            numofElements--;
            return temp;
       }
      
           System.out.println("Stack is Empty"); 
    
       return null;
    }
    
    public void infix_to_postfix(String str){
        String[] items = str.split(" ");
        String postfix = "";
        for (String item : items) {
           if("+".equals(item)||"-".equals(item)||"*".equals(item)||"/".equals(item)||"^".equals(item)||item.equals("(")||item.equals(")")){
               while(!this.isEmpty() && !this.precedence(item,this.stacktop())){
                   postfix += this.pop()+" ";
               }
                    if(this.isEmpty() || !item.equals(")"))
                        this.push(item);
                    else
                        this.pop();
           }else{
               postfix += item+" ";
           }
           
        }
        while(!this.isEmpty()){
            postfix += this.pop()+" ";
        }
        
        System.out.println(postfix);
    
    
    }
    
    public boolean precedence(String op1,String op2){
        boolean ans = false;
        if(op1.equals(op2) && !op1.equals("(") && !op2.equals("("))
            ans = false;
        else if(op1.equals("("))
            ans = true;
        else if(op2.equals("("))
            ans = true;
        else if(op1.equals(")"))
            ans = false;
        else if(op1.equals("^"))
            ans = true;
        else if(op2.equals("^"))
            ans = false;
        else if((op1.equals("/") && op2.equals("*"))||(op2.equals("/") && op1.equals("*")))
            ans = false;
        else if((op1.equals("-") && op2.equals("+"))||(op2.equals("-") && op1.equals("+")))
            ans = false;
        else if(op1.equals("/") && (op2.equals("+")||op2.equals("-")))
            ans = true;
        
        else if(op1.equals("*")&&(op2.equals("+")||op2.equals("-")))
            ans = true;
        else if(op1.equals("+") && (op2.equals("*")||op2.equals("/")))
            ans = false;
        
        
    
    
    
        return ans;
    }
    
}
