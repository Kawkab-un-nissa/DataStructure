
package circularlinkedlist;


public class circular <T> {
    class listnode
    {
        T info;
        listnode next;
    }
    listnode list,loc,predloc;
    int numItems;
    
    public boolean isEmpty()
   {
       if(list==null)
           return true;
       else
           return false;
       
   }
    
    public void printList()
    {
        
        listnode location=list;
                     

        int count=0;
        
        if(list==null)
            {
               System.out.println("List is Empty");
        
            }
        else
        {
            
            
            
        
        do
            {
                
                location=location.next;
                System.out.println(location.info);
               
          }while(location!=list);
        
    }
    public void insertAtEnd(T item)
   {
       listnode newnode=new listnode();
               newnode.info=(T)item;
               predloc=list;
               loc=predloc.next;
               
               newnode.next=predloc.next;
               predloc.next=newnode;
               list = newnode;
               numItems++;
               
               
    }
    public void insertAtMiddle(T item, int position)
   {
       
       if(position>numItems+1)
           System.out.println("Invalid position");
       else if(position==1)
       {
           insertatfront(item);
       }
       else if(position==numItems+1)
           insertAtEnd(item);
       
       else 
       {
           listnode newnode=new listnode();
       newnode.info=(T) item;
       
       int count=1;
       predloc=null;
       loc=list;
       while(loc!=null&&count<position)
       {
          predloc=loc;
          loc=loc.next;
          count++;
       }
       newnode.next=loc;
       predloc.next=newnode;
       numItems++;
       
       }
    
}
     public void insertatfront(T item)
   {
       
       listnode newnode=new listnode();
       newnode.info=(T) item;
       predloc=list;
       
       loc=predloc.next;
       if(loc==predloc)
       {
           
          predloc.next=newnode;
       newnode.next=predloc;
       }
       else{
           newnode.next=predloc.next;
       predloc.next=newnode;
       loc=newnode;
           
       }
      
     
       
       
   }
     public void insertatempty(T item)
     {
         listnode newnode=new listnode();
         newnode.info=item;
         list=newnode;
         newnode.next=newnode;
         
     }

    
}