package queuelinkedlist;

public class QueueLL {
      public Node head = null;
      public int count = 0;
      
      public void enqueue(int val) {
    	  Node nn = new Node(val);
    	  if(head == null) {
    		 head = nn;
    		 head.next = null;
    	  }
    	  else {
    		Node current = head;
    		while(current.next!=null) {
    			current = current.next;
    		}
    		current.next = nn;
    		nn.next = null;
    	  }
    	  count++;
    	}
      
      public int dequeue() {
    	  if (head==null) {
    		  System.out.println("Queue is empty.");
    		  return -1;
    	  }
    	  int val = head.data;
    	  head = head.next;
    	  count--;
    	  return val;
      }
      
      public int peek() {
    	  if (head==null) {
    		  System.out.println("Queue is empty.");
    		  return -1;
    	  }
    	  return head.data;
      }
}
