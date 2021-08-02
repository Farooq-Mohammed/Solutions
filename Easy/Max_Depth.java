import java.util.*;
import java.lang.*;
import java.io.*;

class Max_Depth {
	
/* Write a Program to Find the Maximum Depth or Height of a Tree */
	
	static class Node {
        	public int data;
        	public Node left;
        	public Node right;
        
        	public Node(){
        	
        	}

        	public Node(int nodeData) {
            		this.data = nodeData;
            		this.left = null;
            		this.right = null;
        	}
    	}
    
	public static void insert(Node root, int data){
        
		Node temp = new Node(data);
        
        	if(root == null){
            		root = temp;
            		return;
        	}
        
        	Node current = root, parent = null;
  
        	while(true) {
            		parent = current;
            		if(data < current.data) {
              			current = current.left;
              			if(current == null){
                  			parent.left = temp;
                  			return;
              			}
            		} else {
              			current = current.right;
              			if(current == null) {
                  			parent.right = temp;
                  			return;
              			}
            		}
        	}//while
    	}
	
	static int Depth(Node root){
		
		if(root == null)	return -1;
		
		int left = Depth(root.left);
        	int right = Depth(root.right);
        
        	return Math.max(left, right) + 1;
		
	}
	
	public static void main(String[] args) {
		
		Node root = new Node();
		
		insert(root, 3);
		insert(root, 1);
		insert(root, 2);
		insert(root, 4);
		insert(root, 5);
		
		System.out.println(Depth(root));
	}
}

Link: https://ideone.com/f7wGSa
