/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;


import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Stack st = new Stack();
        PostFixEvaluation p = new PostFixEvaluation();
        while(true){
            System.out.println("1: Check Paranthesis are equal or not ?");
            System.out.println("2: Solve PostFix Expression ?");
            System.out.println("3: Exit");
            System.out.println("Enter your choice ?");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter a mathematical expression");
                    String s = input.next();
                    st.checkParanthesis(s);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Enter a PostFix expression (like 625++)");
                    String s1 = input.nextLine();
                    
                    p.solveExpression(s1);
                    break;
                case 3:
                    System.exit(1);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        
    }
    
    
}
