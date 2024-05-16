public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }

        public HashNode<K, V> getNext() {
            return next;
        }

        public void setNext(HashNode<K, V> next) {
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
    }

    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[this.M];
    }

    private int hash(K key) {
        int hash = (key.hashCode()) % M;
        return hash;
    }

    public void put(K key, V value) {
        HashNode<K, V> node = new HashNode<>(key, value);
        int bucket = hash(key);
        chainArray[bucket] = node;

    }

    public V get(K key) {
        int bucket = hash(key);
        return chainArray[bucket].getValue();
    }

    public V remove(K key) {
        int bucket = hash(key);
        V value = chainArray[bucket].getValue();
        chainArray[bucket] = null;
        return value;
    }
}
