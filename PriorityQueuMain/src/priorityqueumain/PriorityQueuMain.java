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
public class PriorityQueuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        priorityqueu pq = new priorityqueu();
        pq.Enqueu(1, 'c');
        
        pq.Enqueu(3, 'e');
        pq.Enqueu(4, 'f');
        pq.Enqueu(2, 'b');
        pq.printList();
        pq.Dequeu();
        pq.printList();
    }
    
}
