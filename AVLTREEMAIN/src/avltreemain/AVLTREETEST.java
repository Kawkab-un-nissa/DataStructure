/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avltreemain;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class AVLTREETEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        AVL avl = new AVL();
        while(true){
            System.out.println("\nAVLTree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear tree");
            System.out.println("6: Print in Pre-order");
            System.out.println("7: Print in In-order");
            System.out.println("8: Print in Post-order");
            System.out.println("9: Exit");
            
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                avl.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ avl.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ avl.countNodes());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ avl.isEmpty());
                break;     
            case 5 : 
                System.out.println("Tree Cleared");
                avl.makeEmpty();
                break; 
            case 6 : 
                System.out.println("Pre_Order");
                avl.preorder();
                break;
            case 7 : 
                System.out.println("In_Order");
                avl.inorder();
                break;
            case 8 : 
                System.out.println("Post_Order");
                avl.postorder();
                break;
            case 9 : 
                System.exit(1);
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            
 
    
        }
        
    }
    
}
