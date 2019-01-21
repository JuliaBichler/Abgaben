public class LinkedListg<T> {

    private NodeG<T> head = null;

    public LinkedListg() {}

    public void add(T value){
        NodeG<T> node = new NodeG<T>(value);

        if(head == null) {
            head = node;
            return;
        }

        NodeG<T> tmp = head;
        while (tmp.getNext()!=null)
        {
            tmp = tmp.getNext();
        }
        tmp.setNext(node);


    }

    public T getValue(int index)
    {
        int i = 0;

        NodeG<T> temp = head;
        while(temp.getNext()!= null && i!=index)
        {
            i++;
            temp=temp.getNext();

        }
        return temp.getValue();
    }

    private NodeG<T> getNodeAt(int index)
    {
        int i = 0;

        NodeG<T> temp = head;
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

        NodeG<T> toDelete = getNodeAt(index);
        NodeG<T> previous = getNodeAt(index-1);
        NodeG<T> next = toDelete.getNext();

        previous.setNext(next);
        toDelete = null;
    }

}

