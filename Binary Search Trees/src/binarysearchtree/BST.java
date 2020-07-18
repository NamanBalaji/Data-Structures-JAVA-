package binarysearchtree;

public class BST {
     Node root = null;
     
     public void insert(int val) {
    	 Node nn  = new Node(val);
    	 if(root == null) {
    		 root = nn;
    	 }
    	 else {
    		 Node x = root; 
    		 Node y = null;  
    		 while (x != null) {  
    		        y = x;  
    		        if (val < x.data)  
    		            x = x.leftChild;  
    		        else
    		            x = x.rightChild;  
    		    } 
    		 if (y == null)  
    		        y = nn;  
    		 else if (val < y.data)  
    		        y.leftChild = nn;  
    		 else
    		        y.rightChild = nn;
    	 }
     }
     
     public Node search(Node root, int key) 
     { 
         if (root==null || root.data==key) 
             return root; 
       
         if (root.data > key) 
             return search(root.leftChild, key); 

         return search(root.rightChild, key); 
     } 
     
     Node deleteRec(Node root, int key) 
     { 
         /* Base Case: If the tree is empty */
         if (root == null)  return root; 
   
         /* Otherwise, recur down the tree */
         if (key < root.data) 
             root.leftChild = deleteRec(root.leftChild, key); 
         else if (key > root.data) 
             root.rightChild = deleteRec(root.rightChild, key); 
   
         // if key is same as root's key, then This is the node 
         // to be deleted 
         else
         { 
             // node with only one child or no child 
             if (root.leftChild == null) 
                 return root.rightChild; 
             else if (root.rightChild == null) 
                 return root.leftChild; 
   
             // node with two children: Get the inorder successor (smallest 
             // in the right subtree) 
             root.data = minValue(root.rightChild); 
   
             // Delete the inorder successor 
             root.rightChild = deleteRec(root.rightChild, root.data); 
         } 
   
         return root; 
     } 
     int minValue(Node root) 
     { 
         int minv = root.data; 
         while (root.leftChild != null) 
         { 
             minv = root.leftChild.data; 
             root = root.leftChild; 
         } 
         return minv; 
     } 
     void delete(int val) 
     { 
         root = deleteRec(root, val); 
     }
     
     public void inorder() {
    	 inorderHelper(root);
     }
     public void inorderHelper(Node root) {
    	 if (root != null) 
         { 
             inorderHelper(root.leftChild); 
             System.out.print(root.data + " "); 
             inorderHelper(root.rightChild); 
         } 
     }
     public void preorder() {
    	 preorderHelper(root);
     }
     public void preorderHelper(Node root) {
    	 if (root != null) 
         { 
    		 System.out.print(root.data + " ");
    		 inorderHelper(root.leftChild);  
             inorderHelper(root.rightChild); 
         } 
     }
     
     public void postorder() {
    	 postorderHelper(root);
     }
     public void postorderHelper(Node root) {
    	 if (root != null) 
         { 
    		 
    		 inorderHelper(root.leftChild);  
             inorderHelper(root.rightChild); 
             System.out.print(root.data + " ");
         } 
     }
    }

