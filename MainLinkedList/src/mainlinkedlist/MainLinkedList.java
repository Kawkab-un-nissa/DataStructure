/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlinkedlist;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class MainLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DoubleLinkedLists<Integer> l = new DoubleLinkedLists<>();
        while(true){
            System.out.println("1: Insert At front ? ");
            System.out.println("2: Insert At End ? ");
            System.out.println("3: Insert Sorted ? ");
            System.out.println("4: Is List Empty ? ");
            System.out.println("5: Delete Element ? ");
            System.out.println("6: Print List ?");
            System.out.println("7: Exit");
            System.out.println("Enter your choice ? ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter value to insert : ");
                    int val = input.nextInt();
                    l.insertAtFront(val);
                    break;
                case 2:
                    System.out.println("Enter value to insert : ");
                    int val1 = input.nextInt();
                    l.insertAtEnd(val1);
                    break;
                case 3:
                    System.out.println("Enter value to insert : ");
                    int val2 = input.nextInt();
                    l.insertSorted(val2);
                    break;
                case 4:
                    if(l.isEmpty())
                        System.out.println("List is Empty");
                    else
                        System.out.println("List is Not Empty");
                    break;
                case 6:
                    System.out.println("Enter 1 for forward and 0 for Reverse ?");
                    int an = input.nextInt();
                    if(an==1)
                        l.printList(true);
                    else
                        l.printList(false);
                    break;
                case 5:
                    System.out.println("Enter value to delete ?");
                    int v = input.nextInt();
                    l.deleteElementSorted(v);
                    break;
                case 7:
                    System.exit(1);
            }
        }
    }    
}
