package com.company;

public class Main {

    public static void main(String[] args){
        int a=8;
        modifyPrimitive(a);
        System.out.println(a);

        modifyPrimitiveInt(a);
        System.out.println(a);

        String s ="h";
        modifyString(s);
        System.out.println(s);

        DTContainer d = new DTContainer();
        modifyObject(d);
        System.out.println(d);


    }
    public static void modifyString(String s)
    {
        s="hallo";
    }
    public static void modifyObject(DTContainer c)
    {
        c.a=4;
        c.s="hallo";
    }
    public static void modifyPrimitive(int a)
    {
        a=5;
    }
    public static void modifyPrimitiveInt(Integer a)
    {
        a=5;
    }

}

