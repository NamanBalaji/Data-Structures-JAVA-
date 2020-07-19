package undirectedgraph;
import java.util.*;
public class GraphAPI {
    public final int V;
    public LinkedList<Integer>[] adj;
    GraphAPI(int v){
    	V = v;
    	adj = new LinkedList [V];
    	for(int i=0;i<v;i++) {
    		adj[i]=new LinkedList<Integer>();
    	}
    	}
    void addEdge(int v, int w) {
    	adj[v].add(w);
    	adj[w].add(v);
    }
    public Iterable<Integer> adj(int v){
    	return adj[v];
    }
}
