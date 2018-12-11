public class LinkedList {

    private Node head = null;

    public LinkedList()
    {

    }

    public void add(int value){
        Node node = new Node(value);
        //List empty
        if(head == null) {
            head = node;
            return;
        }

        Node tmp = head;
        while (tmp.getNext()!=null)
        {
            tmp = tmp.getNext();
        }
        tmp.setNext(node);


    }

    public int getValue(int index)
    {
        int i = 0;

        Node temp = head;
        while(temp.getNext()!= null && i!=index)
        {
            i++;
            temp=temp.getNext();

        }
        return temp.getValue();
    }

    private Node getNodeAt(int index)
    {
        int i = 0;

        Node temp = head;
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

        Node toDelete = getNodeAt(index);
        Node previous = getNodeAt(index-1);
        Node next = toDelete.getNext();

        previous.setNext(next);
        toDelete = null;
    }

}

