package hashtable;

import hashtable.Hashtable.HTObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable ht = new Hashtable<HTObject>();
        ht.put("Pen", 20);
        ht.put("Notebook", 3);
        int quantity = ht.get("Pen");
        ht.delete("Pen");
        System.out.println(quantity);
	}

}
