package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int c;
        ArrayList<Integer> a = new ArrayList<Integer>();

        Random zufall = new Random();
        for (int i=0; i<10; i++)
            a.add(zufall.nextInt(1000));


        for (int i = 0; i<a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }

        System.out.println();

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
