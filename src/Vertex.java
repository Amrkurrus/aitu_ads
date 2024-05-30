import java.util.Map;

public class Vertex<V> {
    private V data;
    private MyHashTable<Vertex<V>, Double> adjacentVertices;
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }
}
