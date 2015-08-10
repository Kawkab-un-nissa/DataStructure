/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queumain;

/**
 *
 * @author Hashim
 * 
 */
public class Queu {
    protected int[] queu;
    protected int count ;
    protected int front;
    protected int rear;
    
    Queu(int max){
        front = 0;
        rear = -1;
        queu = new int[max];
        count =0;
    
    }
    
    public boolean isEmpty(){
        return count<=0;
    }
    
    public boolean isFull(){
        return count==queu.length;
    }
    
    public void Enqueu(int value){
        if(!this.isFull()){
            this.rear++;
            if(rear==queu.length+1)
                rear = 0;
            this.queu[rear] = value;
            count++;
            System.out.println("Value Inserted Successfully !");
        }else{
            System.out.println("Queu is Full");
        }
    }
    
    public int Dequeu(){
        int value;
        if(!this.isEmpty()){
            value = this.queu[front];
            front++;
            if(front==queu.length+1)
                front++;
            count--;
            
        }else{
            value = 0;
        }
        return value;
    }
    
    
    
}
