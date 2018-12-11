
public class Main {

    public static void main(String[] args) {

        LinkedListg ll = new LinkedListg();
        ll.add(4);
        ll.add(8);
        ll.add(2);
        ll.add(1);
        System.out.println("Generic");
        LinkedListg ll2 = new LinkedListg();
        ll2.add("Miau");
        ll2.add("Blubb");
        ll2.add("Wuff");


        System.out.println(ll.getValue(2));
        ll.delete(2);
        System.out.println(ll.getValue(2));
        System.out.println("--------------------");
        System.out.println(ll2.getValue(0));
        ll2.delete(0);
        System.out.println(ll2.getValue(0));
    }
}
