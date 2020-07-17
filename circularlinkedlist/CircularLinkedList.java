package circularlinkedlist;

public class CircularLinkedList {
	public Node head =null;  
    public Node tail = null;  
    public int count = 0;
    public void insert(int val) {  // Here we insert in the end by default.    	
          Node nn = new Node(val);
          if(head == null) {  
             head = nn;  
             tail = nn;  
             nn.next = head;  
         }  
         else {    
             tail.next = nn;    
             tail = nn;  
             tail.next = head;  
         }
          count++;
    }
    
    public void insertBeg(int val) {
    	 Node nn = new Node(val);
    	 nn.next = head;
    	 tail.next = nn;
    	 head = nn;
    	 count++;
    }
    
    public void insertAfter(int loc, int val) {
    	Node current = head;
  	  Node nn = new Node(val);
  	  while(current.next!=tail && current.data!=loc) {
  		  current=current.next;
  	  }
  	  nn.next = current.next;
  	  current.next = nn;
  	  count++;
    }
    
    public int delete() { // Deleting the first Node.
    	int val = head.data;
    	tail.next = head.next;
    	head = head.next;
    	count--;
    	return val;
    }
    
    public int deleteAfter(int loc) {
  	  Node current = head;
  	  while(current.next!=tail && current.data!=loc) {
  		  current=current.next;
  	  }
  	  int val = current.next.data;
  	  current.next = current.next.next;
  	  count--;
  	  return val;
    }
    
    public int deleteLast() {
    	Node current = head;
    	while(current.next!=tail) {
    		current = current.next;
    	}
    	int val = current.next.data;
    	current.next = head;
    	tail.next = null;
    	tail = current;
    	count--;
    	return val;
    }
    
    public void printList() {
  	  System.out.println(head.data);
      Node current = head.next;
  	  while(current != head) {
  		  System.out.println(current.data);
  		  current = current.next;
  	  }
    }
    
    public boolean search(int val){
  	  Node current = head;    
        while (current != head) 
        { 
            if (current.data == val) 
                return true;    
            current = current.next; 
        } 
        return false;
    }
    
}
