

public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(8);
        ll.add(2);
        ll.add(1);
        ll.add(100);
        ll.add(17);
        ll.add(9);
        ll.add(20);
        ll.add(34);
        ll.add(100);


        System.out.println(ll.getValue(2));
        ll.delete(2);
        System.out.println(ll.getValue(2));
    }
}
