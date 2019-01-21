class BinarySearchTree {

    class Node {
        int value;
        Node left, right;

        public Node(int item) {
            value = item;
            left = right = null;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    Node head;

    BinarySearchTree() {
        head = null;
    }

    void insert(int value) {
        head = insert(head, value);
    }
    Node insert(Node head, int value) {

        if (head == null) {
            head = new Node(value);
            return head;
        }

        if (value < head.value)
            head.left = insert(head.left, value);
        else if (value > head.value)
            head.right = insert(head.right, value);

        return head;
    }

    public boolean search(int value) {
        return search(head, value);
    }
    private boolean search(Node head, int value) {
        boolean found = false;

        while ((head != null) && !found) {
            int tmp = head.value;
            if (value < tmp)
                head = head.getLeft();
            else if (value > tmp)
                head = head.getRight();
            else {
                found = true;
                break;
            }
            found = search(head, value);
        }
        return found;
    }

    public void delete(int value) {
        delete(head, value);
    }
    Node delete(Node head, int value) {
        if (head == null) return head;

        if (value < head.value) {
            head.left = delete(head.left, value);
        }
        else if (value > head.value)
            head.right = delete(head.right, value);
        else {
            if (head.left == null) {
                return head.right;
            } else if (head.right == null) {
                return head.left;
            }

            head.value = minValue(head.right);
            head.right = delete(head.right, head.value);

        }
        return head;
    }

    public int maxDepth() {
        return(maxDepth(head));
    }
    private int maxDepth(Node node) {
        if (node==null) {
            return(0);
        }
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            return(Math.max(lDepth, rDepth)+1);
        }
    }

    int minValue(Node tmp) {
        int min = tmp.value;
        while (tmp.left != null) {
            min = tmp.left.value;
            tmp = tmp.left;
        }
        return min;
    }

    public void print()
    {
        print(head);
    }

    public void print(Node node)
    {
        int [][] baum= new int [10][10];

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(100);
        tree.insert(50);
        tree.insert(150);
        tree.insert(25);
        tree.insert(125);
        tree.insert(75);
        tree.insert(175);

        //System.out.println(tree.maxDepth());

        //System.out.println(tree.search(50));

        tree.print();

        //tree.delete(50);
    }
}





