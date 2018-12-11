package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int c;
        int x=0;


        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        Random zufall = new Random();
        for (int i=0; i<10; i++)
            a.add(zufall.nextInt(1000));

        for (int i = 0; i<a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
        int l = a.size();


        while (x<a.size()){
            for (int j = x; j < l - 1; j++) {
                if(a.get(j)>a.get(j+1)) {
                    c=a.get(j);
                    a.set(j,a.get(j+1));
                    b.add(c);
                }
            }
            l--;
            for (int j = x - 1; j >= 0; j--) {
                if(a.get(j)>a.get(j+1)) {
                    c=a.get(j);
                    a.set(j,a.get(j+1));
                    b.add(c);
                }
            }
            x++;
        }



        for (int i = 0; i<b.size(); i++) {
            System.out.print(b.get(i) + ", ");
        }



    }
    public static ArrayList<Integer> getRandomList (int size){

        ArrayList<Integer> a = new ArrayList<Integer>();
        Random zufall = new Random();
        for (int i=0; i<size; i++)
            a.add(zufall.nextInt(1000));

        for (int i = 0; i<a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();

        return a;
    }
}

