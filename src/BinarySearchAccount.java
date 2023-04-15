public class BinarySearchAccount<T extends Comparable<T>> {
    private Node<T> root;

    private static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }

    public void insert(T data) {
        root = insertHelper(root, data);
    }

    private Node<T> insertHelper(Node<T> node, T data) {
        if (node == null) {
            node = new Node<T>(data);
        } else if (data.compareTo(node.data) < 0) {
            node.left = insertHelper(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = insertHelper(node.right, data);
        }
        return node;
    }

    public T find(String key) {
        Node<T> node = findHelper(root, key);
        return node != null ? node.data : null;
    }

    private Node<T> findHelper(Node<T> node, String key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(((Account)node.data).getName());
        if (cmp < 0) {
            return findHelper(node.left, key);
        } else if (cmp > 0) {
            return findHelper(node.right, key);
        } else {
            return node;
        }
    }

    public T delete(String key) {
        Node<T> node = deleteHelper(root, key);
        return node != null ? node.data : null;
        //root = deleteHelper(root, key);
    }

    private Node<T> deleteHelper(Node<T> node, String key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(((Account)node.data).getName());
        if (cmp < 0) {
            node.left = deleteHelper(node.left, key);
        } else if (cmp > 0) {
            node.right = deleteHelper(node.right, key);
        } else {
            // Found the node to delete
            if (node.left == null) {
                // Case 1: Node has no left child
                return node.right;
            } else if (node.right == null) {
                // Case 2: Node has no right child
                return node.left;
            } else {
                // Case 3: Node has two children
                Node<T> minRight = findMin(node.right);
                node.data = minRight.data;
                node.right = deleteHelper(node.right, ((Account)minRight.data).getName());
            }
        }
        return node;
    }

    private Node<T> findMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void inorder() {
        inorderHelper(root);
    }

    private void inorderHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.left);
        System.out.println(((Account)node.data).getName() + ", " + ((Account)node.data).getDescription());
        inorderHelper(node.right);
    }
}