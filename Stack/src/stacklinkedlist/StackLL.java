package stacklinkedlist;

public class StackLL {
     Node head;
     int count = 0;
     
     public void push(int val) {
    	 Node nn = new  Node(val);
    	 nn.next = head;
    	 head = nn;
    	 count++;
     }
     
     public int pop() {
    	 int val = head.data;
    	 head = head.next;
    	 count--;
    	 return val;
     }
     
     public int peek() {
    	 return head.data;
     }
     
     public int size() {
    	 return this.count;
     }
     
     public boolean isEmpty() {
    	 return head == null;
     }
}
