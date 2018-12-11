package Code;

public class DLL<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size;

    public DLL()
    {
        size=0;
    }

    public void addB(T value){
        Node newNode = new Node(value);
        newNode.setValue(value);
        newNode.setNext(null);
        newNode.setPrev(tail);
        if(tail!=null)
            tail.setNext(newNode);
        tail = newNode;
        if(head==null)
            head=newNode;
        size++;
    }
    public void addF(T value){
        Node newNode = new Node(value);
        newNode.setValue(value);
        newNode.setNext(head);
        newNode.setPrev(null);
        if(head!=null)
           head.setPrev(newNode);
        head = newNode;
        if(tail==null)
           tail=newNode;
        size++;
    }

    public T getValue(int index)
    {
        int i = 0;

        Node<T> temp = head;
        while(temp.getNext()!= null && i!=index)
        {
            i++;
            temp=temp.getNext();
        }
        return temp.getValue();
    }

    private Node<T> getNodeAt(int index)
    {
        int i = 0;

        Node<T> temp = head;
        while(temp.getNext()!= null && i!=index)
        {
            i++;
            temp=temp.getNext();
        }
        return temp;
    }

    public void delete(int index)
    {
        if (index == 0) {
            head = head.getNext();
            return;
        }

        Node<T> toDelete = getNodeAt(index);
        Node<T> previous = getNodeAt(index-1);
        Node<T> next = toDelete.getNext();

        previous.setNext(next);
        toDelete = null;
    }
}

