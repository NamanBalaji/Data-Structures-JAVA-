package queuearray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        int val1 = q.dequeue();
        int val2 = q.dequeue();
        q.enqueue(40);
        int val3 = q.peek();
        
        System.out.println("First dequed value is " + val1);
        System.out.println("Second dequed value is " + val2);
        System.out.println("Value at the front of the queue is " + val3);
       }

}
