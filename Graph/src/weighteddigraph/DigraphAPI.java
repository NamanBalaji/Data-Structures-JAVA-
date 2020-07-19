package weighteddigraph;
import java.util.LinkedList;
public class DigraphAPI{
	public class DirectedEdge {
	      public final int v, w;
	      public final double weight;
	      DirectedEdge(int v, int w, int weight){
	    	  this.v = v;
	    	  this.w = w;
	    	  this.weight = weight;
	      }
	}
	 public final int V;
	    public LinkedList<Integer>[] adj;
	    DigraphAPI(int v){
	    	V = v;
	    	adj = new LinkedList [V];
	    	for(int i=0;i<v;i++) {
	    		adj[i]=new LinkedList<Integer>();
	    	}
	    	}
	    public void add(DirectedEdge e) {
    		int f = e.v;
    		adj[f].add(e.w);
    	}
	    
	    public Iterable<Integer> adj(int v){
	    	return adj[v];
	    	}
}
