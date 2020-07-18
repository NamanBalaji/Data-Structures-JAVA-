package minheap;

public class MinHeap {
	int[] heap;
    int n = 1;
    int capacity;
    MinHeap(int capacity){
  	  this.capacity = capacity+1;
  	  heap = new int[capacity];
    }
    
    public void insert(int val) {
  	  if(n<capacity) {
  		  heap[n] = val;
  		  swim(n);
  		  n++;
  		  }
  	  else {
  		  System.out.println("Heap is full,");
  		  return;
  	  }
    }
    
    public int extract() {
  	  if(n==0) {
  		  System.out.println("Heap is empty.");
  		  return -1;
  	  }
  	  int val = heap[1];
  	  heap[1] = heap[n-1];
  	  sink(1);
  	  n--;
  	  return val;
    }
    
    public int peek() {
  	  return heap[1];
    }
    
    public void swim(int index) {
  	  while(index>1 && heap[index]<heap[index/2]) {
  		 int temp = heap[index];
  		 heap[index] = heap[index/2];
  		 heap[index/2] = temp;
  		 index = index/2;
  	  }
    }
    
    public void sink(int index) {
  	  while(2*index<n) {
  		  int j = 2*index;
  		  if(j<n-1 && heap[j]<heap[j+1]) j++;
  		  if(heap[j]>heap[index]) break;
  		  int temp = heap[j];
  		  heap[j] = heap[index];
  		  heap[index] = temp;
  		  index = j;
  	  }
    }
}
