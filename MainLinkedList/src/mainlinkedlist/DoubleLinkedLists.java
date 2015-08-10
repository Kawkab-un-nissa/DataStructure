/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlinkedlist;

/**
 *
 * @author Hashim
 * @param <Listable>
 */
public class DoubleLinkedLists <Listable extends Comparable<Listable>> {
    
    protected class ListNode{
        protected Listable info;
        protected ListNode next;
        protected ListNode back;
    
    }
    protected ListNode first;
    protected ListNode last;
    int numItems;
    protected ListNode loc;
    
    
    public DoubleLinkedLists(){
        numItems = 0;
        first = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void printList(boolean direction){
        ListNode location;
        if(this.isEmpty()){
            System.out.println("Error ! List is Empty");
            return;
        }
        int count;
        if(direction){
            count=0;
            System.out.println("Printing List from 1st to last");
            System.out.println("Value ============ Index");
            for(location=first;location!=null;location=location.next)
                   System.out.println(location.info+" ========== "+(++count));
            
        }else{
                    
            count=0;
            System.out.println("Printing List from 1st to last");
            System.out.println("Value ============ Index");
            for(location=last;location!=null;location=location.back)
                   System.out.println(location.info+" ========== "+(++count));
                   
        }
    
    }
    
    public void initialize_handler(){
        loc = null;
    
    }
    
    public boolean find(Listable key){
        this.initialize_handler();
        loc = first;
        boolean isFound = false;
        if(loc==null)
            return isFound;
        
        boolean moreToSearch = true;
        while(moreToSearch && loc.next!=null){
            if(loc.info.compareTo(key)<0)
                loc = loc.next;
            else
                moreToSearch = false;
       
        }
        
        if(loc.info==key)
            isFound=true;
            
        return isFound;
        
    }
    
    public void insertAtFront(Listable Item){
        ListNode newNode = new ListNode();
        newNode.info = Item;
        newNode.next = first;
        newNode.back = null;
        if(first==null){
            first = newNode;
            last  = newNode;
        }else{
            first.back = newNode;
            first = newNode;
        
        }
        numItems++;
    }
    
    public void insertAtEnd(Listable Item){
        ListNode newNode = new ListNode();
        newNode.info = Item;
        newNode.next = null;
        newNode.back = last;
        if(first==null){
            first = newNode;
            last = newNode;
        
        }else{
            last.next = newNode;
            last = newNode;
            
        }
        numItems++;
    }
    
    public void insertSorted(Listable key){
        boolean found = find(key);
        if(found){
            System.out.println("Invalid Insertion Item : "+key+" already found");
        }else{
            if(loc==null)
                this.insertAtFront(key);
            else if(loc==first && loc == last){
                if(loc.info.compareTo(key)>0)
                    this.insertAtFront(key);
                else
                    this.insertAtEnd(key);
             
            }else{
                if(loc==last && loc.info.compareTo(key)<0)
                    this.insertAtEnd(key);
                else{
                    ListNode  newNode = new ListNode();
                    newNode.info = key;
                    newNode.back = loc.back;
                    newNode.next = loc;
                    (loc.back).next = newNode;
                    loc.back = newNode;
                   
                }
            }
        }
    }
    
    public void deleteElementSorted(Listable key){
        boolean found=find(key); 
         
        if(!found){
            System.out.println("Invalid Deletion: Value not found in the list");
            return;
            
        
        }else{
            if(first==last){
                first = null;
                last = null;
            
            }else if(loc==first){
                (loc.next).back = loc.back;
                first = first.next;
                loc = null;
            
            }else if(loc==last){
                loc.back.next = loc.next;
                last = last.back;
                loc = null;
            }else{
                loc.back.next = loc.next;
                loc.next.back = loc.back;
                loc = null;
            
            }
                
        }
        System.gc();
        System.out.println("Deleted Successfully !");
    
    }
}
