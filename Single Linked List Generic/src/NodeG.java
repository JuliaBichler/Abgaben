public class NodeG<T> {

    private T value;
    private NodeG<T> next = null;

    public NodeG(T value)
    {
        this.value=value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeG<T> getNext() {
        return this.next;
    }

    public void setNext(NodeG<T> next) {
        this.next = next;
    }

}
