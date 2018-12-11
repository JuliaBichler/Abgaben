package Code;

import Code.DLL;

public class Main {

    public static void main(String[] args) {

        DLL ll = new DLL();
        ll.addF(4);
        ll.addB(8);
        ll.addB(2);
        ll.addF(1);
        //1842
        System.out.println(ll.getValue(0));
        System.out.println(ll.getValue(1));
        System.out.println(ll.getValue(2));
        System.out.println(ll.getValue(3));

        System.out.println("Generic");
        DLL ll2 = new DLL();
        ll2.addF("Miau");
        ll2.addB("Blubb");
        ll2.addB("Wuff");
        System.out.println(ll2);
        System.out.println(ll2.getValue(0));
        System.out.println(ll2.getValue(1));
        System.out.println(ll2.getValue(2));
        //Miau,Wuff,Blubb


        System.out.println(ll.getValue(2));
        ll.delete(2);
        System.out.println(ll.getValue(2));
        System.out.println("--------------------");
        System.out.println(ll2.getValue(0));
        ll2.delete(0);
        System.out.println(ll2.getValue(0));
    }

    //https://java2blog.com/doubly-linked-list-java/
}
