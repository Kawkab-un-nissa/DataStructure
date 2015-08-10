/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;

/**
 *
 * @author Hashim
 */
public class PostFixEvaluation {
   
     protected class StackElement{
        protected String info;
        protected StackElement next;
    
    }
    
    public PostFixEvaluation(){
        top = null;
        numofElements=0;
    }
    protected StackElement top;
    int numofElements=0;
    public boolean isEmpty(){
        return top==null;
            
    }
    public String stacktop(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        
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
    
       return "";
    }
    
    
    public void solveExpression(String s1){
        String opnd1;
        String opnd2;
        String result = "";
        String[] symbols = s1.split(" ");
        
         for (String symbol : symbols) {
             
             if (!symbol.equals("+") || !symbol.equals("/") || !symbol.equals("*") || !symbol.equals("-")) {
                    this.push(symbol);
                 
             } else {
                 
                
                 opnd2 = this.pop();
                 opnd1 = this.pop();
                 
                 if(symbol.equals("+"))
                      result = ""+(Integer.parseInt(opnd1)+Integer.parseInt(opnd2));
                 
                 else if(symbol.equals("-"))
                      result = ""+(Integer.parseInt(opnd1)-Integer.parseInt(opnd2));

                 
                 else if(symbol.equals("*"))
                     result = ""+(Integer.parseInt(opnd1)*Integer.parseInt(opnd2));
                 
                 else if(symbol.equals("/"))
                     result = ""+(Integer.parseInt(opnd1)/Integer.parseInt(opnd2));
                 else if(symbol.equals("^"))
                     result = ""+Math.pow(Integer.parseInt(opnd2),Integer.parseInt(opnd1));
                 
                 else
                     System.out.println("Invalid Operator");
                
                 this.push(result);
                 
             }
         }
         if(!this.isEmpty())
            System.out.println("Final answer : "+this.pop());
         
    }
    
}
