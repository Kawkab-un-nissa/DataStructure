/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueumain;

/**
 *
 * @author Hashim
 */
public class priorityqueu {
    
    protected class ListNode{
        int priority;
        char info;
        ListNode next;
    }
    ListNode loc,pred_loc,rear,front,head;
    int numofItems;
    
    priorityqueu(){
        head = null;
        numofItems = 0;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public int totalElements(){
        return this.numofItems;
    }
    
    public void Enqueu(int key,char info){
        findElement(key);
        ListNode newNode = new ListNode();
        newNode.info = info;
        newNode.priority = key;
        if(pred_loc==null){
            newNode.next = head;
            head = newNode;
            numofItems++;
        }else{
            newNode.next=pred_loc.next;
            pred_loc.next = newNode;
            numofItems++;
        }
     
    }
    
    public void findElement(int key){
        initialize_handlers(); // pred_loc and loc assigned null value
        loc = head;
        if(this.isEmpty())
            return;
        
        boolean moreToSearch = true;
        while(moreToSearch && loc!=null){
            if(loc.priority<key){
                pred_loc = loc;
                loc = loc.next;
            }
            else
                moreToSearch = false;
        }
        if(loc!=null){
            if(loc.priority != key)
                loc = null;
        
        
        }
    
    }
    
    public void initialize_handlers(){
        pred_loc = null;
        loc = null;
    
    }
    
    public char Dequeu(){
        char ans = '0';
        if(!this.isEmpty()){
            if(head.next!=null){
                ans = head.info;
                head=head.next;
                
            }else{
                ans = head.info;
                head = null;
                
            }
        }else{
            System.out.println("List is Empty");
            
        }
        return ans;
    }
    
    public void printList(){
        ListNode location;
        int count =0;
        if(head==null)
            System.out.println("List is Empty");
        else{
            System.out.println("Value ================== Priority");
            for(location = head;location!=null;location=location.next){
                System.out.println(location.info+"================"+(location.priority));
            
            }
        
        }
            
    
    }
    
    
    
    
    
    
    
    
    
}
