package stackresizingarray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackRA s = new StackRA();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        int val1 = s.pop();
        s.push(50);
        int val2 = s.peek();
        int size = s.size();
        System.out.println("Popped value is " + val1);
        System.out.println("Value at top of the stack is " + val2);
        System.out.println("Total elements in the stack: " + size);
	}

}
