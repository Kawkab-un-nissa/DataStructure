/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queumain;

import java.util.Scanner;

/**
 *
 * @author Hashim
 */
public class QueuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Queu q = new Queu(4);
        System.out.println("Rear = "+q.rear+" === Front = "+q.front);
        while(true){
            System.out.println("1 : Enqueu Element ?");
            System.out.println("2 : Dequeu Elemnt ? ");
            System.out.println("3 : Is Queu Full ? ");
            System.out.println("4 : Is Queu Empty ?");
            System.out.println("Enter your choice ? ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Value ? ");
                    int value = input.nextInt();
                    q.Enqueu(value);
                    System.out.println("Rear = "+q.rear+" === Front = "+q.front);
                    break;
                case 2:
                    int d = q.Dequeu();
                    System.out.println(d);
                    System.out.println("Rear = "+q.rear+" === Front = "+q.front);
                    break;
                case 3:
                    if(q.isFull())
                        System.out.println("Queu is Full");
                    else
                        System.out.println("Queu is not Full");
                    break;
                case 4:
                    if(q.isEmpty())
                        System.out.println("Queu is Empty");
                    else
                        System.out.println("Queu is not Empty");
                    break;
            }
        }
    }
    
}
