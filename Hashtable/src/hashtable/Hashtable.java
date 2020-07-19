package hashtable;
import java.util.*;
public class Hashtable<HTObject> {
	
	public class HTObject {
	      public String key;
	      public int value;
	}
      public final int SIZE = 128;
      public LinkedList<HTObject>[] arr = new LinkedList [SIZE];
      Hashtable() {
    	  for(int i = 0; i<SIZE; i++) {
    		  arr[i]=null;
    	  }
      }
      
      public void put(String name, int data) {
    	  int index = name.hashCode()%SIZE;
    	  LinkedList<HTObject>items = arr[index];
    	  if(items == null) {
    		  items = new LinkedList<HTObject>();
    		  HTObject kvpair = new HTObject();
    		  kvpair.key = name;
    		  kvpair.value = data;
    		  items.add(kvpair);
    		  arr[index]=items;
    	  }
    	  else {
    		  for(HTObject item: items) {
    			  if(item.key.equals(name)) {
    				  item.value = data;
    				  return;
    			  }
    		  }
    		  HTObject kvpair = new HTObject();
    		  kvpair.key = name;
    		  kvpair.value = data;
    		  items.add(kvpair);
    	  }
      }
      
      public void delete(String name) {
    	  int index = name.hashCode()%SIZE;
    	  LinkedList<HTObject>items = arr[index];
    	  if(items == null) return;
    	  for(HTObject item: items) {
    		  if(item.key.equals(name)) {
    			  items.remove(item);
    			  return;
    		  }
    	  }
    	  
      }
      
      public int get(String name) {
    	  int index = name.hashCode()%SIZE;
    	  LinkedList<HTObject>items = arr[index];
    	  if(items == null) return -1;
    	  for(HTObject item: items) {
    		  if(item.key.equals(name)) {
    			    int val = item.value;
    			    return val;
    		  }
    	  }
    	  return 0;
      }
}
