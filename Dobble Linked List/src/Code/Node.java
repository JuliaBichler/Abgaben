package Code;

public class Node<T> {

    private T value;
    private Node<T> next = null;
    private Node<T> prev = null;

    public Node(T value)
    {
        this.value=value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getPrev() {
        return prev;
    }
}
