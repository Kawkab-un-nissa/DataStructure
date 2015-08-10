/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfix;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class InfixtoPostfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Stack st = new Stack();
        System.out.println("Note 1: Infix Expression must be space seperated after each value.");
        
        System.out.println("Note 2: Power symbol is represented by ^");
        System.out.println("Note 3: If paranthesis is used then they must be balanced");
        System.out.println("Example:  ( ( ( A + B ) * C ) / D ) ");
        System.out.println("Enter Infix Expression ? ");
        String str = input.nextLine();
        st.infix_to_postfix(str);
        
        
        
    }
    
}
