package weighteddigraph;

public class Main {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        DigraphAPI g = new DigraphAPI(6);
	        DigraphAPI.DirectedEdge e1 = g.new DirectedEdge(0,1,2);
	        DigraphAPI.DirectedEdge e2 = g.new DirectedEdge(0,2,8);
	        DigraphAPI.DirectedEdge e3 = g.new DirectedEdge(0,5,4);
	        DigraphAPI.DirectedEdge e4 = g.new DirectedEdge(5,3,6);
	        DigraphAPI.DirectedEdge e5 = g.new DirectedEdge(5,4,2);
	        DigraphAPI.DirectedEdge e6 = g.new DirectedEdge(5,0,1);
	        DigraphAPI.DirectedEdge e7 = g.new DirectedEdge(4,3, 0);
	        DigraphAPI.DirectedEdge e8 = g.new DirectedEdge(4,5, 0);
	           
	        g.add(e1);
	        g.add(e2);
	        g.add(e3);
	        g.add(e4);
	        g.add(e5);
	        g.add(e6);
	        g.add(e7);
	        g.add(e8);
	        
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


