package queuearray;

public class QueueArray {
     public int front, rear, capacity;
     public int[] items;
     
     QueueArray(int c){
    	 this.capacity = c;
    	 front = -1;
    	 rear = -1;
    	 items = new int[capacity];
     }
     
     public void enqueue(int val) {
    	 if(rear == capacity-1) {
    		 System.out.println("Queue is full.");
    		 return;
    	 }
    	 if(rear == -1) {
    	 rear++;
    	 front = 0;
    	 items[rear] = val;
    	 }
    	 else {
    		 rear++;
    		 items[rear] = val;
    		 }
     }
     
     public int dequeue(){
    	 if(front == rear+1 || front == -1) {
    		 System.out.println("Queue is empty.");
    		 return -1;
    	 }
    	 int val = items[front];
    	 front++;
    	 return val;
     }
     
     public int peek() {
    	 if(front == rear+1 || front == -1) {
    		 System.out.println("Queue is empty.");
    		 return -1;
    	 }
    	 return items[front];
     }
}
