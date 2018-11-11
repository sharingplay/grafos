import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dijkstra.Arco;
import dijkstra.DijkstraAlgorithm;
import dijkstra.Graph;
import dijkstra.Vertice;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDijkstra {
    private List<Vertice> nodes;
    private List<Arco> edges;
    private String[] lugares;

    @Test
    public void testExcute() {
        nodes = new ArrayList<Vertice>();
        edges = new ArrayList<Arco>();
        lugares = new String[]{"San Ramon", "Palmares", "Naranjo", "Grecia", "Alajuela", "San Jose","Cartago","Puntarenas","Heredia","San Juan","Perez Zeledon"};
        for (int i = 0; i < 11; i++) {
            Vertice location = new Vertice("Node_" + i, lugares[i]);
            nodes.add(location);
        }
        addLane("Edge_0", 0, 1, 85);
        addLane("Edge_1", 0, 2, 200);
        addLane("Edge_2", 0, 4, 300);
        addLane("Edge_3", 2, 6, 250);
        addLane("Edge_4", 2, 7, 350);
        addLane("Edge_5", 3, 7, 400);
        addLane("Edge_6", 5, 8, 100);
        addLane("Edge_7", 8, 9, 450);
        addLane("Edge_8", 7, 9, 200);
        addLane("Edge_9", 4, 9, 500);
        addLane("Edge_10", 9, 10, 300);
        addLane("Edge_11", 1, 10, 700);


        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Vertice> path = dijkstra.getPath(nodes.get(9));

        assertNotNull(path);
        assertTrue(path.size() > 0);

        for (Vertice vertex : path) {
            System.out.println(vertex);
        }

    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
        Arco lane = new Arco(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
}