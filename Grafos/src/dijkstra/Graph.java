package dijkstra;
import java.util.List;

public class Graph {
    private final List<Vertice> vertexes;
    private final List<Arco> edges;

    public Graph(List<Vertice> vertexes, List<Arco> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertice> getVertexes() {
        return vertexes;
    }

    public List<Arco> getEdges() {
        return edges;
    }

}
