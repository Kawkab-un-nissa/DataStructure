/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmain;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class HashMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTable h = new HashTable();
        //int a = h.HashFunction(12345);
        //System.out.println(a);
     
        Scanner input = new Scanner(System.in);
        while(true){
        
            System.out.println("1. Add Student Record");
            System.out.println("2. Search Student Record");
            System.out.println("3. Delete Student Record");
            System.out.println("4. Print All Student Record");
            System.out.println("5. Total Number of Students");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Name : ");
                    String name = input.next();
                    System.out.println("Enter RollNumber : ");
                    int roll = input.nextInt();
                    System.out.println("Enter Marks");
                    int marks = input.nextInt();
                    h.insert(name, marks, roll);
                    break;
                case 2:
                    System.out.println("Enter Rollnumber to search");
                    int r = input.nextInt();
                    h.search(r);
                    break;
                case 3:
                    System.out.println("Enter rollnumber to Delete");
                    int ro = input.nextInt();
                    h.Delete(ro);
                    break;
                case 4:
                    h.print();
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Total Students : "+h.number_of_students());
                default:
                    System.out.println("Invalid Choice");
                    break;
            }   
        
        }
        
       
    }
    
}
