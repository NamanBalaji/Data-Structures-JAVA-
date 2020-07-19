package weighteddigraph;

import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstPaths {
	public boolean marked[];
    public int edgeTo[];
    public int s;
    BreadthFirstPaths(DigraphAPI G, int s){
   	 marked = new boolean[G.V];
   	 edgeTo = new int[G.V];
   	 this.s = s;
   	 bfs(G,s);
    }
    public void bfs(DigraphAPI G, int v) {
   	 Queue<Integer> q = new LinkedList<>();
   	 q.add(v);
   	 marked[v] = true;
   	 while(q.size()!=0) {
   		 int x= q.remove();
   		 for(int w: G.adj(v)) {
   			 if(!marked[w]) {
   				 q.add(w);
   				 marked[w]=true;
   				 edgeTo[w]=x;
   			 }
   		 }
   	 }
    }
}
