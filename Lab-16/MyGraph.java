import java.util.*;

public class MyGraph {
    public static void main(String[] args) {
        GraphMethods g = new GraphMethods();

        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.dfs(1);


    }
}

class GraphMethods{
    Map<Integer,List<Integer>> adjList;

    GraphMethods(){
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v){
        adjList.putIfAbsent(u,new LinkedList<Integer>());
        adjList.putIfAbsent(v, new LinkedList<Integer>());

        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }


    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);

    }

    public void dfsHelper(int vertex,Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex + " ");
        for(int neighbour : adjList.getOrDefault(vertex, new LinkedList<>())){
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour, visited);
            }
        }
    }


}