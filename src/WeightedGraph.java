import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertexs;

    public WeightedGraph() {
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
        if (vertexs.containsKey(data)) {
            return true;
        } else {
            return false;
        }
    }
}
