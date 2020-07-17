package doublylinkedlist;

public class DoublyLinkedList {
   public Node head;
   public int count = 0;
   
   public void insert(int val) {
 	  Node nn = new Node(val);
 	  if(head == null) {
 		  head =nn;
 	  }
 	  else {
 	  nn.next = head;
 	  head.prev = nn;
 	  head = nn;
 	  }
 	  count++;
 	  }
   
   public void insertEnd(int val) {
	   Node current = head;
 	  while(current.next!=null) {
 		  current = current.next;
 	  }
 	  Node nn = new Node(val);
 	  current.next = nn;
 	  nn.prev = current;
 	  count++;
   }
   
   public void insertAfter(int loc, int val) {
 	  Node current = head;
 	  Node nn = new Node(val);
 	  while(current.next!=null && current.data!=loc) {
 		  current=current.next;
 	  }
 	  nn.next = current.next;
 	  current.next.prev = nn;
 	  nn.prev = current;
 	  current.next = nn;
 	  count++;
   }
   
   public int delete() {
	   int val = head.data;
	   head = head.next;
	   head.prev = null;
	   count--;
	   return val;
   }
   
   public int deleteLast() {
	   Node current = head;
	   while(current.next.next!=null) {
		   current = current.next;
	   }
	   int val = current.next.data;
	   current.next.prev = null;
	   current.next = null;
	   count--;
	   return val;
   }
   
   public int deleteAfter(int loc) {
	   Node current = head;
 	   while(current.next!=null && current.data!=loc) {
 		  current=current.next;
 	  }
 	  int val = current.next.data;
 	  current.next.next.prev = current;
 	  current.next = current.next.next;
 	  count--;
 	  return val;
   }
   
   public boolean search(int val){
 	  Node current = head;    
       while (current != null) 
       { 
           if (current.data == val) 
               return true;    
           current = current.next; 
       } 
       return false;
   }
   
   public void printList() {
 	  Node current = head;
 	  while(current != null) {
 		  System.out.println(current.data);
 		  current = current.next;
 	  }
   }
   
}
