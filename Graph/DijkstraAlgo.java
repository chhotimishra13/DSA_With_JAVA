public class DijkstraAlgo{
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));
        graph[2].add(new Edge(3,5,1));
    }
    public static void main(String[] args){
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList<>();
        createGraph(graph);

        int src = 0;
        
    }
}