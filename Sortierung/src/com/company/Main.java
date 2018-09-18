package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int c;

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(8); a.add(7); a.add(4); a.add(10);
        a.add(3); a.add(170); a.add(11); a.add(-4);

        for(int i=1; i<a.size(); i++) {
            for(int j=0; j<a.size()-i; j++) {
                if(a.get(j)>a.get(j+1)) {
                    c=a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1, c);
                }
            }
        }
        for (int i = 0; i<a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }



    }
}
