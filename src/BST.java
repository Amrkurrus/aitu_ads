import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BST<K extends Comparable<K>, V> {
    private bstNode root;
    private int size;

    private class bstNode<K, V> {
        private K key;
        private V val;
        private bstNode left, right;

        public bstNode(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return val;
        }

        public void setValue(V val) {
            this.val = val;
        }

        public bstNode getLeft() {
            return left;
        }

        public void setLeft(bstNode left) {
            this.left = left;
        }

        public bstNode getRight() {
            return right;
        }

        public void setRight(bstNode right) {
            this.right = right;
        }
    }

    public void put(K key, V val) {
        bstNode<K, V> node = new bstNode(key, val);
        if (root == null) {
            root = node;
            size++;
        } else {
            bstNode<K, V> head = root;
            while (true) {
                int cmp = head.getKey().compareTo(node.getKey());
                if (cmp == 0) {
                    node.setLeft(head.getLeft());
                    node.setRight(head.getRight());
                    break;
                }
                if (cmp > 0) {
                    if (head.getLeft() != null) {
                        head = head.getLeft();
                    } else {
                        head.setLeft(node);
                        size++;
                        break;
                    }
                }
                if (cmp < 0) {
                    if (head.getRight() != null) {
                        head = head.getRight();
                    } else {
                        head.setRight(node);
                        size++;
                        break;
                    }
                }
            }
        }
    }

    public V get(K key) {
        bstNode<K, V> head = root;
        while (true) {
            int cmp = head.getKey().compareTo(key);
            if (cmp == 0) {
                return head.getValue();
            }
            if (cmp > 0) {
                head = head.getLeft();
            }
            if (cmp < 0) {
                head = head.getRight();
            }
            if (head == null) {
                System.out.println("No such element");
            }
        }
    }

    public void delete(K key) {
        bstNode<K, V> node = getNode(key);
        if (node.getLeft() == null && node.getRight() == null) {
            node = null;
        }
        if (node.getLeft() != null && node.getRight() == null) {
            node = node.getLeft();
        }
        if (node.getLeft() == null && node.getRight() != null) {
            node = node.getRight();
        }
        if (node.getLeft() != null && node.getRight() != null) {
            node = findMin(node.getRight());
        }
        size--;
    }

    public Iterable<K> iterator() {
        List<K> keys = new ArrayList<>();
        iterator_f(root, keys);
        return keys;
    }

    public void iterator_f(bstNode<K, V> node, List<K> keys) {
        if (node == null) return;
        iterator_f(node.getLeft(), keys);
        keys.add(node.getKey());
        iterator_f(node.getRight(), keys);
    }

    public bstNode<K, V> getNode(K key) {
        bstNode<K, V> head = root;
        while (true) {
            int cmp = head.getKey().compareTo(key);
            if (cmp == 0) {
                return head;
            }
            if (cmp > 0) {
                head = head.getLeft();
            }
            if (cmp < 0) {
                head = head.getRight();
            }
            if (head == null) {
                System.out.println("No such element");
            }
        }
    }

    private bstNode<K, V> findMin(bstNode<K, V> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    private bstNode<K, V> findMax(bstNode<K, V> node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }

    public int getSize() {
        return size;
    }
}
