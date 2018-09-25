package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int c;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        Random zufall = new Random();
        for (int i=0; i<8; i++)
            a.add(zufall.nextInt(100));

        for (int y = 0; y<a.size(); y++) {
            System.out.print(a.get(y) + ", ");
        }

        System.out.println();

        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    int temp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j, temp);
                }
            }
        }

        for (int i = 0; i<a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
    }
}
