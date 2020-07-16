package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList l1 = new LinkedList();
       l1.insert(10);
       l1.insert(20);
       l1.insert(30);
       l1.insert(40);
       l1.insert(50);
       l1.printList();
       
       System.out.println(l1.count());
       l1.insertEnd(12);
       int val = l1.delete();
       System.out.println("Deleated value is "+val);
       l1.insertAfter(30, 17);
       l1.printList();
       
       int val2 = l1.deleteAfter(17);
       int val3 = l1.deleteLast();
       System.out.println("Node containing "+val2+" deleted.");
       System.out.println("Last node with value "+val3+" deleated");
       l1.printList();
	}

}
