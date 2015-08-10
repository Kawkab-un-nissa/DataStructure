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
public class Tree {
    int count= 0;
    int[] array;
    int move=1;
    Tree(int element){
        array = new int[16];
        for(int i=0;i<array.length;i++)
            array[i] = -1;
        
        count = 1;
        array[1]=element;
        
        
    }
    
    public void addleft(int index,int value){
        int left = index*2;
        if(index<=0 && index>=16){
            System.out.println("Index out of range");
        }else if(array[left]!=-1){
            System.out.println("Value Already Exists");
        }else{
            
            move = left;
            array[left] = value;
            count++;
            
        }
        //return move;
    
    }
    
    public void addright(int index,int value){
        int right = (index*2)+1;
        if(index<=0 && index>=16){
            System.out.println("Index out of range");
        }else if(array[right]!=-1){
            System.out.println("value already Exists !");
        
        }else{
            
            move = right;
            array[right] = value;
            count++;
        }
        //return move;
    
    }
    
    public void gotoparent(){
            int parent = move/2;
            move = parent;
        
            
        
    
    }
    
    public void print(){
        System.out.println("Parent  :  Left  : Right");
        int i=1;
        while(array[i]!=-1){
            
            System.out.println(array[i]+"         "+array[i*2]+"       "+array[i*2+1]);
            i++;
        }
        
    
    }
    
    public void preorder(int index){
        
        if(array[index]!=-1){
            System.out.println(array[index]);
            preorder(index*2);
            preorder(index*2+1);
            
        }
        
        
            
    
    }
    
    public void inorder(int index){
        
        if(array[index]!=-1){
            
            inorder(index*2);
            System.out.println(array[index]);
            inorder(index*2+1);
            
        }
    
    }
    
    public void postorder(int index){
        
        if(array[index]!=-1){
            
            postorder(index*2);
            
            postorder(index*2+1);
            System.out.println(array[index]);
        }
    
    }
    
    
    
    
    
}
