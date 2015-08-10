/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmain;

/**
 *
 * @author Hashim
 */
public class HashTable {
    private class Node{
        String name;
        int marks;
        int rollnumber;
        Node next;
    
    }
    Node loc,pred_loc,list;
   
    Node[] n;
    int size;
    HashTable(){
        size = 0;
        n = new Node[100];
        for(int i=0;i<n.length;i++)
            n[i] = null;
        
    }
    
    public void makeEmpty()
    {
        for (int i = 0; i < n.length; i++)
            n[i] = null;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int HashFunction(int index){
        return index%100;
    
    }
    
    public boolean rollnumberisof5digits(int number){
        String n = number+"";
        return n.length()==5;
    }
    public void insert(String name,int marks,int rollnumber){
        int index = this.HashFunction(rollnumber);
        Node newNode = new Node();
        newNode.name = name;
        newNode.marks = marks;
        newNode.rollnumber = rollnumber;
        newNode.next = null;
        if(this.rollnumberisof5digits(rollnumber)){
            
            
            if(n[index]==null){
                
                n[index]= newNode;
            }else{
                Node temp = n[index];
                while(temp.next!=null && temp.rollnumber!=rollnumber){
                    temp = temp.next;
                    
                }
                if(temp.rollnumber==rollnumber){
                    temp.name = name;
                    temp.marks = marks;
                }else{
                    temp.next = newNode;
                }
                    
                
                
            
            }
            size++;
        }else{
            System.out.println("Roll Number Must be in 5 Digits");
        
        }
        
    }
    
    public void print(){
        for (int i=0;i<n.length;i++) {
            Node temp = n[i];
            if(temp!=null){
           
                System.out.println("At Index "+i);
                while(temp!=null){
                    System.out.println(temp.name+" "+temp.marks+" "+temp.rollnumber);
                    temp = temp.next;
                }   
            }}
        }
    
    
    
    public void Delete(int rollnumber){
        if(this.rollnumberisof5digits(rollnumber)){
            int index = this.HashFunction(rollnumber);
            if(n[index]!=null){
                Node pre_temp = null;
                Node temp = n[index];
                while(temp.next!=null && temp.rollnumber!=rollnumber){
                    pre_temp = temp;
                    temp = temp.next;
                
            
                }
                if(temp.rollnumber==rollnumber){
                    if(pre_temp==null){
                        n[index] = temp.next;
                    }else{
                        pre_temp.next = temp.next;
                    }
                }
            }
        size--;
    }else{
        System.out.println("Roll Number Must be a five digit number");
        }
    
}
    
    public int number_of_students(){
        int count=0;
        int index = 0;
        while(n[index]!=null){
            count++;
            index++;
        }
        return count;
    }
    
    public void search(int rollnumber){
        boolean found = false;
        if(this.rollnumberisof5digits(rollnumber)){
            int index = this.HashFunction(rollnumber);
            Node temp =n[index];
            
            while(temp.next!=null){
                if(temp.rollnumber==rollnumber){
                    found=true;
                    break;
                }else{
                    temp = temp.next;
                }
            }
            if(found){
                System.out.println("Name of Student : "+temp.name);
                System.out.println("RollNumber of Student : "+temp.rollnumber);
                System.out.println("Marks of Student : "+temp.marks);
            }else{
                System.out.println("Record Not Found");
            }
    
    
        }else{
            System.out.println("Roll Number must be a 5 digit number");
        }
    }
    
   
    
    
    
    
}