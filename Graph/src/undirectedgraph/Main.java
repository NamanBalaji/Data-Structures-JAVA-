package undirectedgraph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GraphAPI g = new GraphAPI(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(5, 3);
        g.addEdge(5, 4);
        g.addEdge(5, 0);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        
         DepthFirstPaths gdfs = new DepthFirstPaths(g,0);
         BreadthFirstPaths gbfs = new BreadthFirstPaths(g,0);
         
         System.out.println("Depth First Paths");
         for(int i=0; i<6; i++) {
        	 System.out.println(i+ "<-"+ gdfs.edgeTo[i]);
         }
         
         System.out.println("Breadth First Paths");
         
         for(int i=0; i<6; i++) {
        	 System.out.println(i+ "<-"+ gbfs.edgeTo[i]);
         }
	}

}
