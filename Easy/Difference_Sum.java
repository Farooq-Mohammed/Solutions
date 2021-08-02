import java.util.*;
import java.lang.*;
import java.io.*;

class Difference_Sum {

/* Difference between sums of odd level and even level nodes of a Binary Tree */

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
    
    	static int evenSum = 0;
    	static int oddSum = 0;
    	
	public static void function(Node root, int level){
		
		if(root == null)	return;
		
		if(level%2 == 0){
			evenSum += root.data;
		}else {
			oddSum += root.data;
		}
		
		level += 1;
		function(root.left, level);
		function(root.right, level);
		
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Node root = new Node();
		
		insert(root, 5);
		insert(root, 2);
		insert(root, 6);
		insert(root, 1);
		insert(root, 4);
		insert(root, 8);
		insert(root, 3);
		insert(root, 7);
		insert(root, 9);
		
		function(root, 0);

		System.out.println(Math.abs(evenSum - oddSum));
		
	}
}

Link: https://ideone.com/GNBQiY



