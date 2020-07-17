package circularlinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl1 = new CircularLinkedList();
	       cl1.insert(10);
	       cl1.insert(20);
	       cl1.insert(30);
	       cl1.insert(40);
	       cl1.insert(50);
	       cl1.insert(70);
	       cl1.insert(800);
	       cl1.insert(90);
	       cl1.printList();
	       
	       System.out.println(cl1.count);
	       cl1.insertBeg(12);
	       int val = cl1.delete();
	       System.out.println("Deleated value is "+val);
	       cl1.insertAfter(30, 17);
	       cl1.printList();
	       
	       int val2 = cl1.deleteAfter(17);
	       int val3 = cl1.deleteLast();
	       System.out.println("Node containing "+val2+" deleted.");
	       System.out.println("Last node with value "+val3+" deleated");
	       cl1.printList();
	}

}
