import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertexs;

    public WeightedGraph(boolean idk) {
        // I don't know why we need this boolean
        this.vertexs = new Hashtable<>();
    }

    public void addVertex(V data) {
        vertexs.put(data, new Vertex<>(data));
    }

    public void removeVertex(V data) {
        if (!existVertex(data)) {
            System.out.println("There is no such Vertex");
            return;
        }
        Vertex<V> vertexToRemove = vertexs.remove(data);
        for (Vertex<V> vertex : vertexs.values()) {
            vertex.removeAdjVertex(vertexToRemove);
        }

    }

    private boolean existVertex(V data) {
        return vertexs.containsKey(data);
    }

    public void addEdge(V from, V to, double weight) {
        if (existVertex(from) && existVertex(to)){
            Vertex<V> vFrom = vertexs.get(from);
            Vertex<V> vTo = vertexs.get(to);
            vFrom.addAdjacentVertex(vTo, weight);
            vTo.addAdjacentVertex(vFrom, weight);
        }
    }

}
