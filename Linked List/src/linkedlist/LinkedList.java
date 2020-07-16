package linkedlist;

public class LinkedList {
      Node head;
      
      public void insert(int val) {
    	  Node nn = new Node(val);
    	  nn.next = head;
    	  head = nn;
    	  }
      
      public void insertEnd(int val) {
    	  Node current = head;
    	  while(current.next!=null) {
    		  current = current.next;
    	  }
    	  Node nn = new Node(val);
    	  current.next = nn;
      }
      
      public void insertAfter(int loc, int val) {
    	  Node current = head;
    	  Node nn = new Node(val);
    	  while(current.next!=null && current.data!=loc) {
    		  current=current.next;
    	  }
    	  nn.next = current.next;
    	  current.next = nn;
      }
      
      public int delete() {
    	  int val = head.data;
    	  head = head.next;
    	  return val;
      }
      
      public int deleteLast() {
    	  Node current = head;
    	  while(current.next.next!=null) {
    		  current = current.next;
    	  }
    	  int val = current.next.data;
    	  current.next = null;
    	  return val;
      }
      
      public int deleteAfter(int loc) {
    	  Node current = head;
    	  while(current.next!=null && current.data!=loc) {
    		  current=current.next;
    	  }
    	  int val = current.next.data;
    	  current.next = current.next.next;
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
      
      public int count() {
    	  Node current = head; 
          int count = 0; 
          while (current != null) 
          { 
              count++; 
              current = current.next; 
          } 
          return count; 
      }
      
      public void printList() {
    	  Node current = head;
    	  while(current != null) {
    		  System.out.println(current.data);
    		  current = current.next;
    	  }
      }
}
