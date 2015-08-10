/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree1;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class BinarySearchTree1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Creating object of BST */
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        System.out.println("Binary Search Tree Test\n");
        char ch;
        /* Perform tree operations */
        do
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("8. count leaf nodes");
            System.out.println("9. Count Internal Nodes");
            System.out.println("5. check empty");
            System.out.println("6. Print Preorder");
            System.out.println("7. Exit");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bst.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to delete");
                    //bst.delete( );
                    bst.deleteUsingRightSubTree(scan.nextInt());
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                    break;
                case 4 :
                    System.out.println("Nodes = "+ bst.countNodes() );
                    break;
                case 5 :
                    System.out.println("Empty status = "+ bst.isEmpty());
                    break;
                case 6 :
                    bst.preorder();
                    break;
                case 7 :
                    System.exit(1);
                    break;
                case 8 :
                   System.out.println("Leaves Nodes = "+ bst.countLeaves() );
                    break;
                case 9 :
                   System.out.println("Internal Nodes = "+ (bst.countNodes()-bst.countLeaves()) );
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            


        } while (true);
    }
}