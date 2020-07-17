package stackresizingarray;

public class StackRA {
     public int[] items;
     public int n;
     
     StackRA(){
    	 items = new int[2];
    	 n = 0;
    	 }
     
     public void resize(int capacity) {
    	 int[] copy = new int[capacity];
    	 for(int i =0; i<n; i++) {
    		 copy[i] = items[i];
    	 }
    	 items = copy;
     }
     
     public boolean isEmpty() {
         return n == 0;
     }
     
     public int size() {
         return n;
     }
     
     public void push(int val) {
    	 if(n==items.length) {
    		 resize(2*items.length);
    	 }
    	 items[n] = val;
    	 n++;
     }
     
     public int pop() {
    	 if (isEmpty()) System.out.println("Stack underflow");
         int val = items[n-1];
         items[n-1] = Integer.MIN_VALUE;                              
         n--;
         if (n > 0 && n == items.length/4) resize(items.length/2);
         return val;
     }
     
     public int peek() {
         if (isEmpty()) System.out.println("Stack underflow");
         return items[n-1];
     }
}
