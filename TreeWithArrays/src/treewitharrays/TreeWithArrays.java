/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treewitharrays;

/**
 *
 * @author Hashim
 */
public class TreeWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree t = new Tree(12);
        t.addleft(t.move, 5);
        t.gotoparent();
        t.addright(t.move, 6);
        t.addleft(t.move, 9);
        t.gotoparent();
        t.addright(t.move, 3);
        //t.print();
        System.out.println("Preorder");
        t.preorder(1);
        System.out.println("Inorder");
        t.inorder(1);
        System.out.println("PostOrder");
        t.postorder(1);
        
        
        
    }
    
}
