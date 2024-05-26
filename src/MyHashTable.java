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
    double loadFactor = 0.75;

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
        if ((double) size / (double) chainArray.length > loadFactor) {
            doubleSize();
        }

    }

    public void doubleSize() {
        M *= 2;
        HashNode[] chainArray2 = new HashNode[M];
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            while (head != null) {
                HashNode<K, V> node = new HashNode<>(head.getKey(), head.getValue());
                int hash = hash(head.getKey());
                if (chainArray2[hash] == null) {
                    chainArray2[hash] = head;
                } else {
                    node.setNext(chainArray2[hash]);
                    chainArray2[hash] = node;
                }
                head = head.getNext();
            }
        }
        chainArray = chainArray2;
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
                if (head.getValue() == value) {
                    return true;
                }
                head = head.getNext();
            }
        }
        return false;
    }

    public K getKey(V value) {
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            while (head != null) {
                if (head.getValue() == value) {
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
//                System.out.println(head.getKey() + "   " + head.getValue());
                head = head.getNext();
                c++;
            }
            if (c != 0) {
                System.out.println("Bucket: " + i + "  size: " + c);
            }
        }

        System.out.println("Total size: " + (size - 1));
    }

    public void printFull() { //to print all elements in table
        for (int i = 0; i < chainArray.length; i++) {
            HashNode<K, V> head = chainArray[i];
            int c = 0;
            while (head != null) {
                System.out.println(head.getKey() + "   " + head.getValue());
                head = head.getNext();
                c++;
            }
            if (c != 0) {
                System.out.println("Bucket: " + i + "  size: " + c);
            }
        }

        System.out.println("Total size: " + (size - 1));
    }
}
