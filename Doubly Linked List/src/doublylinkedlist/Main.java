package doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl1 = new DoublyLinkedList();
	       dl1.insert(10);
	       dl1.insert(20);
	       dl1.insert(30);
	       dl1.insert(40);
	       dl1.insert(50);
	       dl1.printList();
	       
	       System.out.println(dl1.count);
	       dl1.insertEnd(12);
	       int val = dl1.delete();
	       System.out.println("Deleated value is "+val);
	       dl1.insertAfter(30, 17);
	       dl1.printList();
	       
	       int val2 = dl1.deleteAfter(17);
	       int val3 = dl1.deleteLast();
	       System.out.println("Node containing "+val2+" deleted.");
	       System.out.println("Last node with value "+val3+" deleated");
	       dl1.printList();
	}

}
