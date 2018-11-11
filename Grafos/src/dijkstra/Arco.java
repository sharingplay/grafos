package dijkstra;

public class Arco {
    private final String id;
    private final Vertice source;
    private final Vertice destination;
    private final int weight;

    public Arco(String id, Vertice source, Vertice destination, int weight) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public Vertice getDestination() {
        return destination;
    }

    public Vertice getSource() {
        return source;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }
}
