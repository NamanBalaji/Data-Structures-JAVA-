package undirectedgraph;

public class DepthFirstPaths {
     public boolean marked[];
     public int edgeTo[];
     public int s;
     
     DepthFirstPaths(GraphAPI G, int s){
    	 marked = new boolean[G.V];
    	 edgeTo = new int[G.V];
    	 this.s = s;
    	 dfs(G,s);
     }
     
     public void dfs(GraphAPI G, int v){
    	 marked[v]=true;
    	 for(int w: G.adj(v)) {
    		 if(!marked[w]) {
    			 dfs(G,w);
    			 edgeTo[w]=v;
    		 }
    	 }
     }
    
}
