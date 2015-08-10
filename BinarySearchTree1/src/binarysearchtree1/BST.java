/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree1;

/**
 *
 * @author Hashim
 */


//////////////////////////////////////////////
/* Class BST */
//////////////////////////////////////////////
class BST{
    private BSTNode root;
    /* Constructor: Creates an Empty BinarySearchTree */
    public BST(){
        root = null;
    }   
    /* Method to check if tree is empty */
    public boolean isEmpty(){
        return root == null;
    }
    /* Methods to insert data */
    public void insert(int data){
        root = insert(root, data);
    }
    /* Method to insert data recursively */
    private BSTNode insert(BSTNode node, int data){
        if (node == null)
            node = new BSTNode(data);
        else{
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    /* Methods to delete data */
    public void delete(int k){
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else
        {
            this.deleteUsingLeftSubTree(k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    /////////////// DELETE USING LEFT SUB TREE ////////////////////
    void deleteUsingLeftSubTree(int value){
        BSTNode p;
        BSTNode q;
        q=null; //parent of root
        p = root;
        while(p != null)
        {
            if (value == p.getData() )
              break;
            if (value > p.getData() )
            {
                q = p;
                p = p.getRight();
            }
            else
            {
                q = p;
                p = p.getLeft();
            }
        }
        if( p.getLeft()!= null && p.getRight()!=null)
            {
                BSTNode temp=p;
                q = p;
                //find successor of node p. It will be the leftmost node in p's right sub-tree
                p = p.getLeft(); // get right child of p.
                while(p.getRight()!=null) // search left most child
                {
                    q = p;
                    p = p.getRight();
                }
                temp.setData(p.getData());
            }
// if p is a leaf node
            if( p.getLeft() == null && p.getRight() == null)
            {
                if(q.getRight() == p)
                    q.setRight(null);
                else
                    q.setLeft(null);
            }
//p is a node with only one child which in this case is its right child
            if( p.getLeft()==null && p.getRight()!=null)
            {
                if ( q.getRight() == p)
                    q.setRight(p.getRight());
                else
                    q.setLeft(p.getRight());
            }
//p is a node with only one child which in this case is its left child
            if( p.getLeft() != null && p.getRight() == null)
            {
                if(q.getRight() == p)
                    q.setRight(p.getLeft());
                else
                    q.setLeft(p.getLeft()); 
            }
    }
///////////////////
    public void deleteUsingRightSubTree(int value){
        BSTNode p;
        BSTNode q;
        q=null; //parent of root
        p = root;
        while(p != null)
        {
            if (value == p.getData() )
              break;
            if (value > p.getData() )
            {
                q = p;
                p = p.getRight();
            }
            else
            {
                q = p;
                p = p.getLeft();
            }
            
        } //end of while(p!=null)
//if p is a node with two child nodes then this chunk of the code finds the replacement node (successor to be exact)
// in the leftmost branch of the right subtree of the node to be deleted. Then, this code overrides the
//value of the to be deleted node with the value stored in the replacement node.
// Now, the replacement node has to be deleted from the BST.
//The references to the replacement node and its parent node are in p and q respectively.
// The replacement node will be deleted by the remaining code of this method.
            if( p.getLeft()!= null && p.getRight()!=null)
            {
                BSTNode temp=p;
                q = p;
                //find successor of node p. It will be the leftmost node in p's right sub-tree
                p = p.getRight(); // get right child of p.
                while(p.getLeft()!=null) // search left most child
                {
                    q = p;
                    p = p.getLeft();
                }
                temp.setData(p.getData());
            }
// if p is a leaf node
            if( p.getLeft() == null && p.getRight() == null)
            {
                if(q.getRight() == p)
                    q.setRight(null);
                else
                    q.setLeft(null);
            }
//p is a node with only one child which in this case is its right child
            if( p.getLeft()==null && p.getRight()!=null)
            {
                if ( q.getRight() == p)
                    q.setRight(p.getRight());
                else
                    q.setLeft(p.getRight());
            }
//p is a node with only one child which in this case is its left child
            if( p.getLeft() != null && p.getRight() == null)
            {
                if(q.getRight() == p)
                    q.setRight(p.getLeft());
                else
                        q.setLeft(p.getLeft()); 
            }
        }
/* Methods to search for an element */
    public boolean search(int val){
        return search(root, val);
    }
    
/* Method to search for an element recursively */
    private boolean search(BSTNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
                found = search(r, val);
            }
        return found;
    }
    public void preorder()
     {
         preorder(root);
     }
     private void preorder(BSTNode r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
     /////////////////// COUNT TOTAL NODES ///////////////////
     public int countNodes()
     {
         return countNodes(root);
     }
     /* Function to count number of nodes recursively */
     private int countNodes(BSTNode r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     
     //////////// COUNT LEAF NODES ///////////////
     public int countLeaves()
	{
		return countLeaves(root);
	}

	private int countLeaves(BSTNode t)
	{
		if(t != null)
		{
			if(t.left == null & t.right==null)
			{
				return 1;
			}
			else
				return countLeaves(t.left) + countLeaves(t.right);
		}
		return 0;
	}
     
     ///////// Insert Iteratively ////////////////////
     public void insertIteratively(int key) {
        BSTNode z = new BSTNode(key);
        if (root == null) { 
            root = z; 
            return; 
        }
        BSTNode parent = null; 
        BSTNode x = root;
        while (x != null) {
            parent = x;
            
            if(key < x.getData()) 
                x = x.left;
            else if (key > x.getData()) 
                x = x.right;
            else { 
                x.setData(key);
                return; 
            }   
        }
        
        
    }
   
     
}

