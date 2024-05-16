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

    public void put(K key, V value) { // To put new element
        HashNode<K, V> node = new HashNode<>(key, value);
        int bucket = hash(key);
        if (chainArray[bucket] == null) {
            chainArray[bucket] = node;
        } else {
            node.setNext(chainArray[bucket]);
            chainArray[bucket] = node;

        }
        size++;
    }

    public V get(K key) { //to get Value
        int bucket = hash(key);
        HashNode<K, V> head = chainArray[bucket];
        while (head != null) {
            if (head.getKey() == key) {
                return head.getValue();
            }
            head = head.getNext();
        }
        System.out.println("No such element, return: ");
        return null;
    }

    public V remove(K key) { // to delete element in table
        int bucket = hash(key);
        HashNode<K, V> head = chainArray[bucket];
        while (head.getNext() != null) {
            if (head.getNext().getKey() == key) {
                HashNode<K, V> node = head.getNext();
                head.setNext(node.getNext());
                V value = node.getValue();
                node.setNext(null);
                size--;
                return value;
            }
            head = head.getNext();
        }
        System.out.println("There is no such element, return: ");
        return null;
    }

    public boolean contains(V value) { // check all elements in table
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            while (head != null) {
                if (head.getValue() == value){
                    return true;
                }
                head = head.getNext();
            }
        }
        return false;
    }

    public  K getKey(V value) {
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            while (head != null) {
                if (head.getValue() == value){
                    return head.getKey();
                }
                head = head.getNext();
            }
        }
        System.out.println("There is no such element, return: ");
        return null;
    }

    public void print() { //to print all elements in table
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            int c = 0;
            while (head != null) {
                System.out.println(head.getKey() + "   " + head.getValue());
                head = head.getNext();
                c++;
            }
            System.out.println("Bucket: " + i + "  size: " + c);
        }
        System.out.println("Total size: " + size);
    }
}
