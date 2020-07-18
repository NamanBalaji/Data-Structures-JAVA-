package maxheap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MaxHeap mh = new MaxHeap(5);
        mh.insert(10);
        mh.insert(20);
        mh.insert(30);
        mh.insert(40);
        int val1 = mh.extract();
        int val2 = mh.peek();
        System.out.println("Extracted value is : " + val1);
        System.out.println("Maximum value in heap is : " + val2);
	}

}
