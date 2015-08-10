/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class StackImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Stack s = new Stack(50);
        System.out.println("Enter a long string ? ");
        String st = input.nextLine();
        boolean valid = true;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == '(' || st.charAt(i) == '{' || st.charAt(i) == '['){
                s.push(st.charAt(i));
                continue;
            }
            if(st.charAt(i) == ')' || st.charAt(i) == '}' || st.charAt(i) == ']')
                if(s.isEmpty())
                    valid= false;
                else{
                    char val = s.pop();
                    if(val!=st.charAt(i))
                        valid = false;
                }
            }
            for(int i =0;i<st.length();i++){
                System.out.println(s.pop());
            }
            
            if(valid)
                System.out.println("String is valid");
            else
                System.out.println("String is not valid");
        }
}