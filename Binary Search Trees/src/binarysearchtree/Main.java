package binarysearchtree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BST tree  = new BST();
        tree.insert(50);
        tree.insert(32);
        tree.insert(60);
        tree.insert(40);
        tree.insert(55);
        tree.insert(70);
        tree.insert(20);
        tree.insert(28);
        tree.inorder();
        System.out.println(" ");
        tree.delete(50);
        tree.preorder();
        System.out.println(" ");
        tree.delete(28);
        tree.insert(37);
        tree.postorder();
	}

}
