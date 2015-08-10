
package circularlinkedlist;


public class Circularlinkedlist {

   
    public static void main(String[] args) {
       
        circular a=new circular();
        System.out.println(a.isEmpty());
        a.insertatempty("Hello");
        a.insertatfront("there");
       a.insertatfront("finally");
       a.insertAtEnd("end");
       a.insertAtEnd("finallyend");
        a.printList();
    }
    
}
